package com.vipin.OverloadingOverridingexamples;

import java.math.BigInteger;

public class Bank {
    private int Account_Number;
    private int Balance;
    private String Customer_Name;
    private String  Email;
    private int Phone_Number;

    public Bank(int Account_number, int Balance, String Customer_care, String Email, int Phone_Number){
        this.Balance=Balance;
        this.Account_Number=Account_number;
        this.Customer_Name=Customer_care;
        this.Email=Email;
        this.Phone_Number=Phone_Number;
        System.out.println("Account Number "+Account_Number +" Contain this much "+Balance);
    }

    public void deposit(int balance){
        this.Balance += balance;
        System.out.println("Amount Deposited Successfully, Current amount is :"+this.Balance);
    }
    public void withdraw(int withdraw){
        if(withdraw < this.Balance && this.Balance > 0 ){
            this.Balance-=withdraw;
            System.out.println("Balance in Account " +this.Balance);
        }else
            System.out.println("Balance is low" +this.Balance);
    }
    public int getAccount_Number() {
        return Account_Number;
    }

    public void setAccount_Number(int account_Number) {
        Account_Number = account_Number;
    }

    public int getBalance() {
        return Balance;
    }

    public void setBalance(int balance) {
        Balance = balance;
    }

    public String getCustomer_Name() {
        return Customer_Name;
    }

    public void setCustomer_Name(String customer_Name) {
        Customer_Name = customer_Name;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public int getPhone_Number() {
        return Phone_Number;
    }

    public void setPhone_Number(int phone_Number) {
        Phone_Number = phone_Number;
    }
}
