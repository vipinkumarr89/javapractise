package com.vipin.NormalClass;

import java.util.Scanner;

public class Primes {
    public static void main(String[] args) {
        int linecounter = 0;
        for (int i = 2; i <= 1000; i++) {
            int counter = 0;
            for (int j = i; j > 1; j--) {
                if (i % j == 0) {
                    counter += 1;
                }
            }
            if (counter == 1) {
                linecounter++;
                    System.out.format("%5d",i);
                if (linecounter % 10 == 0)
                    System.out.println("\n");
            }
        }
    }
}