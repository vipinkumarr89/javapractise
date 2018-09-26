//package com.vipin.FileHandling;
import java.io.File;
import java.io.IOException;

public class Delete {
    public static void main(String args[]) throws IOException{
        int k=0;
        while (args.length > k) {
            deleteDirectory(new File(args[0]));
            k++;
        }
    }
    public static boolean deleteDirectory(File dir) {
        if (dir.isDirectory()) {
            File[] children = dir.listFiles();
            for (int i = 0; i < children.length; i++) {
                boolean success = deleteDirectory(children[i]);
                if (!success) {
                    return false;
                }
            }
        }
         System.out.println("removing file or directory : " + dir.getName());
         return dir.delete();
    }
 }
