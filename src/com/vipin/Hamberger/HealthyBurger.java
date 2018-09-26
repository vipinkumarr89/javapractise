package com.vipin.Hamberger;

public class HealthyBurger extends Hamburger {
    private String HealthyExtra1;
    private double HealthyExtra1price;
    private String HealthyExtra2;
    private double HealthyExtra2price;

    public HealthyBurger( String meat, double price) {
        super("BrownBread", meat, price, "healthy");

    }

    public void HItemadditionName1(String name, double price){
        this.HealthyExtra1 = name;
        this.HealthyExtra1price=price;
    }
    public void HItemadditionName2(String name, double price){
        this.HealthyExtra2 = name;
        this.HealthyExtra2price=price;
    }

//    @Override
    public double Itemised() {
        double hburgerprice = super.Itemised();

        if (this.HealthyExtra1 != null) {
            hburgerprice += HealthyExtra1price;
            System.out.println(this.HealthyExtra1 + " for " + this.HealthyExtra1price);
        }
        if (this.HealthyExtra2 != null) {
            hburgerprice += HealthyExtra2price;
            System.out.println(this.HealthyExtra2 + " for " + this.HealthyExtra2price);
        }
        return hburgerprice;
    }
}
