package EdurekaHW.module5;

import java.io.File;


public class FileTest1 {


    public static void main(String[] args) {

        File f = new File("/tmp/file.txt");

        System.out.println("Exists- " + f.exists());

        if (f.exists()) {

            System.out.println("Name- " + f.getName());

            System.out.println("Path- " + f.getPath());

            System.out.println("Parent- " + f.getParent());

            System.out.println("Is Absolute Path- " + f.isAbsolute());

            System.out.println("Absolute Path- " + f.getAbsolutePath());

            System.out.println("Size- " + f.length() + " bytes");

            System.out.println("Can Read- " + f.canRead());

            System.out.println("Can Write- " + f.canWrite());

            System.out.println("Is Hidden- " + f.isHidden());


            long time = f.lastModified();
            System.out.println(time);

            java.util.Date mdate = new java.util.Date(time);

            System.out.println("First.java is modified on- " + mdate);


            System.out.println("Is File- " + f.isFile());

            System.out.println("Is Directory- " + f.isDirectory());

        }


        File ff = new File("/tmp/output");

        if (!ff.exists() || !ff.isDirectory()) {

            ff.mkdir();
        }
        System.out.println(ff.getPath());

    }
}