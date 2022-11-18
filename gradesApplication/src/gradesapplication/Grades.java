package gradesapplication;

import java.util.Scanner;
public class Grades{
    private String courseName;
    private int a,b,c,d,f = 0;
    public Grades(String courseName){
        this.courseName = courseName;
    }
    public void doGrades(){
        System.out.println("Enter the scores util # to display grades:");
        Scanner input = new Scanner(System.in);
        int grade;
        while(!input.hasNext("#")){
            grade = input.nextInt();
            switch(grade/10){
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
        System.out.printf("Course name: %s%nA: %d%nB: %d%nC: %d%nD: %d%nf: %d%n", courseName, a, b, c, d, f);
    }
}