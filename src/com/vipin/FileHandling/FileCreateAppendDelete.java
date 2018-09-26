package com.vipin.FileHandling;
import java.io.*;

public class FileCreateAppendDelete {
    public static void main(String[] args)  throws IOException {
    String file1 = args[0];
        File file = new File(file1);
        file.createNewFile();
        System.out.println("File Created in location "+file.getPath());

          FileOutputStream fileopen = new FileOutputStream(file);
          String str = "this is vipin kumar testing 2";
          char arr[] = str.toCharArray();
            for(int i=0;i<str.length();i++) {
                fileopen.write(arr[i]);
            }

          FileInputStream  fileread2 = new FileInputStream(file);
          int readData;
          do{
              readData = fileread2.read();
              if(readData!=-1) {
                  System.out.print((char) readData);
              }
          }while(readData != -1);
    }
}
