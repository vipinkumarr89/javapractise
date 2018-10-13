package EdurekaHW.module3.banking_2;

import java.util.Scanner;

public  class CreateAccount {

    public void CreateNewAccount(){
        System.out.println("Choose the Account Type from below list\n 1. Account \n 2. SB_Account \n 3. Current_Account ");
        Scanner scanner = new Scanner(System.in);
        int AccountType = scanner.nextInt();

        if (AccountType == 1) {
            String UserAccountType = "Account";
            Account account = new Account();
            account.CreateAccount();

        } else if (AccountType == 2) {
            String UserAccountType = "SB_Account";
            SB_Account sb_account = new SB_Account();
            sb_account.CreateAccount();

        } else if (AccountType == 3) {
            String UserAccountType = "Current_Account";
            Current_Account current_account = new Current_Account();
            current_account.CreateAccount();

        } else
            System.out.println("please Choose desired option");
    }

}