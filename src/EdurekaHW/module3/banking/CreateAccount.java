package EdurekaHW.module3.banking;

import EdurekaHW.module3.banking.Account;
import EdurekaHW.module3.banking.BaseAccount;
import EdurekaHW.module3.banking.Current_Account;
import EdurekaHW.module3.banking.SB_Account;

import java.util.Scanner;

public class CreateAccount {
    CreateAccount() {
        System.out.println("Choose the Account Type from below list\n 1. Account \n 2. SB_Account \n 3. Current_Account ");
        Scanner scanner = new Scanner(System.in);
        int AccountType = scanner.nextInt();

            if (AccountType == 1) {
                BaseAccount account = new Account();
                account.CreateNewAccount("Account");
                account.AccountCreated();
                return;

            } else if (AccountType == 2) {
                BaseAccount account = new SB_Account();
                account.CreateNewAccount("SB_Account");
                account.AccountCreated();

            } else if (AccountType == 3) {
                BaseAccount account = new Current_Account();
                account.CreateNewAccount("Current_Account");
                account.AccountCreated();
            } else
                System.out.println("please Choose desired option");
    }
}