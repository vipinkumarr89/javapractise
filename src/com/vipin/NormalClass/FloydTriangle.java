package com.vipin.NormalClass;

import com.sun.tools.javac.comp.Enter;

import java.util.Scanner;

public class FloydTriangle {
    public static void main(String[] args) {
        System.out.println("Enter the number of rows for floyd triangle");
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int k=1;
        System.out.println("Number of row in floyd triangle will be :" +x);
        System.out.println("floyd triangle");
        System.out.println("*********************");
        for(int i=1;i<=x;i++){
            for(int j=1;j<=i;j++){
                System.out.print(k++ +" ");
            }
            System.out.print(" \n");
        }
    }
}



//    Enter the number of rows for floyd's triangle:
//        6
//        Floyd's triangle
//        ****************
//        1
//        2 3
//        4 5 6
//        7 8 9 10
//        11 12 13 14 15
//        16 17 18 19 20 21
