package ca.uwaterloo.liang;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import soot.PackManager;
import soot.Scene;
import soot.SceneTransformer;
import soot.SootClass;
import soot.SootMethod;
import soot.Transform;
import soot.options.Options;
import soot.tagkit.AnnotationTag;

public class DriverGenerator {
    private static String packagename;
    private static String destination;
    private static String benchmark;
    private static String output_path;

    public static void main(String[] args) throws IOException {
        File file = new File(args[0]); 
        BufferedReader br = new BufferedReader(new FileReader(file)); 
        String line;
        List<String> lines = new ArrayList<String>();
        while ((line = br.readLine()) != null) {
            lines.add(line);
        }
        PackManager.v().getPack("wjtp").add(new Transform("wjtp.myTransform", DriverTransformer.v()) {
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
        DriverGenerator.packagename = lines.get(2);
        DriverGenerator.destination = lines.get(3);
        DriverGenerator.benchmark = lines.get(4);
        DriverGenerator.output_path = lines.get(5);
        System.out.println("process-dir: " + lines.get(0));
        System.out.println("soot_classpath: " + lines.get(1));
        System.out.println("packagename: " + lines.get(2));
        System.out.println("destination: " + lines.get(3));
        System.out.println("benchmark: " + lines.get(4));
        System.out.println("output_path: " + lines.get(5));
        
        for (String s: pd) {
            System.out.println("String in pd: " + s);
        }
        soot.Main.main(pd.toArray(new String[0]));
    }

    static class DriverTransformer extends SceneTransformer {
        private final static DriverTransformer instance = new DriverTransformer();

        private DriverTransformer() {
        }

        public static DriverTransformer v() {
            return instance;
        }

        @Override
        protected void internalTransform(String phaseName, Map options) {
            StringBuilder sb = driverHeader(packagename);
            StringBuilder sb2 = new StringBuilder();
            try {
                BufferedWriter writer = new BufferedWriter(new FileWriter(destination + "/Driver.java"));

                int counter = 1, error_counter = 1;
                String class_var = String.format("class%d", counter);
                String error_var = String.format("err%d", error_counter);
                Iterator<SootClass> classIt = Scene.v().getApplicationClasses().iterator();

                while (classIt.hasNext()) {
                    SootClass appClass = (SootClass) classIt.next();
                    
                    // skip classes that are final or not concrete, and classes that are not public
                    if (!appClass.isConcrete() || !appClass.isPublic() || appClass.getName().contains("$") || appClass.isLibraryClass())
                        continue;
                    
                    // skip the test classes with a constructor
                    if (containsConstructor(appClass, sb2)) 
                        continue;
                    
                    sb.append("\t\t" + appClass.getName() + " " + class_var + " = new " + appClass.getName() + "();\n");
                    Iterator<SootMethod> mIt = appClass.getMethods().iterator();
                    while (mIt.hasNext()) {
                        SootMethod sm = (SootMethod) mIt.next();
                        System.out.println("Declaring Class: " + sm.getDeclaringClass() + " Name: " + sm.getName());
                        System.out.println(sm.getSubSignature());
                        // check that the sootmethod is indeed a test case, and it is public 
                        // (or else the Driver class will likely not have the access to the method)
                        if (!isTestMethod(sm) || !sm.isPublic())
                            continue;;
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
                    counter++;
                    class_var = "class" + String.valueOf(counter);
                }
                sb.append("\t}\n" + "}");
                writer.write(sb.toString());
                writer.close();
                if (sb2.length() != 0) {
                    BufferedWriter writer2 = new BufferedWriter(new FileWriter(
                            output_path + "/" + benchmark + "_excluded_test_class_with_constructor.txt"));
                    writer2.write(sb2.toString());
                    writer2.close();
                }
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }

    private static StringBuilder driverHeader(String packagename) {
        StringBuilder str = new StringBuilder();
        str.append("package " + packagename + ";\n\n");
        str.append("public class Driver {\n" + "\tpublic static void main(String[] argv) {\n");
        return str;
    }
    
    private static boolean containsConstructor(SootClass sc, StringBuilder sb) {
        boolean containsConstructor = false;
        for (SootMethod sm : sc.getMethods()) {
            // exclude test classes with multi-arg constructor or private no-arg constructor
            if (sm.isConstructor() && (sm.getParameterCount() > 0 || sm.isPrivate())) {
                //System.out.println("Concrete SootClass " + sc.getName()
                //        + " has a multi-arg or private no-arg constructor.");
                sb.append(sc.getName() + "\n");
                containsConstructor = true;
            }
            // exclude test classes with constructor that throws exception
            if (sm.isConstructor() && !sm.getExceptions().isEmpty()) {
                //System.out.println("Concrete SootClass " + sc.getName()
                //+ " has a constructor throwing exception.");
                containsConstructor = true;
            }
        }
        return containsConstructor;
        
    }

    private static boolean isTestMethod(SootMethod sm) {
        // JUnit 3

        if (sm.getName().startsWith("test") && sm.getParameterCount() == 0 && sm.getReturnType().toString() == "void") {
            //System.out.println("Test case found: " + sm.getSubSignature());
            return true;
        }

        // JUnit 4+
        List<soot.tagkit.Tag> smTags = sm.getTags();
        soot.tagkit.VisibilityAnnotationTag tag = (soot.tagkit.VisibilityAnnotationTag) sm
                .getTag("VisibilityAnnotationTag");
        if (tag != null) {
            for (AnnotationTag annotation : tag.getAnnotations()) {
                if (annotation.getType().equals("Lorg/junit/Test;")) {
                    //System.out.println("Test case found: " + sm.getSignature());
                    return true;
                }
            }
        }
        return false;
    }
}
