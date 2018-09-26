package com.vipin.Hamberger;

import com.sun.org.apache.xml.internal.security.Init;

public class Hamburger {
    public String BreadType;
    public String Meat;
    public double price;
    public String name;

    public Hamburger(String breadType, String meat, double price, String name) {
        this.BreadType = breadType;
        this.Meat = meat;
        this.price = price;
        this.name = name;
        System.out.println("Cost of "+name +" Burger with "+this.BreadType+" Bread and "+
                this.Meat+" meat is "+this.price);
    }

    public double Itemised(){
        double InitialCost = this.price;

//        After this line code is added to add the item to the burger
        if(this.additionName1 != null){
            InitialCost+=additionPrice1;
            System.out.println("Item Added "+additionName1+" for "+additionPrice1);
        }
        if(this.additionName2 != null){
            InitialCost+=additionPrice2;
            System.out.println("Item Added "+additionName2+" for "+additionPrice2);
        }
        if(this.additionName3 != null){
            InitialCost+=additionPrice3;
            System.out.println("Item Added "+additionName3+" for "+additionPrice3);
        }
        if(this.additionName4 != null){
            InitialCost+=additionPrice4;
            System.out.println("Item Added "+additionName4+" for "+additionPrice4);
        }
        return InitialCost;
    }
    // Till now base burger with breadtype and meat is available
    // Now we need to add Additional Item into the burger

    public String additionName1;
    public String additionName2;
    public String additionName3;
    public String additionName4;

    public double additionPrice1;
    public double additionPrice2;
    public double additionPrice3;
    public double additionPrice4;

    public void ItemadditionName1(String name, double price){
     this.additionName1 = name;
     this.additionPrice1=price;
    }
    public void ItemadditionName2(String name, double price){
        this.additionName2 = name;
        this.additionPrice2=price;
    }
    public void ItemadditionName3(String name, double price){
        this.additionName3 = name;
        this.additionPrice3=price;
    }
    public void ItemadditionName4(String name, double price){
        this.additionName4 = name;
        this.additionPrice4=price;
    }
}
