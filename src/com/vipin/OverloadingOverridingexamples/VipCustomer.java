package com.vipin.OverloadingOverridingexamples;

public class VipCustomer {
        private int Credit_Limit;
        private String Customer_Name;
        private String  Email;

    public VipCustomer() {
        this(5000,"Default Name","DefaultEmail");
        System.out.println("this is Blank Constructor");
    }

    public VipCustomer(int credit_Limit, String customer_Name) {
        this.Credit_Limit=credit_Limit;
        this.Customer_Name=customer_Name;
//        System.out.println("Customer Name "+this.Customer_Name +" have this much Credit Limit "+this.Credit_Limit);
    }

    public VipCustomer(int Credit_Limit, String Customer_Name, String Email){
            this.Credit_Limit=Credit_Limit;
            this.Customer_Name=Customer_Name;
            this.Email=Email;
            System.out.println("Customer Name "+this.Customer_Name +" have this much Credit Limit "+this.Credit_Limit);
        }

    public int getCredit_Limit() {
        return Credit_Limit;
    }

    public String getCustomer_Name() {
        return Customer_Name;
    }

    public String getEmail() {
        return Email;
    }

}
