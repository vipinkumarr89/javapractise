package com.vipin.Algos;

import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {
        int array[] = new int[5];
        Scanner S = new Scanner(System.in);
        for (int a = 0; a < array.length; a++) {
            array[a] = S.nextInt();
        }

        // Bubble Sort Logic
        for(int j=0;j < array.length-1;j++){
            for(int i=0;i < array.length-j-1;i++){
                if(array[i] > array[i+1]){
                    int temp = array[i+1];
                    array[i+1] = array[i];
                    array[i] = temp;
                }
            }
        }

        for (int a = 0; a < array.length; a++){
        System.out.println(array[a]);
        }
    }
}
