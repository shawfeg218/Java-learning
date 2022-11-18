
package investcalculator;

import java.util.Scanner;

public class InvestCal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String a;
        String b;

        System.out.println("Enter the assets name:");
        a = input.next();
        Asset BTC = new Asset(a);

        System.out.println("Enter the assets price from 2017 to 2021");
        BTC.enterPrice();

        System.out.println("Enter the assets name:");
        b = input.next();
        Asset ETH = new Asset(b);

        System.out.println("Enter the assets price from 2017 to 2021");
        ETH.enterPrice();

        BTC.printResult();
        ETH.printResult();
    }
}
