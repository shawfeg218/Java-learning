package gradesapplication;

import java.util.Scanner;
public class Grades{
    private String courseName;
    private int a=0, b=0, c=0, d=0, f=0;
    public Grades(String courseName){
        this.courseName = courseName;
    }
    public void doGrades(){
        Scanner input = new Scanner(System.in);
        int score, flag;
        System.out.println("Enter the scores until #:");
        while(!input.hasNext("#")){
            score = input.nextInt();
            flag = score/10;
            switch(flag){
                case 10:
                case 9: 
                    a++;
                    break;
                case 8:
                    b++;
                    break;
                case 7:
                    c++;
                    break;
                case 6:
                    d++;
                    break;
                default:
                    f++;
                    break;
            }
        }
        
    }
    
    public void displayGrades(){
        System.out.printf("Course name: %s%nGrade A: %d%nGrade B: %d%nGrade C: %d%nGrade D: %d%nGrade F: %d%n", courseName, a, b, c, d, f);
    }
}