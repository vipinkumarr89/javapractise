package EdurekaHW.module3.banking_2;

import java.sql.*;

public class InterestRate {
    public double timestamp;
    public double AccountBalance;
    public double interestrate = 100;
    public double interestEarned;
    public String accountType;

    public String FindAccountType(int Accountnumber) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/edureka", "root", "");
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("select AccountType from Banking where AccountNumber="+Accountnumber);
            while (rs.next()) accountType = rs.getString(1);
        } catch (Exception e) {
            System.out.println(e);
        }
        return (String)accountType;
    }

    public double TimeStamp(int Accountnumber) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/edureka", "root", "");
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT UNIX_TIMESTAMP(Now()) - UNIX_TIMESTAMP(TimeStamp) from Banking where Accountnumber ="+Accountnumber);
            while (rs.next()) timestamp = rs.getDouble(1);
        } catch (Exception e) {
            System.out.println(e);
        }
        return timestamp;
    }

    public double CalcuateInterest(int Accountnumber) {

        InterestRate interestRate = new InterestRate();
        accountType = interestRate.FindAccountType(Accountnumber);

        if (accountType.equals("SB_Account")) {
            BaseAccount baseAccount = new BaseAccount();
            AccountBalance = baseAccount.getAmount(Accountnumber);
            timestamp = interestRate.TimeStamp(Accountnumber);
            double totalhours = 365*24;
            double totalsecs = totalhours * 360;

            interestEarned = ((AccountBalance*interestrate*timestamp)/(100*totalsecs));
            AccountBalance+=interestEarned;

            try {
                Class.forName("com.mysql.jdbc.Driver");
                Connection con = DriverManager.getConnection(
                        "jdbc:mysql://localhost:3306/edureka", "root", "");
                Statement stmt = con.createStatement();
                int rs=stmt.executeUpdate("update Banking set AccountBalance = '"+AccountBalance+"' where Accountnumber = "+Accountnumber);
                con.close();
            } catch (Exception e) {
                System.out.println(e);

            }
        }
        return interestEarned;
    }
}
