package com.vipin.NormalClass;

public class byteclass {
    public static void main(String[] args) {

        byte var1 = (byte) 1000;
        byte var2 = (byte) (var1/2);
        short var3 = 1021;
        short var4 = (short) (var3/4);
        int var5 = 10;
        int var6 = (var5/4);
        long var7 = 50000 + (10*var2) + (var4) + (var6);
        System.out.println(var1);
        System.out.println(var2);
        System.out.println(var3);
        System.out.println(var4);
        System.out.println(var5);
        System.out.println(var6);
        System.out.println(var7);
    }
}
