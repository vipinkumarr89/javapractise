package com.vipin.Algos;

import java.util.Scanner;

public class SelectionSort {
    public static void main(String[] args) {
        System.out.println("Enter the Element to Sort");
        int array[] = new int[5];
        Scanner x = new Scanner(System.in);
        for (int i = 0; i < array.length; i++) {
            array[i] = x.nextInt();
        }

        for(int j=0;j<array.length-1;j++){
            int imin = j;
            for(int k=j+1;k<array.length;k++){
                if(array[k]<array[imin]){
                   imin=k;
                }
                int temp = array[k];
                array[k]=array[j];
                array[j]=temp;
            }
        }
        System.out.println("Sorted Array by Insertion sort is - ");
        for(int i=0;i<array.length;i++){
            System.out.println(array[i]);
        }
    }
}
