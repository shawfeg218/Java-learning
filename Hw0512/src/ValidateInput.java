import java.util.Scanner;

public class ValidateInput {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the password you want:");
        String password = scanner.nextLine();
        System.out.println("Validate Result:");
        if(!validatePassword(password)){
            System.out.println("Invalid password");
        }else{
            System.out.println("Valid password");
        }
    }
    public static boolean validatePassword(String password){
        return password.matches("(?=.*[A-Z])(?=.*\\d)[A-Za-z\\d]{8,15}");
    }
}