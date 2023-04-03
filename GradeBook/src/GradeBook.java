public class GradeBook{
    private String courseName;
    private int[][] grades;

    public GradeBook(String courseName, int[][] grades) {
        this.courseName = courseName;
        this.grades = grades;
    }
    
    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseName() {
        return courseName;
    }
    
    public void getMin(){
        int min = grades[0][0];
        for(int[] studentGrades : grades){
            for(int grade : studentGrades){
                if(grade < min){
                    min = grade;
                }
            }
        }
        System.out.printf("The lowest grade is %d%n", min);
    }
    public void getMax(){
        int max = grades[0][0];
        for(int[] studentGrades : grades){
            for(int grade : studentGrades){
                if(grade > max){
                    max = grade;
                }
            }
        }
        System.out.printf("The highest is %d%n", max);
    }
    
    public double getAverage(int[] studentGrades){
        int total=0;
        for(int grade : studentGrades){
            total += grade;
        }
        return (double) total/studentGrades.length;
    }
    public void outputGrades(){
        System.out.println("The grades are:");
        System.out.print("\t    ");
        for(int test=0; test<grades[0].length; test++){
            System.out.printf("test %d  ", test+1);
        }
        System.out.println("Average");
        for(int student=0; student<grades.length; student++){
            System.out.printf("Student %2d", student+1);
            for(int grade : grades[student]){
                System.out.printf("%8d", grade);
            }
            double avg = getAverage(grades[student]);
            System.out.printf("%9.2f%n", avg);
        }
    }
    
}