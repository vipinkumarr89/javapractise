package EdurekaHW.module3.banking_2;

public class Account extends AccountType{

    @Override
    public void CreateAccount() {
        BaseAccount account = new BaseAccount();
        account.CreateNewAccount("Account");
        account.AccountCreated();
    }

}
