import java.util.Scanner;

public class scanner_testing {

    public static void main(String[] args) {
        
        Scanner myScanner = new Scanner(System.in);
        int num1,num2,num3;
        num1 = myScanner.nextInt();
        num3 = myScanner.nextInt();
        num2 = myScanner.nextInt();

        System.out.println("The first number you enter is:" + num1);
        System.out.println("The first number you enter is:" + num2);
        System.out.println("The first number you enter is:" + num3);
    }

}