import java.util.Scanner;
public class AccountTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Account myAccount = new Account();
        System.out.println("Initial account name: " + myAccount.getName());
        System.out.println("Enter your name:");
        String name = input.nextLine();
        myAccount.setName(name);
        System.out.println("Your account name: " + myAccount.getName());
    }
}