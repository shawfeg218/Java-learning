public class AccountTest {
    public static void main(String[] args) {
        Account myAccount = new Account("Shawn", 6000000);
        myAccount.getName();
        myAccount.getBalance();
        myAccount.deposit(100000);
        myAccount.getBalance();
        myAccount.withdraw(100);
        myAccount.getBalance();
        
    }
}