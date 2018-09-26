package com.vipin.NormalClass;

public class DigitSum {

    public static void main(String[] args) {
        System.out.println("Sum of Digit is : " +sumDigits(125));
        System.out.println("Sum of Digit is : " +sumDigits(321));
    }
    public static int sumDigits(int number){
        int var2=0,sum1=0;
        if(number >= 10){
            while(number > 0) {
                 var2 = number % 10;
                 number = number / 10;
                 sum1 = sum1 + var2;
            }
            return sum1;
        } else if(number < 10){
            return -1;
        } else
            return -1;
    }
}
