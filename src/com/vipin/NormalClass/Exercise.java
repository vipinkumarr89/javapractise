package com.vipin.NormalClass;

public class Exercise {

    public static boolean isOdd(int number) {
        if (number > 0) {
            if (number % 2 != 0)
                return true;
        }
        return false;
    }

    public static int sumOdd(int start, int end) {
        int sum = 0;
        if (start > 0 && end > 0){
            for (int i = start; end > i; i++) {
                if(isOdd(i)) {
                    sum += i;
                }
            }
            return sum;
        } else
            return -1;
    }
}
