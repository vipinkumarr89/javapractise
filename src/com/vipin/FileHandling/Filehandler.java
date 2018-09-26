package com.vipin.FileHandling;

import java.io.File;

public class Filehandler {
    public static void main(String[] args) {
        listDirectory("/tmp/bdb/file.txt");
        deleteDirectory("/tmp/bdb/file.txt");
    }

    public static void listDirectory(String path){
        File file = new File(path);
        if(file.exists()){
            System.out.println("File Exist in below location\n"+path);
        }else
            System.out.println(path+" File doesn't exist");
    }

    public static void deleteDirectory(String path) {

        File file  = new File(path);
        if(file.isDirectory()){
            String[] childFiles = file.list();
            if(childFiles == null) {
                //Directory is empty. Proceed for deletion
                file.delete();
            }
            else {
                for (String childFilePath :  childFiles) {
                    deleteDirectory(childFilePath);
                }
            }

        }
        else {
            file.delete();
            System.out.println("File Deleted Successfully");
        }

    }
}