package com.vipin.Algos;

import java.util.Scanner;

public class InsertionSort {
    public static void main(String[] args) {
        System.out.println("Enter the Element to Sort");
        int array[] = new int[5];
        Scanner x = new Scanner(System.in);
        for (int i = 0; i < array.length; i++) {
            array[i] = x.nextInt();
        }

        for(int j=1;j<array.length;j++){
            while (j > 0 && (array[j] < array[j-1])){
                int temp = array[j];
                array[j]=array[j-1];
                array[j-1]=temp;
                j--;
            }
        }
        System.out.println("Sorted Array by Insertion sort is - ");
        for(int i=0;i<array.length;i++){
            System.out.println(array[i]);
        }
    }
}