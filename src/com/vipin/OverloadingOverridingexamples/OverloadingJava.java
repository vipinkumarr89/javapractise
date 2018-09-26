package com.vipin.OverloadingOverridingexamples;

import com.vipin.NormalClass.Scorecard;

public class OverloadingJava {
    public static void main(String[] args) {

        System.out.println("There are two method with different parameters");
//        scorecard(1000);
        int newscorecard = scorecard(1000);
        System.out.println("new score is "+newscorecard);
        scorecard("vipin", 100);
        // Below we are calling function or method Scorecard that is defined in class Scorecard
        Scorecard object = new Scorecard();
        String scorecardcalling = object.scorecard("Jovin", 1, 100);
        System.out.println(scorecardcalling);
    }

    public static int scorecard(int var2) {
        System.out.println("Value of var2 :" + var2);
        return var2*100;
    }

    public static void scorecard(String name, int var2) {
        System.out.println("player " + name + "score " + var2);
    }
}