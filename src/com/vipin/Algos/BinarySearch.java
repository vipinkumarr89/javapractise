package com.vipin.Algos;

import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        int[] array = new int[5];
        Scanner x = new Scanner(System.in);
        for (int i = 0; i < array.length; i++) {
            array[i] = x.nextInt();
        }

        System.out.println("Enter the Element to Search");
        Scanner Searchitem = new Scanner(System.in);
        int desired = Searchitem.nextInt();
        System.out.println("desired number is :" + desired);
        int min = 0;
        int max = array.length - 1;
        System.out.println("min index number is :" +min);
        System.out.println("max index number is :" +max);
        while (min <= max){
            int mid=((min+max)/2);
            if(array[mid] == desired) {
                System.out.println("Searched Element Index value is :" +mid);
                break;
            }
            if(array[mid] > desired)
                max = mid - 1;
            else
                min = mid + 1;
        }
        if(min > max)
        System.out.println("no output found");
    }
}
