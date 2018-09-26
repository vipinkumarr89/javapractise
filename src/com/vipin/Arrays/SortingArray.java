package com.vipin.Arrays;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class SortingArray {

    public int arrayLength(){
        System.out.println("Enter the length of Array");
        Scanner scanner1 = new Scanner(System.in);
        return scanner1.nextInt();
    }

    public int[] getIntegers(int length) {
        System.out.println("length of the Array is " + length);
        System.out.println("Please Enter the value\n");
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[length];
        for (int i = 0; i < length; i++) {
            array[i] = scanner.nextInt();
        }
        return array;
    }

    public void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("Array Value is " + array[i]);
        }
    }

    public void sortArray(int[] array) {
        Arrays.sort(array);
        for (int i = 0; i < array.length; i++) {
            System.out.println("Sorted Array is " + array[i]);
        }
    }

    public void rsortArray1(int[] array) {
        Arrays.sort(array);
        for (int i = array.length-1; i > -1; i--) {
            System.out.println("Reversed Sorted Array is " + array[i]);
        }
    }

    public void rsortArray2(int[] array) {
        int midlength = array.length;
        int maxIndex = array.length -1;
        for (int i = 0;i < midlength;i++) {
            int temp = array[i];
            array[i] = array[maxIndex-i];
            array[maxIndex-i] = temp;
        }
        for (int i = 0; i < array.length; i++) {
            System.out.println("rev Array Value is " + array[i]);
        }
    }

    public void printMinValue(int[] array){
       Arrays.sort(array);
        System.out.println("lowest value = "+array[0]);
    }
}