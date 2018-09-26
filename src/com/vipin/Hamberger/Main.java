package com.vipin.Hamberger;

public class Main {
    public static void main(String[] args) {

        Hamburger hamburger = new Hamburger("White","Chicken",
                10.00,"Basic");
        System.out.println("Final Cost "+hamburger.Itemised());
        hamburger.ItemadditionName1("lattuce",2.3);
        hamburger.ItemadditionName2("Paneer",5.0);
        hamburger.ItemadditionName3("Cheese",6.0);
        hamburger.ItemadditionName3("double Cheese",9.0);
        System.out.println("Final Cost is "+hamburger.Itemised());
        HealthyBurger healthyBurger = new HealthyBurger("bacon",14);
        healthyBurger.HItemadditionName1("Salad",3.0);
        healthyBurger.HItemadditionName2("Tomato",2.0);
        System.out.println("Total Cost is "+healthyBurger.Itemised());
    }

}
