public class AverageTest{
    public static void main(String[] args){
        Student s1 = new Student("Shawn", 3);
        Student s2 = new Student("Andy", 4);
        
        s1.AvgCal();
        s1.printAvg();
        s2.AvgCal();
        s2.printAvg();
    }
}