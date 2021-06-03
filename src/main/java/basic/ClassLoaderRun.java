package basic;

import java.io.DataInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Array;
import java.lang.reflect.Method;
import java.util.Arrays;

//pass basic.Arrays_Demo in arguments.
public class ClassLoaderRun {

    public static void main(String args[]) throws Exception {
        String progClass = args[0];
        String progArgs[] = new String[args.length - 1];
        System.out.println("LENGTH----->  "+progArgs.length);  //Create blank array
        System.arraycopy(args, 1, progArgs, 0, progArgs.length);
        System.out.println("progArgs----->  "+ Arrays.toString(progArgs));
        CustomClassLoader ccl = new CustomClassLoader(ClassLoaderRun.class.getClassLoader());
        Class clas = ccl.loadClass(progClass);
        Class mainArgType[] = { (new String[0]).getClass() };
        Method main = clas.getMethod("main", mainArgType);
        Object argsArray[] = { progArgs };
        main.invoke(null, argsArray);
    }
}

class CustomClassLoader extends ClassLoader {

    public CustomClassLoader(ClassLoader parent) {
        super(parent);
    }

    @Override
    public Class loadClass(String name) throws ClassNotFoundException {
        System.out.println("Loading Class '" + name + "'");
        if (name.startsWith("basic")) {
            System.out.println("CustomClassLoader Used --->");
            return getClass(name);
        } else {
            System.out.println("Bootstrap Class Loader Used --->");
            return super.loadClass(name);
        }
    }

    private Class getClass(String name) throws ClassNotFoundException {
        String className = name.replace('.', File.separatorChar) + ".class";
        System.out.println("className ---> " + className);
        byte[] byteArray = null;
        try {
            byteArray = readDataAsBytes(className);
            Class c = defineClass(name, byteArray, 0, byteArray.length);
            resolveClass(c);
            return c;
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    private byte[] readDataAsBytes(String name) throws IOException {
        InputStream stream = getClass().getClassLoader().getResourceAsStream(name);
        byte buff[] = new byte[stream.available()];
        DataInputStream in = new DataInputStream(stream);
        in.readFully(buff);
        in.close();
        return buff;
    }
}
