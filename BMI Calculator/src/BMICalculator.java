public class BMICalculator {
    
    private String name;
    private double height;
    private double weight;
    private double BMI;


    public BMICalculator(String name, double height, double weight) {
        this.name = name;
        this.height = height;
        this.weight = weight;
    }

    public void Calculate() {
        
        double heightInM = height/100;
        BMI = weight / (heightInM*heightInM);
        
    }

    public void PrintResult() {
        if(BMI <= 18.5){
            System.out.printf("%s: height:%.1f weight:%.1f BMI:%.2f, You are skinny!%n" ,name, height, weight, BMI);
        }else if(BMI <= 24.9){
            System.out.printf("%s: height:%.1f weight:%.1f BMI:%.2f, You are so fit!%n" ,name, height, weight, BMI);
        }else if(BMI <= 29.9){
            System.out.printf("%s: height:%.1f weight:%.1f BMI:%.2f, You are overweight!%n" ,name, height, weight, BMI);
        }else{
            System.out.printf("%s: height:%.1f weight:%.1f BMI:%.2f, You are obese!%n" ,name, height, weight, BMI);
        }
    }

}
