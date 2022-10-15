import java.util.Scanner;
public class Student{
    private String name;
    private int size;
    private int avg;
    
    public Student(String name, int size){
        this.name = name;
        this.size = size;
    }
    
    public void AvgCal(){
        int sum = 0;
        Scanner input = new Scanner(System.in);
        System.out.printf("Enter %d %s's score: ", size, name);
        for(int i=0; i<size; i++){
            sum += input.nextInt();
        }
        avg = sum/size;
    }
    
    public void printAvg(){
        System.out.println(name + "'s average is: " + avg);
    }
}