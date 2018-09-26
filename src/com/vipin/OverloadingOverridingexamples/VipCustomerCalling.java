package com.vipin.OverloadingOverridingexamples;

public class VipCustomerCalling {
    public static void main(String[] args){
        VipCustomer Person1 = new VipCustomer();
        System.out.println(Person1.getCustomer_Name());

        VipCustomer Person2 = new VipCustomer
                (10000,"Vipin","vipin@email.com");
        System.out.println(Person2.getCustomer_Name());

        VipCustomer Person3 = new VipCustomer
                (10,"varun","varun@email.com");
       System.out.println(Person3.getEmail());

    }

}