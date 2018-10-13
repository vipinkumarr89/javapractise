package EdurekaHW.module3.banking;

import EdurekaHW.module3.banking.BaseAccount;

public class WithDraw{

   public int AccountBalance;

    public void AmountWithDraw(int AccountNumber, int WithDrawAmount){
        BaseAccount baseAccount = new BaseAccount();
        AccountNumber = baseAccount.getAccountnumber(AccountNumber);
        int AccountBalance = baseAccount.getAmount(AccountNumber);

        if(WithDrawAmount > AccountBalance){
            System.out.println("Account Balance is low");
        }
        else if (WithDrawAmount <= AccountBalance && WithDrawAmount > 0 && AccountBalance > 0){
            AccountBalance = AccountBalance - WithDrawAmount;
            System.out.println("Amount WithDrawn "+WithDrawAmount);
            System.out.println("==============================");
//            BaseAccount baseAccount = new BaseAccount();
            baseAccount.setAmount(WithDrawAmount*-1,AccountNumber);
            System.out.println("Available Balance is : "+baseAccount.getAmount(AccountNumber));
        }
        else
            System.out.println("Something Went Wrong! Try Again");
    }

    public int CheckBalance(int AccountNumber) {
        BaseAccount baseAccount = new BaseAccount();
        AccountBalance = baseAccount.getAmount(AccountNumber);

        return AccountBalance;
    }
}
