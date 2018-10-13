package EdurekaHW.module3.banking_2;

public class Current_Account extends AccountType{

    @Override
    public void CreateAccount() {
        BaseAccount account = new BaseAccount();
        account.CreateNewAccount("Current_Account");
        account.AccountCreated();
    }
}
