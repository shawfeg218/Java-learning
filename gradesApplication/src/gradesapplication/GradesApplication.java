package gradesapplication;

public class GradesApplication{
    public static void main(String[] args){
        Grades grades = new Grades("JAVA");
        grades.doGrades();
        grades.displayGrades();
    }
}
