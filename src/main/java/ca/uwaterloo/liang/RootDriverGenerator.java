package ca.uwaterloo.liang;
/* MockAnalysis
 * Copyright (C) 2021 Qian Liang <q8liang@uwaterloo.ca>
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the
 * Free Software Foundation, Inc., 59 Temple Place - Suite 330,
 * Boston, MA 02111-1307, USA.
 */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import com.beust.jcommander.Parameter;

import ca.uwaterloo.liang.util.Util;
import soot.BooleanType;
import soot.ByteType;
import soot.DoubleType;
import soot.FloatType;
import soot.IntType;
import soot.LongType;
import soot.PackManager;
import soot.Scene;
import soot.SceneTransformer;
import soot.ShortType;
import soot.SootClass;
import soot.SootMethod;
import soot.Transform;
import soot.Type;
import soot.VoidType;
import soot.options.Options;
import soot.tagkit.AnnotationTag;
import soot.util.Chain;

public class RootDriverGenerator {
    private static String rootPackageName;
    private static String destination;
    private static String benchmark;
    private static String output_path;
    
    
    private final static String PACKAGE_DRIVER = "Driver.java";
    private final static String ROOT_DRIVER = "RootDriver.java";
    
    private final static String GENERAL = "null";
    private final static String BOOL = "false";
    private final static String ZERO = "0";
    private final static String ZEROLONG = "0L";
    private final static String ZEROFLOAT = "0.0f";
    private final static String ZERODOUBLE = "0.0d";
    
    public static void main(String[] args) throws IOException {
        File file = new File(args[0]); 
        BufferedReader br = new BufferedReader(new FileReader(file)); 
        String line;
        List<String> lines = new ArrayList<String>();
        while ((line = br.readLine()) != null) {
            lines.add(line);
        }
        PackManager.v().getPack("wjtp").add(new Transform("wjtp.myTransform", RootDriverTransformer.v()) {
        });
        Options.v().set_prepend_classpath(true);
        Options.v().set_verbose(true);
        Options.v().set_whole_program(true);
        Options.v().set_output_format(1); // Output format in .jimple file
        Options.v().set_allow_phantom_refs(true);
        //List<String> setting = new ArrayList<String>();
        //setting.add("java.lang.Record");
        //Options.v().set_include_all(false);
        List<String> pd = new ArrayList<>();
        pd.add("-process-dir");
        pd.add(lines.get(0));
        Options.v().set_soot_classpath(lines.get(1));
        RootDriverGenerator.rootPackageName = lines.get(2);
        RootDriverGenerator.destination = lines.get(3);
        RootDriverGenerator.benchmark = lines.get(4);
        RootDriverGenerator.output_path = lines.get(5);
        System.out.println("process-dir: " + lines.get(0));
        System.out.println("soot_classpath: " + lines.get(1));
        System.out.println("Root Packagename: " + lines.get(2));
        System.out.println("Root Destination: " + lines.get(3));
        System.out.println("benchmark: " + lines.get(4));
        System.out.println("output_path: " + lines.get(5));
        
        for (String s: pd) {
            System.out.println("String in pd: " + s);
        }
        // needed for JDK 1.8.0+ somehow
        Scene.v().addBasicClass("android.os.Handler",SootClass.HIERARCHY);
        soot.Main.main(pd.toArray(new String[0]));
    }

    static class RootDriverTransformer extends SceneTransformer {
        private final static RootDriverTransformer instance = new RootDriverTransformer();

        private RootDriverTransformer() {
        }

        public static RootDriverTransformer v() {
            return instance;
        }

        @Override
        protected void internalTransform(String phaseName, Map options) {
            // One hashmap to maintain 
            HashMap<String, ArrayList<SootClass>> classes_map = new HashMap<String, ArrayList<SootClass>>();
            
            // HashSet to maintain all the sub-level packages
            HashSet<String> sub_packages = new HashSet<>();
            
            // Fill the map with {Package : List<SootClass>} entries:
            Chain<SootClass> appClasses = Scene.v().getApplicationClasses();
            
            for (SootClass appClass : appClasses) {
                String curr_package = appClass.getPackageName();
                
                if (!curr_package.startsWith(rootPackageName))
                    continue;
                
                if (classes_map.containsKey(curr_package)) {
                    ArrayList<SootClass> curr_list = classes_map.get(curr_package);
                    curr_list.add(appClass);
                    classes_map.put(curr_package, curr_list);
                } else {
                    ArrayList<SootClass> new_class_list = new ArrayList<SootClass>();
                    new_class_list.add(appClass);
                    classes_map.put(curr_package, new_class_list);
                }
                
                if (!curr_package.equals(rootPackageName) && !sub_packages.contains(curr_package))
                    sub_packages.add(curr_package);
            }
            
            // When the root package path does not have any class
            if (!classes_map.containsKey(rootPackageName)) {
                StringBuilder sb = constructRootDriver(rootPackageName, sub_packages, new ArrayList<SootClass>());
                
                String file_path = driverDestination(rootPackageName) + "/RootDriver.java";
                try {
                    BufferedWriter writer = new BufferedWriter(new FileWriter(file_path));
                    writer.write(sb.toString());
                    writer.close();
                    /*if (sb2.length() != 0) {
                        BufferedWriter writer2 = new BufferedWriter(new FileWriter(
                                output_path + "/" + packageName.replace('.', '_') + "_excluded_test_class_with_constructor.txt"));
                        writer2.write(sb2.toString());
                        writer2.close();
                    }*/
                } catch (IOException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
            
            for (Map.Entry<String, ArrayList<SootClass>> entry : classes_map.entrySet()) {
                String packageName = entry.getKey();
                ArrayList<SootClass> package_level_classes = entry.getValue();
                
                if (isRoot(packageName)) { // Construct rootDriver class
                    StringBuilder sb2 = new StringBuilder();
                    
                    StringBuilder sb = constructRootDriver(packageName, sub_packages, package_level_classes);
                    
                    String file_path = driverDestination(packageName) + "/RootDriver.java";
                    
                    try {
                        BufferedWriter writer = new BufferedWriter(new FileWriter(file_path));
                        writer.write(sb.toString());
                        writer.close();
                        /*if (sb2.length() != 0) {
                            BufferedWriter writer2 = new BufferedWriter(new FileWriter(
                                    output_path + "/" + benchmark + "_excluded_test_class_with_constructor.txt"));
                            writer2.write(sb2.toString());
                            writer2.close();
                        }*/
                    } catch (IOException e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                    }
                                        
                } else { // Package level driver class
                    StringBuilder sb2 = new StringBuilder();
                    
                    StringBuilder sb = constructSubPackageDriver(packageName, package_level_classes);
                    
                    String file_path = driverDestination(packageName) + "/Driver.java";
                    try {
                        BufferedWriter writer = new BufferedWriter(new FileWriter(file_path));
                        writer.write(sb.toString());
                        writer.close();
                        /*if (sb2.length() != 0) {
                            BufferedWriter writer2 = new BufferedWriter(new FileWriter(
                                    output_path + "/" + packageName.replace('.', '_') + "_excluded_test_class_with_constructor.txt"));
                            writer2.write(sb2.toString());
                            writer2.close();
                        }*/
                    } catch (IOException e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                    }
                    
                }
            }
        }
        
        
        private static StringBuilder constructRootDriver(String packageName, HashSet<String> sub_packages, 
                List<SootClass> sootclasses) {
            StringBuilder sb = driverHeader(packageName);
            
            int counter = 1, error_counter = 1;
            String class_var = String.format("class%d", counter);
            String error_var = String.format("err%d", error_counter);
            
            if (!sub_packages.isEmpty()) {
                for (String sub_package : sub_packages) {
                    sb.append("\t\t" + sub_package + ".Driver " + class_var + " = new " + sub_package + ".Driver();\n");
                    sb.append("\t\t" + class_var + ".runall();\n");
                    
                    counter++;
                    class_var = "class" + String.valueOf(counter);
                }
            }
            
            
            for (SootClass sootClass : sootclasses) {
                // skip classes that are final or not concrete, and classes that are not public
                if (!sootClass.isConcrete() || sootClass.getName().contains("$") 
                        || sootClass.isLibraryClass() || !Util.isTestClass(sootClass))
                    continue;
                
                // skip the test classes with a constructor
                if (containsPrivateConstructor(sootClass)) 
                    continue;
                
                List<Type> constructorParameterTypes = constructorParameterTypes(sootClass);

                if (constructorParameterTypes == null) {
                    sb.append("\t\t" + sootClass.getName() + " " + class_var + " = new " + sootClass.getName() + "();\n");
                } else {
                    StringBuilder paras = parameterGeneration(constructorParameterTypes.size(), constructorParameterTypes);
                    sb.append("\t\t" + sootClass.getName() + " " + class_var + " = new " + 
                                    sootClass.getName() + "(" + paras + ");\n");
                }
                List<SootMethod> sootMethods = sootClass.getMethods();
                for (SootMethod sm : sootMethods) {
                    System.out.println("Declaring Class: " + sm.getDeclaringClass() + " Name: " + sm.getName());
                    System.out.println(sm.getSubSignature());
                    // check that the sootmethod is indeed a test case, and it is non-private 
                    // (or else the Driver class will likely not have the access to the method)
                    if ( ( Util.isTestMethod(sm) || Util.isBeforeMethod(sm) || Util.isAfterMethod(sm) )
                            && !sm.isPrivate()) {
                        if (sm.getExceptions().isEmpty()) {
                            sb.append("\t\t" + class_var + "." + sm.getName() + "();\n");
                        } else {
                            sb.append("\t\ttry {\n");
                            sb.append("\t\t\t" + class_var + "." + sm.getName() + "();\n");
                            sb.append("\t\t}\n");
                            for (SootClass sc : sm.getExceptions()) {
                                sb.append("\t\tcatch (" + sc.getName().replace("$", ".") + " " + error_var + ") {\n");
                                sb.append("\t\t\t" + error_var + ".printStackTrace();\n");
                                sb.append("\t\t}\n");
                                error_counter++;
                                error_var = "err" + String.valueOf(error_counter);
                            }
                        }
                    }

                }
                counter++;
                class_var = "class" + String.valueOf(counter);
            }
            sb.append("\t}\n" + "}");
            
            return sb;
        }
        
        
        private static StringBuilder constructSubPackageDriver(String packageName, List<SootClass> sootClasses) {
            StringBuilder sb = driverHeader(packageName);
            
            int counter = 1, error_counter = 1;
            String class_var = String.format("class%d", counter);
            String error_var = String.format("err%d", error_counter);
            
            for (SootClass sootClass : sootClasses) {
                // skip classes that are final or not concrete
                if (!sootClass.isConcrete() || sootClass.getName().contains("$") 
                        || sootClass.isLibraryClass() || !Util.isTestClass(sootClass)) {
                    //System.out.println("SootClass " + sootClass.getName() + " excluded");
                    continue;
                }
                
                // skip the test classes with a constructor
                if (containsPrivateConstructor(sootClass)) {
                    continue;
                }
                
                List<Type> constructorParameterTypes = constructorParameterTypes(sootClass);

                if (constructorParameterTypes == null) {
                    sb.append("\t\t" + sootClass.getName() + " " + class_var + " = new " + sootClass.getName() + "();\n");
                } else {
                    StringBuilder paras = parameterGeneration(constructorParameterTypes.size(), constructorParameterTypes);
                    sb.append("\t\t" + sootClass.getName() + " " + class_var + " = new " + 
                                    sootClass.getName() + "(" + paras + ");\n");
                }
                //sb.append("\t\t" + sootClass.getName() + " " + class_var + " = new " + sootClass.getName() + "();\n");
                List<SootMethod> sootMethods = sootClass.getMethods();
                for (SootMethod sm : sootMethods) {
                    System.out.println("Declaring Class: " + sm.getDeclaringClass() + " Name: " + sm.getName());
                    System.out.println(sm.getSubSignature());
                    // check that the sootmethod is indeed a test case, and it is public 
                    // (or else the Driver class will likely not have the access to the method)
                    if ( ( Util.isTestMethod(sm) || Util.isBeforeMethod(sm) || Util.isAfterMethod(sm) )
                            && !sm.isPrivate()) {
                        if (sm.getExceptions().isEmpty()) {
                            sb.append("\t\t" + class_var + "." + sm.getName() + "();\n");
                        } else {
                            sb.append("\t\ttry {\n");
                            sb.append("\t\t\t" + class_var + "." + sm.getName() + "();\n");
                            sb.append("\t\t}\n");
                            for (SootClass sc : sm.getExceptions()) {
                                sb.append("\t\tcatch (" + sc.getName().replace("$", ".") + " " + error_var + ") {\n");
                                sb.append("\t\t\t" + error_var + ".printStackTrace();\n");
                                sb.append("\t\t}\n");
                                error_counter++;
                                error_var = "err" + String.valueOf(error_counter);
                            }
                        }
                    }

                }
                counter++;
                class_var = "class" + String.valueOf(counter);
            }
            sb.append("\t}\n" + "}");
            
            return sb;
        }
        
        private static String driverDestination(String packageName) {
            return isRoot(packageName) ? destination : destination + packageName.substring(rootPackageName.length()).replace('.', '/');
        }
        
        private static boolean isRoot(String packageName) {
            return packageName.equals(rootPackageName);
        }
        
        private static StringBuilder driverHeader(String packageName) {
            StringBuilder sb = new StringBuilder();
            if (isRoot(packageName)) {
                sb.append("package " + packageName + ";\n\n");
                sb.append("public class RootDriver {\n" + "\tpublic static void main(String[] argv) {\n");
            } else {
                sb.append("package " + packageName + ";\n\n");
                sb.append("public class Driver {\n" + "\tpublic void runall() {\n");
            }
            return sb;
        }
        
        private static boolean containsPrivateConstructor(SootClass sc) {
            boolean containsPrivateConstructor = false;
            for (SootMethod sm : sc.getMethods()) {
                // exclude test classes with private no-arg constructor
                if (sm.isConstructor() && sm.isPrivate()) {
                    //System.out.println("Concrete SootClass " + sc.getName()
                    //        + " has a multi-arg or private no-arg constructor.");
                    //sb.append(sc.getName() + "\n");
                    containsPrivateConstructor = true;
                }
                // exclude test classes with constructor that throws exception
                if (sm.isConstructor() && !sm.getExceptions().isEmpty()) {
                    //System.out.println("Concrete SootClass " + sc.getName()
                    //+ " has a constructor throwing exception.");
                    containsPrivateConstructor = true;
                }
            }
            return containsPrivateConstructor;
        }
        
        
        private static List<Type> constructorParameterTypes(SootClass sc) {
            for (SootMethod sm : sc.getMethods()) {
                // exclude test classes with private no-arg constructor
                if (sm.isConstructor() && sm.getParameterCount() > 0 ) {
                    //System.out.println("Concrete SootClass " + sc.getName()
                    //        + " has a multi-arg or private no-arg constructor.");
                    return sm.getParameterTypes();
                }
            }
            return null;
        }
        
        private static StringBuilder parameterGeneration(int numOfArgs, List<Type> parameterTypes) {
            StringBuilder sb = new StringBuilder();
            
            for (int i = 0; i < numOfArgs - 1; i++) {
                Type t = parameterTypes.get(i);
                if (t instanceof BooleanType) {
                    sb.append(BOOL + ","); 
                } else if (t instanceof ByteType || t instanceof IntType || t instanceof ShortType) {
                    sb.append(ZERO + ","); 
                } else if (t instanceof LongType) {
                    sb.append(ZEROLONG + ","); 
                } else if (t instanceof FloatType) {
                    sb.append(ZEROFLOAT + ","); 
                } else if (t instanceof DoubleType) {
                    sb.append(ZERODOUBLE + ","); 
                } else {
                    sb.append(GENERAL + ",");
                }
            }
            Type t = parameterTypes.get(numOfArgs - 1);
            if (t instanceof BooleanType) {
                sb.append(BOOL); 
            } else if (t instanceof ByteType || t instanceof IntType || t instanceof ShortType) {
                sb.append(ZERO); 
            } else if (t instanceof LongType) {
                sb.append(ZEROLONG); 
            } else if (t instanceof FloatType) {
                sb.append(ZEROFLOAT); 
            } else if (t instanceof DoubleType) {
                sb.append(ZERODOUBLE); 
            } else {
                sb.append(GENERAL);
            }
            return sb;
        }
    }
    
    /*private static boolean isBeforeMethod(SootMethod sm) {
        // JUnit 3
        if ((sm.getName().equals("init()") ||  sm.getName().equals("setUp()")) 
                && sm.getParameterCount() == 0 && sm.getReturnType() instanceof VoidType) {
            //System.out.println("Test case found: " + sm.getSubSignature());
            return true;
        }

        // JUnit 4+
        List<soot.tagkit.Tag> smTags = sm.getTags();
        soot.tagkit.VisibilityAnnotationTag tag = (soot.tagkit.VisibilityAnnotationTag) sm
                .getTag("VisibilityAnnotationTag");
        if (tag != null) {
            for (AnnotationTag annotation : tag.getAnnotations()) {
                if (annotation.getType().equals("Lorg/junit/Before;") || annotation.getType().equals("Lorg/junit/BeforeClass;")
                        || annotation.getType().equals("Lorg/junit/jupiter/api/BeforeEach;") 
                        || annotation.getType().equals("Lorg/junit/jupiter/api/BeforeAll;")) {
                    //System.out.println("Test case found: " + sm.getSignature());
                    return true;
                }
            }
        }
        return false;
    }
    
    private static boolean isAfterMethod(SootMethod sm) {
        // JUnit 3
        if (sm.getName().equals("tearDown()") 
                && sm.getParameterCount() == 0 && sm.getReturnType() instanceof VoidType) {
            //System.out.println("Test case found: " + sm.getSubSignature());
            return true;
        }

        // JUnit 4+
        List<soot.tagkit.Tag> smTags = sm.getTags();
        soot.tagkit.VisibilityAnnotationTag tag = (soot.tagkit.VisibilityAnnotationTag) sm
                .getTag("VisibilityAnnotationTag");
        if (tag != null) {
            for (AnnotationTag annotation : tag.getAnnotations()) {
                if (annotation.getType().equals("Lorg/junit/After;") || annotation.getType().equals("Lorg/junit/AfterClass;")
                        || annotation.getType().equals("Lorg/junit/jupiter/api/AfterEach;") 
                        || annotation.getType().equals("Lorg/junit/jupiter/api/AfterAll;")) {
                    //System.out.println("Test case found: " + sm.getSignature());
                    return true;
                }
            }
        }
        return false;
    }

    private static boolean isTestMethod(SootMethod sm) {
        // JUnit 3
        if (sm.getName().startsWith("test") && sm.getParameterCount() == 0 && sm.getReturnType() instanceof VoidType) {
            //System.out.println("Test case found: " + sm.getSubSignature());
            return true;
        }

        // JUnit 4+
        List<soot.tagkit.Tag> smTags = sm.getTags();
        soot.tagkit.VisibilityAnnotationTag tag = (soot.tagkit.VisibilityAnnotationTag) sm
                .getTag("VisibilityAnnotationTag");
        if (tag != null) {
            for (AnnotationTag annotation : tag.getAnnotations()) {
                if (annotation.getType().equals("Lorg/junit/Test;") 
                        || annotation.getType().equals("Lorg/junit/jupiter/api/Test;")) {
                    //System.out.println("Test case found: " + sm.getSignature());
                    return true;
                }
            }
        }
        return false;
    }*/
}
