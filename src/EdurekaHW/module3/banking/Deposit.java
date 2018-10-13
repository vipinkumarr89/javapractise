package EdurekaHW.module3.banking;

public class Deposit {
    public void DepositAmount(int AccountNumber,int DepositAmount) {
         BaseAccount baseAccount = new BaseAccount();
            AccountNumber = baseAccount.getAccountnumber(AccountNumber);
                System.out.println("==============================");
                baseAccount.setAmount(DepositAmount,AccountNumber);
                System.out.println("Amount Deposited "+DepositAmount);
                System.out.println("Available Balance in "+AccountNumber+" is " +baseAccount.getAmount(AccountNumber));
        System.out.println("==============================");

    }
}
