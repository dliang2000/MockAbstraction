package ca.waterloo.pl.mockfinder;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

import javassist.CannotCompileException;
import javassist.ClassPool;
import javassist.CtClass;
import javassist.CtMethod;
import javassist.NotFoundException;
import javassist.expr.ExprEditor;
import javassist.expr.MethodCall;

public class MockFinder {
	ClassPool classPool;
	ClassLoader classLoader;
	public static boolean isTestMethod = false;
	public static boolean instantiatedMock = false;
	public static int mockInstantiationCount = 0;
	public static int testRelatedMethodsCount = 0;
	public static int testRelatedMethodsInstantiatingMockCount = 0;
	public static Set<String> distinctPkgsInstantiatingMocks = new HashSet<String>();
	public static Set<String> distinctMockAPIsCalled = new HashSet<String>();
	
	public static void main(String[] args) {
		ClassPool pool = ClassPool.getDefault();
		String fileName = listFileCustom(new File("/calls-across-libs/libs-info-project-runner/projects")); 
		listOfFiles(pool, new File(fileName));

		BufferedWriter writer;
		try {
			writer = new BufferedWriter(new FileWriter("/calls-across-libs/libs-info-project-runner/api-surface-data/op.txt", true));
			writer.write(MockFinder.mockInstantiationCount+"\t"+MockFinder.testRelatedMethodsCount+"\t"
					+MockFinder.testRelatedMethodsInstantiatingMockCount+"\t"+MockFinder.distinctPkgsInstantiatingMocks.size()
					+"\t"+String.join(" ", MockFinder.distinctMockAPIsCalled)+"\n");
			writer.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}
	
	public static String listFileCustom(File f) {
		File filesList[] = f.listFiles();
	      for(File file : filesList) {
	    	  if (file.isDirectory()) {
	    		  return file.getAbsolutePath()+File.separator+"target"+File.separator+"test-classes";
	    	  }
	      }	
	      return "/calls-across-libs/libs-info-project-runner/projects";
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

    public static void findMockCalls(CtClass ctClass) throws NotFoundException {
                CtMethod[] methods = ctClass.getDeclaredMethods();
	            for (CtMethod method : methods) {
	            	isTestMethod = false;
	            	instantiatedMock = false;
	            	String callerMethodName = method.getName();
	            	System.out.println("method---"+callerMethodName);
	            	if (method.hasAnnotation("org.junit.Test")) {
	            		testRelatedMethodsCount++;
	            		isTestMethod = true;
	            	} else if (method.hasAnnotation("org.junit.Before")) {
	            		testRelatedMethodsCount++;
	            		isTestMethod = true;
	            	} else if (method.hasAnnotation("org.junit.After")) {
	            		testRelatedMethodsCount++;
	            		isTestMethod = true;
	            	} else if (callerMethodName.startsWith("test")) {
	            		testRelatedMethodsCount++;
	            		isTestMethod = true;
	            	} else if (callerMethodName.equals("setUp")) {
	            		testRelatedMethodsCount++;
	            		isTestMethod = true;
	            	} else if (callerMethodName.equals("tearDown")) {
	            		testRelatedMethodsCount++;
	            		isTestMethod = true;
	            	}
					
	            	try {
						method.instrument(
						        new ExprEditor() {
						        	// 1. Method Invocations
						            public void edit(MethodCall m) throws CannotCompileException {
						            	//System.out.println("method call---"+m.getMethodName()+"--"+m.getClassName()+"--"+m.getSignature());
						                try {
							            	String methodName = m.getMethodName();
							            	String methodCallerClassName = m.getClassName(); 
							            	String methodSignature = m.getSignature();
							            	
							            	if (methodCallerClassName.startsWith("org.easymock") || methodCallerClassName.startsWith("org.mockito")
							            			|| methodCallerClassName.startsWith("org.powermock")) {
							            		distinctMockAPIsCalled.add(methodCallerClassName+"::"+methodName+methodSignature);
							            	}
							            	
							            	if (methodName.equals("createMock") && methodSignature.equals("(Ljava/lang/Class;)Ljava/lang/Object;")
							            			&& methodCallerClassName.equals("org.easymock.EasyMock")) {
							            		mockInstantiationCount++;
							            		instantiatedMock = true;
							            		distinctPkgsInstantiatingMocks.add(method.getDeclaringClass().getPackageName());
							            	} else if (methodName.equals("mock") && methodSignature.equals("(Ljava/lang/Class;)Ljava/lang/Object;")
							            			&& methodCallerClassName.equals("org.mockito.Mockito")) {
							            		mockInstantiationCount++;
							            		instantiatedMock = true;
							            		distinctPkgsInstantiatingMocks.add(method.getDeclaringClass().getPackageName());
							            	} else if (methodName.equals("mock") && methodSignature.equals("(Ljava/lang/Class;)Ljava/lang/Object;")
							            			&& methodCallerClassName.equals("org.powermock.api.mockito.PowerMockito")) {
							            		mockInstantiationCount++;
							            		instantiatedMock = true;
							            		distinctPkgsInstantiatingMocks.add(method.getDeclaringClass().getPackageName());
							            	} else if (methodName.equals("verify") && methodSignature.equals("(Ljava/lang/Object;)Ljava/lang/Object;")
							            			&& methodCallerClassName.equals("org.mockito.Mockito")) {
							            		mockInstantiationCount++;
							            		instantiatedMock = true;
							            		distinctPkgsInstantiatingMocks.add(method.getDeclaringClass().getPackageName());
							            	} else if (methodName.equals("verify") && methodSignature.equals("(Ljava/lang/Object;)Ljava/lang/Object;")
							            			&& methodCallerClassName.equals("org.mockito.Mockito")) {
							            		mockInstantiationCount++;
							            		instantiatedMock = true;
							            		distinctPkgsInstantiatingMocks.add(method.getDeclaringClass().getPackageName());
							            	} else if (methodName.equals("verify") && methodSignature.equals("(Ljava/lang/Object;Lorg/mockito/verification/VerificationMode;)Ljava/lang/Object;")
							            			&& methodCallerClassName.equals("org.mockito.internal.MockitoCore")) {
							            		mockInstantiationCount++;
							            		instantiatedMock = true;
							            		distinctPkgsInstantiatingMocks.add(method.getDeclaringClass().getPackageName());
							            	} else if (methodName.equals("verify") && methodSignature.equals("(Ljava/lang/Object;)Ljava/lang/Object;")
							            			&& methodCallerClassName.equals("org.mockito.InOrder")) {
							            		mockInstantiationCount++;
							            		instantiatedMock = true;
							            		distinctPkgsInstantiatingMocks.add(method.getDeclaringClass().getPackageName());
							            	} else if (methodName.equals("verify") && methodSignature.equals("(Ljava/lang/Object;)Ljava/lang/Object;")
							            			&& methodCallerClassName.equals("org.mockito.internal.InOrderImpl")) {
							            		mockInstantiationCount++;
							            		instantiatedMock = true;
							            		distinctPkgsInstantiatingMocks.add(method.getDeclaringClass().getPackageName());
							            	} else if (methodName.equals("verify") && methodSignature.equals("(Ljava/lang/Object;Lorg/mockito/verification/VerificationMode;)Ljava/lang/Object;")
							            			&& methodCallerClassName.equals("org.mockito.internal.MockitoCore")) {
							            		mockInstantiationCount++;
							            		instantiatedMock = true;
							            		distinctPkgsInstantiatingMocks.add(method.getDeclaringClass().getPackageName());
							            	} else if (methodName.equals("verify") && methodSignature.equals("(Ljava/lang/Object;Lorg/mockito/verification/VerificationMode;)Ljava/lang/Object;")
							            			&& methodCallerClassName.equals("org.mockito.InOrder")) {
							            		mockInstantiationCount++;
							            		instantiatedMock = true;
							            		distinctPkgsInstantiatingMocks.add(method.getDeclaringClass().getPackageName());
							            	} else if (methodName.equals("verify") && methodSignature.equals("(Ljava/lang/Object;Lorg/mockito/verification/VerificationMode;)Ljava/lang/Object;")
							            			&& methodCallerClassName.equals("org.mockito.internal.InOrderImpl")) {
							            		mockInstantiationCount++;
							            		instantiatedMock = true;
							            		distinctPkgsInstantiatingMocks.add(method.getDeclaringClass().getPackageName());
							            	}
						                } catch (Exception e) {
						                        System.out.println("Exception while instrumenting "+e);
						                        e.printStackTrace();
						                }
						            }});
					} catch (CannotCompileException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
	            	if (isTestMethod && instantiatedMock) {
	            		testRelatedMethodsInstantiatingMockCount++;
	            	}
	            }
	}
}
