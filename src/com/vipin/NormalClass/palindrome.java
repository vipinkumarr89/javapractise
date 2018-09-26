package com.vipin.NormalClass;

import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        input.close();
        System.out.println("Entered number is :"+number);

        int sum=0;
        int number1 = number;
        while(number1 > 0) {
            int r = (number1 % 10);
            sum = r + sum*10;
            number1 = (number1 / 10);
        };
            System.out.println("Value of sum is "+sum);

        System.out.println("Value of sum is "+sum);
        if(number == sum) {
            System.out.println("Number is palindrome");
        }
        else
            System.out.println("Number is not palindrome");
    }
}