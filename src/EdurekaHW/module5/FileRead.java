package EdurekaHW.module5;

import java.io.FileInputStream;

import java.io.BufferedReader;

import java.io.FileInputStream;

import java.io.InputStreamReader;


public class FileRead {


    public static void main(String[] args) throws Exception {

        FileInputStream fin = new FileInputStream("/tmp/Alphabets.txt");

        System.out.println("No of bytes to be read = "+ fin.available());
        System.out.println((char)fin.read());//65
        System.out.println(fin.read());
        System.out.println((char)fin.read());

        System.out.println("No of bytes to be read = "+ fin.available());

//read the file content byte-by-byte
//
//        int n = fin.read();
//
//        while (n != -1) {
//
//            System.out.print((char) n);
//
//            Thread.sleep(100);
//
//            n = fin.read();
//        }
    }
}
