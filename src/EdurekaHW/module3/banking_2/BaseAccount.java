package EdurekaHW.module3.banking_2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class BaseAccount{
    public int Accountnumber;
    String AccountName;
    double AccountBalance;
    String AccountType;
    final double minBalance = 100;
    int getMaxAccountnumber;


    public void CreateNewAccount(String AccountType){
        System.out.println("please provide below Account Details");
        Scanner scannerAccountnumber = new Scanner(System.in);

        System.out.println("Enter the Account holder Name :");
        AccountName = scannerAccountnumber.next();
        System.out.println("Enter Opening Account Balance :");
        double amount = scannerAccountnumber.nextInt();
        while (amount < minBalance){
            System.out.println("Mimimum Account Balance should be 100 :");
            amount = scannerAccountnumber.nextInt();
        }
        Accountnumber = getMaxAccountnumber() + 1;

        setAccountnumber(Accountnumber);
        setAccountName(AccountName,Accountnumber);
        setAmount(amount,Accountnumber);
        setAccountType(AccountType,Accountnumber);
    }

    public void AccountCreated(){
        System.out.println("========================================================");
        System.out.println("Account Created, please check the details");
        System.out.println("Account Number :"+getAccountnumber(Accountnumber));
        System.out.println("Account Type :"+getAccountType(Accountnumber));
        System.out.println("Account holder name :"+getAccountName(Accountnumber));
        System.out.println("Account Balance  :"+getAmount(Accountnumber));
        System.out.println("========================================================");
    }

    public int getMaxAccountnumber() {
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con= DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/edureka","root","");
            Statement stmt=con.createStatement();
            ResultSet rs=stmt.executeQuery("select max(Accountnumber) from Banking");
//            System.out.println("Accountnumber is "+Accountnumber);
            while (rs.next()) getMaxAccountnumber = rs.getInt(1);
        }catch(Exception e){ System.out.println(e);}
//        System.out.println("getMaxAccountnumber value is "+getMaxAccountnumber);
        return getMaxAccountnumber;
    }

    public void setAccountnumber(int accountnumber) {
        Accountnumber = accountnumber;
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con= DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/edureka","root","");
            Statement stmt=con.createStatement();
            int rs=stmt.executeUpdate("insert into Banking(Accountnumber) values ("+Accountnumber+")");
            con.close();
        }catch(Exception e){ System.out.println(e);}
    }

    public void setAccountName(String accountName,int Accountnumber ) {
        AccountName = accountName;
        Accountnumber = Accountnumber;
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con= DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/edureka","root","");
            Statement stmt=con.createStatement();
            int rs=stmt.executeUpdate("update Banking set TimeStamp = now(), AccountName = '"+AccountName+"' where Accountnumber = "+Accountnumber);
                    con.close();
        }catch(Exception e){ System.out.println(e);}
    }


    public void setAmount(double amount,int Accountnumber) {
        BaseAccount baseAccount = new BaseAccount();
        AccountBalance = baseAccount.getAmount(Accountnumber);
        AccountBalance = AccountBalance+amount;
        Accountnumber = Accountnumber;
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con= DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/edureka","root","");
            Statement stmt=con.createStatement();
            int rs=stmt.executeUpdate("update Banking set TimeStamp = now(), AccountBalance = '"+AccountBalance+"' where Accountnumber = "+Accountnumber);
                    con.close();
        }catch(Exception e){ System.out.println(e);}
    }

    public void setAccountType(String accountType,int Accountnumber) {
        AccountType = accountType;
        Accountnumber = Accountnumber;
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con= DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/edureka","root","");
            Statement stmt=con.createStatement();
            int rs=stmt.executeUpdate("update Banking set TimeStamp = now(), AccountType = '"+AccountType+"' where Accountnumber = "+Accountnumber);
                    con.close();
        }catch(Exception e){ System.out.println(e);}
    }

    public int getAccountnumber(int Accountnumber) {
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con= DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/edureka","root","");
            Statement stmt=con.createStatement();
            ResultSet rs=stmt.executeQuery("select Accountnumber from Banking where Accountnumber="+Accountnumber);
            while (rs.next()) Accountnumber = rs.getInt(1);
                    con.close();
        }catch(Exception e){ System.out.println(e); }
        return Accountnumber;
    }

    public String getAccountName(int Accountnumber) {
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con= DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/edureka","root","");
            Statement stmt=con.createStatement();
            ResultSet rs=stmt.executeQuery("select AccountName from Banking where Accountnumber = "+Accountnumber);
            while (rs.next()) AccountName = rs.getString(1);
                    con.close();
        }catch(Exception e){ System.out.println(e); }
        return AccountName;
    }

    public int getAmount(int Accountnumber) {
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con= DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/edureka","root","");
            Statement stmt=con.createStatement();
            ResultSet rs=stmt.executeQuery("select AccountBalance from Banking where Accountnumber = "+Accountnumber);
            while (rs.next()) AccountBalance = rs.getInt(1);
                    con.close();
        }catch(Exception e){ System.out.println(e);}
        return (int)AccountBalance;
    }

    public String getAccountType(int Accountnumber) {
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con= DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/edureka","root","");
            Statement stmt=con.createStatement();
            ResultSet rs=stmt.executeQuery("select AccountType from Banking where Accountnumber = "+Accountnumber);
            while (rs.next()) AccountType = rs.getString(1);
                    con.close();
        }catch(Exception e){ System.out.println(e);}
        return AccountType;
    }
}
