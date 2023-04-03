public class GradeBookTest{
    public static void main(String[] args){
        int[][] gradesArray = {{98, 96, 97}, {40, 30, 20}, {90, 92, 94}};
        GradeBook myGradeBook = new GradeBook("Java", gradesArray);
        myGradeBook.getMax();
        myGradeBook.getMin();
        myGradeBook.outputGrades();
    }
}