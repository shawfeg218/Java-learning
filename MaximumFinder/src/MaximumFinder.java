import java.util.Scanner;

public class MaximumFinder{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        int result = maximum(a, b, c);
        
        System.out.println("The max number is: " + result);
    }

    public static int maximum(int a, int b, int c){
//        int max = a;
//        if(b >= max){
//            max = b;
//        }
//        if(c >= max){
//            max = c;
//        }
        return Math.max(a,Math.max(b,c));
        
    }
}