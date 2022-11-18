import java.util.Scanner;

public class InvestCal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String a;
        String b;

        double covariance;

        System.out.println("Enter the assets name:");
        a = input.next();
        Asset asset1 = new Asset(a);

        System.out.println("Enter the assets price from 2017 to 2021");
        asset1.enterPrice();

        System.out.println("Enter the assets name:");
        b = input.next();
        Asset asset2 = new Asset(b);

        System.out.println("Enter the assets price from 2017 to 2021");
        asset2.enterPrice();

        asset1.printResult();
        asset2.printResult();

        covariance = Cor(asset1, asset2);
        System.out.printf("Covarance of %s and %s: %.2f", asset1.getName(), asset2.getName(), covariance);

    }

    public static double Cor(Asset BTC, Asset ETH) {
        double[] BTCRateArr = BTC.getRateArr();
        double[] ETHRateArr = ETH.getRateArr();
        double BTCERate = BTC.getERate();
        double ETHERate = ETH.getERate();
        double sum = 0;
        for (int i = 0; i < BTCRateArr.length; i++) {
            double a = BTCRateArr[i] - BTCERate;
            double b = ETHRateArr[i] - ETHERate;
            sum += a * b;
        }
        return sum;
    }
}
