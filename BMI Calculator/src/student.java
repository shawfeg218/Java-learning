public class student {
    public static void main(String[] args) {
        BMICalculator student1 = new BMICalculator("John", 170, 60);
        BMICalculator student2 = new BMICalculator("Mary", 160, 65);
        student1.Calculate();
        student1.PrintResult();
        student2.Calculate();
        student2.PrintResult();
    }
}
