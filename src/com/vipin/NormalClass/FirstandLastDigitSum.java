package com.vipin.NormalClass;

public class FirstandLastDigitSum {
    static public void main(String[] args) {
        System.out.println("Sum of first and last digit is :" + sumFirstAndLastDigit(40));
        System.out.println("Sum of first and last digit is :" + sumFirstAndLastDigit(43));
        System.out.println("Sum of first and last digit is :" + sumFirstAndLastDigit(252));
    }

    public static int sumFirstAndLastDigit(int number) {
        int sum=0,sum2=0;
        int first;
        first = (number % 10);
        while(number > 1){
            sum2=number;
            number = number / 10;
        } sum=first+sum2;
        if (sum > 0)
            return (sum);
        else
            return -1;
    }
}
