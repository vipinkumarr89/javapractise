package EdurekaHW.module3.banking_2;

public class Deposit {
    public void DepositAmount(int AccountNumber,double DepositAmount) {

        BaseAccount baseAccount = new BaseAccount();
        AccountNumber = baseAccount.getAccountnumber(AccountNumber);
        InterestRate interestRate = new InterestRate();
        double interestearned = interestRate.CalcuateInterest(AccountNumber);
        DepositAmount = DepositAmount + interestearned;
        System.out.println("==============================");
        baseAccount.setAmount(DepositAmount,AccountNumber);
        System.out.println("Amount Deposited "+DepositAmount);
        System.out.println("Interest Earned "+interestearned);
        System.out.println("Available Balance in "+AccountNumber+" is " +baseAccount.getAmount(AccountNumber));
        System.out.println("==============================");

    }
}
