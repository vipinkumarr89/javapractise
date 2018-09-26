package com.vipin.NormalClass;

public class Scorecard {
    public static void main(String[] args) {

//        scorecard("vipin",100);
        String var4 = scorecard("vipin",100, 200);
        System.out.println("varlue of var1 is "+var4);
    }

    public static String scorecard(String name, int var2,int var3){
//        System.out.println("Vale of var2 :" +var2);
        return "Name:" + name + " Var2: " + var2 + " Var3: " + var3;
    }
}