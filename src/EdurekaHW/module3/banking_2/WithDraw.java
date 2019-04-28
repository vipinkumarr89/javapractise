package EdurekaHW.module3.banking_2;

public class WithDraw{

   public double AccountBalance;

    public void AmountWithDraw(int AccountNumber, double WithDrawAmount){
        BaseAccount baseAccount = new BaseAccount();
        AccountNumber = baseAccount.getAccountnumber(AccountNumber);
        double AccountBalance = baseAccount.getAmount(AccountNumber);
        double minBalance = baseAccount.minBalance;

        InterestRate interestRate = new InterestRate();
        double interestearned = interestRate.CalcuateInterest(AccountNumber);

        if(WithDrawAmount > AccountBalance){
            System.out.println("=======================================");
            System.out.println("Account Balance is low"+baseAccount.getAmount(AccountNumber));
            System.out.println("=======================================");
        }
        else if((AccountBalance - WithDrawAmount) < minBalance ){
            System.out.println("=======================================");
            System.out.println("Minimum Account Balance should be 100");
            System.out.println("Current Account Balance is "+baseAccount.getAmount(AccountNumber));
            System.out.println("=======================================");
        }
        else if (WithDrawAmount <= AccountBalance && WithDrawAmount > 0 && AccountBalance > 0 && (AccountBalance - WithDrawAmount) > minBalance ){
            AccountBalance = AccountBalance - WithDrawAmount + interestearned;
            System.out.println("=======================================");
            System.out.println("Amount WithDrawn "+WithDrawAmount);
            baseAccount.setAmount(WithDrawAmount*-1,AccountNumber);
            System.out.println("Interest Earned "+interestearned);
            System.out.println("Available Balance is : "+baseAccount.getAmount(AccountNumber));
            System.out.println("=======================================");
        }
        else {
            System.out.println("=======================================");
            System.out.println("Something Went Wrong! Try Again");
            System.out.println("=======================================");
        }
    }

    public double CheckBalance(int AccountNumber) {
        BaseAccount baseAccount = new BaseAccount();
        AccountBalance = baseAccount.getAmount(AccountNumber);

        return AccountBalance;
    }
}
