import java.time.chrono.Era;
import java.util.Scanner;

public class Asset {
    private String name;
    private double[] priceArr = new double[5];
    private double[] rateArr = new double[4];
    private double ERate;
    private double standardDeviation;
    private double variance;
    private double CV;

    public Asset(String name) {
        this.name = name;
    }

    public void getPrice() {
        for (int i = 0; i < priceArr.length; i++) {
            System.out.printf("%d: %.2f %n", (2017 + i), priceArr[i]);
        }
    }

    public void printResult() {
        System.out.println(name);
        // getPrice();
        System.out.println("Expected rate: " + Math.floor(ERate * 100) + "%");
        System.out.println("Standard deviation: " + Math.floor(standardDeviation * 100) + "%");
        System.out.println("Variance: " + Math.floor(variance * 100) + "%");
        System.out.println("CV: " + Math.floor(CV * 100) + "%");
    }

    public void enterPrice() {
        Scanner input = new Scanner(System.in);
        double price;
        for (int i = 0; i < 5; i++) {
            price = input.nextDouble();
            priceArr[i] = price;
        }
        rateCal();
        ERateCal();
        standardDeviationCal();
        CVCal();
    }

    public void rateCal() {
        double grow;
        for (int i = 1; i < 5; i++) {
            grow = priceArr[i] - priceArr[i - 1];
            rateArr[i - 1] = grow / priceArr[i - 1];
        }
    }

    public void ERateCal() {
        double sum = 0;
        for (int i = 0; i < rateArr.length; i++) {
            sum += rateArr[i];
        }
        ERate = sum / rateArr.length;
    }

    public void standardDeviationCal() {
        double sum = 0;
        double gap;
        for (int i = 0; i < rateArr.length; i++) {
            gap = Math.pow((rateArr[i] - ERate), 2);
            sum += gap;
        }
        standardDeviation = sum / (rateArr.length - 1);
        variance = Math.sqrt(standardDeviation);
    }

    public void CVCal() {
        CV = standardDeviation / ERate;
    }
}
