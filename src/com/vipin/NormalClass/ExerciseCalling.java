package com.vipin.NormalClass;

public class ExerciseCalling {
    public static void main(String[] args) {

        Exercise methodcalling = new Exercise();
        int var1 = Exercise.sumOdd(1,100);
        int var2 = Exercise.sumOdd(-1,100);
        int var3 = Exercise.sumOdd(100,100);
        int var4 = Exercise.sumOdd(100,-100);
        int var5 = Exercise.sumOdd(100,1000);
        System.out.println(var1);
        System.out.println(var2);
        System.out.println(var3);
        System.out.println(var4);
        System.out.println(var5);
    }
}
