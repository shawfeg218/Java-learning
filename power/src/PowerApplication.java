import java.util.Scanner;
public class PowerApplication{
    public static void main(String[] args){
        System.out.println("Enter x and y:");
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        int y = input.nextInt();
        System.out.printf("%d^%d=%d%n", x, y, power(x,y));
    }
    public static int power(int x, int y){
        return (int)Math.pow(x, y);
    }
}
