package ca.waterloo.pl.mockreachabilitychecker;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.jar.JarEntry;
import java.util.jar.JarInputStream;

import org.apache.maven.shared.invoker.DefaultInvocationRequest;
import org.apache.maven.shared.invoker.DefaultInvoker;
import org.apache.maven.shared.invoker.InvocationRequest;
import org.apache.maven.shared.invoker.Invoker;
import org.apache.maven.shared.invoker.MavenInvocationException;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import javassist.CannotCompileException;
import javassist.ClassPool;
import javassist.CtClass;
import javassist.CtMethod;
import javassist.NotFoundException;
import javassist.expr.ExprEditor;
import javassist.expr.MethodCall;

public class MockReachabilityChecker {
	ClassPool classPool;
	ClassLoader classLoader;
	public static boolean isTestMethod = false;
	public static Map<String, ArrayList<Object>> libsToClasses = new HashMap<String, ArrayList<Object>>();
	public static Map<String, List<String>> superToSubClasses = new HashMap<String, List<String>>();
	public static Set<String> methodsReachableFromTests = new HashSet<String>();
	public static Set<String> methodsReachableFromInvs = new HashSet<String>();
	public static Set<String> mockInvocations = new HashSet<String>();
	public static int countMethodsReachableFromInvs = 0;
	public static FileWriter writer;
	
	public static void main(String[] args) {
		ClassPool pool = ClassPool.getDefault();
		
		JSONParser jsonParser = new JSONParser();
        try (FileReader reader = new FileReader(new File(".").getAbsolutePath()+File.separator+"projects"+File.separator+"projects-list.json")) {
            Object obj = jsonParser.parse(reader);
            JSONArray projects = (JSONArray) obj;
            JSONArray mvnProjects = new JSONArray();
            Iterator<JSONObject> iterator = projects.iterator();
            while (iterator.hasNext()) {
            	JSONObject projectObject = (JSONObject)iterator.next();
        		mvnProjects.add(projectObject);	
            }
            initlibsToClasses("maven", mvnProjects);            
            
            for (String dep: libsToClasses.keySet()) {
        		try {
        			pool.appendClassPath((String)libsToClasses.get(dep).get(1));
    			} catch (NotFoundException e) {
    			} catch (Exception e) {
    				e.printStackTrace();
    			}
        	}

            for (String dep: libsToClasses.keySet()) {
        		String[] classes = ((String)libsToClasses.get(dep).get(0)).split(":");
        		for (int i=0; i<classes.length; i++) {
        			System.out.println(classes[i]);
        			try {
            			CtClass ctcls = pool.get(classes[i]);
            			getClassHierarchies(ctcls);
        			} catch (NotFoundException e) {
        			}  catch (Exception e) {
        				
        			}
        		}
        	}

            Iterator<JSONObject> it = projects.iterator();
            while (it.hasNext()) {
            	JSONObject projectObject = (JSONObject)it.next();
            	addMockInvsToLList((String)projectObject.get("libName"));
        		String pathToProject = new File(".").getAbsolutePath()+File.separator+"projects"+File.separator+projectObject.get("execDir")+File.separator+"target"+File.separator+"test-classes";
        		listOfFiles(pool, new File(pathToProject)); 
            }
        } catch (Exception e) {
			System.out.println("Error while reading file with project list " + e.toString() + e);
			e.printStackTrace();
		}
        try {
			writer.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void addMockInvsToLList(String libName) {
		String row;
		BufferedReader freader;
		try {
			freader = new BufferedReader(new FileReader(new File(".").getAbsolutePath()+File.separator+"csvs"+File.separator+libName+"-isMockInvocation.tsv"));
			writer = new FileWriter(new File(".").getAbsolutePath()+File.separator+"csvs"+File.separator+libName+"-reachabilityInfo.tsv", false);
			writer.write("Test-related Method\tTotal # Nodes Reachable From Method\t# Nodes Reachable From Mock Invocations\n");
			while ((row = freader.readLine()) != null) {
	            String[] data = row.split("\t");
	            String mockInv = data[1].replace('<', ' ');
	            mockInv = mockInv.replace('"', ' ').trim();
	            mockInv = mockInv.replace('>', ' ').trim();
	            mockInv = mockInv.replace(':', ' ').trim();
	            mockInv = mockInv.split(" ")[0]+"::"+mockInv.split(" ")[3];
	            mockInvocations.add(mockInv.split("\\(")[0]);
	        }
	        freader.close();
		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}
	
	public static void listOfFiles(ClassPool pool, File dirPath) {
		try {
	      File filesList[] = dirPath.listFiles();
	      for(File file : filesList) {
	         if(file.isFile()) {
	        	String fileName = file.getAbsolutePath();
	            if (fileName.endsWith(".class")) {
	            	CtClass ctClass = pool.makeClass(new FileInputStream(fileName));
	            	findMockCalls(ctClass);
	            }
	         } else {
	            listOfFiles(pool, file);
	         }
	      }
		} catch (IOException e) {
			System.out.println(e);
		} catch (NotFoundException e) {
			System.out.println(e);
		}
		
	}
	
	
	public static void getClassHierarchies(CtClass ctClass) {
    	String methodCallerClassName = ctClass.getName();  
        try {
            // 3. Subtyping ( extends / implements )
            CtClass superClass = ctClass.getSuperclass();
            if (superClass!=null) {
                String superClassName = superClass.getName();
                superToSubClasses.putIfAbsent(superClassName, new ArrayList<String>());
                superToSubClasses.get(superClassName).add(methodCallerClassName);      
            }

            CtClass[] interfaces = ctClass.getInterfaces();
            if (interfaces!=null) {
                for (CtClass interfaceClass : interfaces) {
                    String interfaceName = interfaceClass.getName();
                    superToSubClasses.putIfAbsent(interfaceName, new ArrayList<String>());
                    superToSubClasses.get(interfaceName).add(methodCallerClassName);
                }
            }
	    } catch (Exception e) {
		}
	}
	
	public static void initlibsToClasses(String build, JSONArray projects) {
		libsToClasses.clear();

		Iterator<JSONObject> iterator = projects.iterator();
        while (iterator.hasNext()) {
        	JSONObject projectObject = (JSONObject)iterator.next();
    		String pathToJar="", pathToRootPrj = "";
    		pathToJar = File.separator+"target"+File.separator+projectObject.get("generatedJarName")+".jar";
    		
    		String pathToProject = new File(".").getAbsolutePath()+File.separator+"projects"+File.separator+projectObject.get("execDir");
        	String generatedJarName = pathToProject+File.separator+pathToJar;
        	String tmpFolder = new File(".").getAbsolutePath()+File.separator+"projects"+File.separator+projectObject.get("execDir")+File.separator+"tmp";
        	String libName = (String)projectObject.get("libName");
        	ArrayList<Object> countsAndClasses = getPublicProtectedMethodsCountAndClasses(generatedJarName, tmpFolder, pathToProject, pathToRootPrj, build, libName, (long) projectObject.get("javaVersion"));
        	libsToClasses.putIfAbsent(libName, new ArrayList<Object>(Arrays.asList("", generatedJarName)));
        	ArrayList<Object> libVals = libsToClasses.get(libName);
        	libVals.set(0, ((String)libVals.get(0)).concat((String)countsAndClasses.get(0)));
        }
	}
	
	public static ArrayList<Object> getPublicProtectedMethodsCountAndClasses(String crunchifyJarName, String tmpFolder, 
			String pathToProject, String pathToRootPrj, String build, String libName, long javaVersion) {
			File destDir = new File(tmpFolder);
			if (!destDir.exists()) {
				destDir.mkdir();
			}
			HashMap<String, String> deps = new HashMap<String, String>();
			deps = mvnGetDependencies(destDir, javaVersion);
			
			List<URL> classLoaderURLs = new ArrayList();//new ArrayList<>();
			try {
				classLoaderURLs.add(new File(crunchifyJarName).toURI().toURL());
				for (String dependency : deps.keySet()) {
					classLoaderURLs.add(new File(deps.get(dependency)).toURI().toURL());
				}
			} catch (MalformedURLException e) {
			}

			URL[] classLoaderURLsAsArray = new URL[classLoaderURLs.size()];
			URLClassLoader child = new URLClassLoader(classLoaderURLs.toArray(classLoaderURLsAsArray),
					MockReachabilityChecker.class.getClass().getClassLoader());

			for (String dependency : deps.keySet()) {
				addDependencyToLibsInfo(dependency.trim(), new File(deps.get(dependency)), child);
			}

			deleteDirectory(destDir);
			return getDatafromJar(new File(crunchifyJarName), child, libName.trim());
	}
	
	public static HashMap<String, String> mvnGetDependencies(File tmpDir, long javaVersion) {
		HashMap<String, String> dependencies = new HashMap<String, String>();
		InvocationRequest request = new DefaultInvocationRequest();
		File pomFile = new File(tmpDir.getParent()+File.separator+"pom.xml"); 
		request.setPomFile(pomFile);
		request.setGoals(Arrays.asList("dependency:list"));
		request.setMavenOpts("-DoutputFile="+tmpDir.getPath()+File.separator+"deps-output.txt -DoutputAbsoluteArtifactFilename=true");
		
		//System.setProperty("maven.home", "/usr/share/maven");
		System.setProperty("maven.home", "/opt/homebrew/Cellar/maven/3.8.4/libexec");
		Invoker invoker = new DefaultInvoker();
		try {
			invoker.execute( request );
		} catch (MavenInvocationException e) {
			e.printStackTrace();
		}
		
		request.setMavenOpts("-DappendOutput=true -DoutputFile="+tmpDir.getPath()+File.separator+"deps-output.txt -DoutputAbsoluteArtifactFilename=true");
		try {
			invoker.execute( request );
		} catch (MavenInvocationException e) {
			e.printStackTrace();
		}
		
		try {
			String[] rows = new String[(int) new File(tmpDir.getPath()+File.separator+"deps-output.txt").length()]; String row; int count = 0;
			BufferedReader reader = new BufferedReader(new FileReader(tmpDir.getPath()+File.separator+"deps-output.txt"));
			while ((row = reader.readLine()) != null) {
				rows[count++] = row;
			}
			reader.close();
			String[] depsData = new String[10];
			for (String rowString : rows) {
				if (rowString!=null)
					depsData = rowString.split(":");
				if (depsData.length>0 && new File(depsData[depsData.length-1]).exists()) {
					depsData[0].trim();
					dependencies.put(String.join(":", depsData[0], depsData[1], depsData[3]), depsData[depsData.length-1]);
				}
			}
		} catch (IOException ex) {
		    ex.printStackTrace();
		}
		return dependencies;
	}
	
	public static void addDependencyToLibsInfo(String dependencyName, File dependency, URLClassLoader child) {
		if (!dependency.getName().endsWith(".jar"))
			return;
		if (libsToClasses.containsKey(dependencyName))
			return;
		ArrayList<Object> countsAndClasses = getDatafromJar(dependency, child, dependencyName);
		libsToClasses.putIfAbsent(dependencyName, new ArrayList<Object>(Arrays.asList((String)countsAndClasses.get(0), dependency.getPath())));
	}
	
	private static void deleteDirectory(File fileOrDirectory) {
		if (fileOrDirectory.isDirectory())
			for (File child : fileOrDirectory.listFiles())
				deleteDirectory(child);

		fileOrDirectory.delete();
	}
	
	private static ArrayList<Object> getDatafromJar(File dependency, URLClassLoader child, String dependencyName) {
		Set<String> classNames = new HashSet<String>();

		try {
			JarInputStream crunchifyJarFile = new JarInputStream(new FileInputStream(dependency));
			JarEntry crunchifyJar;
			while (true) {
				crunchifyJar = crunchifyJarFile.getNextJarEntry();
				if (crunchifyJar == null) {
					break;
				}

				if ((crunchifyJar.getName().endsWith(".class"))) {
					String completeClassName = crunchifyJar.getName().replaceAll("/", "\\.");
					String className = completeClassName.substring(0, completeClassName.lastIndexOf('.'));
					classNames.add(className);
				}
			}
			crunchifyJarFile.close();
		} catch (Exception e) {
			System.out.println(e);
		}

		return new ArrayList<Object>(Arrays.asList(String.join(":", classNames)));
	}

	

    public static void findMockCalls(CtClass ctClass) throws NotFoundException {
                CtMethod[] methods = ctClass.getDeclaredMethods();
                
	            for (CtMethod method : methods) {
	            	methodsReachableFromTests.clear();
	            	countMethodsReachableFromInvs = 0;
	            	isTestMethod = false;
	            	String callerMethodName = method.getName();
	            	if (method.hasAnnotation("org.junit.Test")) {
	            		isTestMethod = true;
	            	} else if (method.hasAnnotation("org.junit.Before")) {
	            		isTestMethod = true;
	            	} else if (method.hasAnnotation("org.junit.After")) {
	            		isTestMethod = true;
	            	} else if (callerMethodName.startsWith("test")) {
	            		isTestMethod = true;
	            	} else if (callerMethodName.equals("setUp")) {
	            		isTestMethod = true;
	            	} else if (callerMethodName.equals("tearDown")) {
	            		isTestMethod = true;
	            	}
	            	if (isTestMethod) {
	            		System.out.println("------test-------"+callerMethodName);
	            		findReachableNodes(methodsReachableFromTests, method);
	            		//System.out.println(methodsReachableFromTests.toString());
	            		//System.out.println(methodsReachableFromTests.size());
	            		
		            	try {
		        			method.instrument(
		        			        new ExprEditor() {
		        			        	// 1. Method Invocations
		        			            public void edit(MethodCall m) throws CannotCompileException {
		        			            	if (mockInvocations.contains(m.getClassName()+"::"+m.getMethodName())) {
		        			            		methodsReachableFromInvs.clear();
		        			            		System.out.println("------mock-------"+m.getMethodName());
		        			            		try {
													findReachableNodes(methodsReachableFromInvs, m.getMethod());
												} catch (NotFoundException e) {
													e.printStackTrace();
												}
		        			            		System.out.println(methodsReachableFromInvs.toString());
		        			            		countMethodsReachableFromInvs+=methodsReachableFromInvs.size();
		        			            	}
		        			            }});
		        		} catch (CannotCompileException e) {
		        			e.printStackTrace();
		        		}
		            	try {
		            		if (methodsReachableFromTests.size() > countMethodsReachableFromInvs) // this condition is needed because sometimes Javassist throws exceptions
		            			writer.write(method.getDeclaringClass().getName()+"::"+method.getName()+method.getSignature()+"\t"
									+methodsReachableFromTests.size()+"\t"+countMethodsReachableFromInvs+"\n");
						} catch (IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
	            	}
	            }
	}
    
    public static void findReachableNodes(Set<String> visited, CtMethod method) {
    	String methodName = method.getDeclaringClass().getName()+"::"+method.getName()+method.getSignature();
    	visited.add(methodName);
    	try {
			method.instrument(
			        new ExprEditor() {
			        	// 1. Method Invocations
			            public void edit(MethodCall m) throws CannotCompileException {
			            	//System.out.println("method call---"+m.getMethodName()+"--"+m.getClassName()+"--"+m.getSignature());
			                try {
				            	String invMethodName = m.getClassName()+"::"+m.getMethodName()+m.getSignature();
				            	if (!visited.contains(invMethodName)) {
				            		findReachableNodes(visited, m.getMethod());
				            	}
			                } catch (Exception e) {
			                        System.out.println("Exception while instrumenting "+e);
			                        e.printStackTrace();
			                }
			            }});
		} catch (CannotCompileException e) {
			e.printStackTrace();
		}
    }
}
