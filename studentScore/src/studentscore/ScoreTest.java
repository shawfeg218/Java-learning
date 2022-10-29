package studentscore;

public class ScoreTest {
    public static void main(String[] args){
        Student s1 = new Student("Owen", 3 );
        Student s2 = new Student("Fiona", 4 );
        s1.calAverage();
        s1.printAvg();
        s2.calAverage();
        s2.printAvg();
    }
}
