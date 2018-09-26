package com.vipin.Algos;

import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        int array[] = new int[5];
        Scanner S = new Scanner(System.in);
        for (int a = 0; a < array.length; a++) {
            array[a] = S.nextInt();
        }
        System.out.println("Array loading completed");
        // Linear Search logic

        Scanner searchitem = new Scanner(System.in);
        int x;
        x = searchitem.nextInt();
        System.out.println("Search Item is :" + x);
        int i = 0, n = array.length;
        for (i = 0; i < n; i++)
            if (array[i] == x) {
                System.out.println("Search Index location is :" + i);
                i++;
            }

        if (i == n) {
            System.out.println("Number is not in the array");
        }
    }
}




