package EdurekaHW.module3.banking_2;

import java.util.Scanner;

public class Banking {
    public static void main(String[] args) {

        while (true){
            InitialDetails();
        }
    }

    static void InitialDetails(){
        System.out.println("please Select the Desired option from the list");
        System.out.println("1. Create new Account");
        System.out.println("2. Withdraw the Amount");
        System.out.println("3. Deposit Amount");
        System.out.println("4. Check Balance");
        System.out.println("Type 0 to quit");

        Scanner scanner1 = new Scanner(System.in);
        int inputVariable ;
        inputVariable = scanner1.nextInt();

            if(inputVariable == 1) {
                CreateAccount createAccount = new CreateAccount();
                createAccount.CreateNewAccount();
            }
            else if(inputVariable == 2){
                System.out.println("please provide Account number And Amount");
                System.out.println("Enter the Account number : ");
                Scanner scanner = new Scanner(System.in);
                int AccountNumber = scanner.nextInt();
                System.out.println("Enter the Amount to withDraw : ");
                double WithDrawAmount = scanner.nextInt();
                WithDraw withDraw = new WithDraw();
                withDraw.AmountWithDraw(AccountNumber,WithDrawAmount);
            }
            else if(inputVariable == 3){
                System.out.println("please provide Account number And Amount to Deposit");
                System.out.println("Enter the Account number : ");
                Scanner scanner = new Scanner(System.in);
                int AccountNumber = scanner.nextInt();
                System.out.println("Enter the Amount to Deposit : ");
                double DepositAmount = scanner.nextInt();
                Deposit deposit = new Deposit();
                deposit.DepositAmount(AccountNumber,DepositAmount);
            }
            else if(inputVariable == 4){
                System.out.println("====Check Account Balance====");
                System.out.println("Enter the Account number : ");
                Scanner scanner = new Scanner(System.in);
                int AccountNumber = scanner.nextInt();
                WithDraw withDraw = new WithDraw();
//                double AccountBalance = withDraw.CheckBalance(AccountNumber);
                InterestRate interestRate = new InterestRate();
                double interestearned = interestRate.CalcuateInterest(AccountNumber);
                System.out.println("========================================================");
                System.out.println("Interest Earned "+interestearned+" Rs");
                double AccountBalance = withDraw.CheckBalance(AccountNumber);
                System.out.println("Account Balance of " + AccountNumber + " is " + AccountBalance + " Rs");
                System.out.println("========================================================");
            }
            else {
                System.out.println("exit");
                System.exit(0);
            }

    }
}
