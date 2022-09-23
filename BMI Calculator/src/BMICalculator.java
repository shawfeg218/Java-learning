import java.util.Scanner;
public class BMICalculator {
    public static void main(String[] args) throws Exception {
        
        Scanner input = new Scanner(System.in);
        double height, weight;
        
        System.out.println("Enter your height:");
        height = input.nextDouble()/100;
        System.out.println("Enter your weight:");
        weight = input.nextDouble();
        double BMI = weight / (height*height);
        
        if(BMI <= 18.5){
            System.out.println("You are skinny!");
        }else if(BMI <= 24.9){
            System.out.println("You are so fit!");
        }else if(BMI <= 29.9){
            System.out.println("You are overweight!");
        }else{
            System.out.println("You are obese!");
        }
        

    }

}
