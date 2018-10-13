package EdurekaHW.module3.banking_2;

public class SB_Account extends AccountType {

    @Override
    public void CreateAccount() {
        BaseAccount account = new BaseAccount();
        account.CreateNewAccount("SB_Account");
        account.AccountCreated();

    }

}
