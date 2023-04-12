//public class StudentTest{
//   public static void main( String[] args ){
//      Student e1 = new Student("Susan", 45 ); // score is 45
//      Student e2 = new Student("Bob", 55 );  // score is 55
//      Student e3 = new Student("John", 8, 30 );  //score is 8 + 30
//   
//      e1.add();
//      e2.add();
//      e3.add();
//      
//      System.out.printf("average is %d\n", Student.getsum()/Student.getCount());
//   } 
//} 
//class Student{
//    private String name;
//    private int score;
//    private static int sum;
//    private static int count;
//    public Student(String name,int score){  
//        this.name = name;
//        this.score = score;
//        count++;
//    }
//    public Student(String name,int score1,int score2){
//        this.name = name;
//        score = score1+score2;
//        count++;
//    }
//    public void add(){
//        sum=sum+score;
//    }
//    public static int getsum(){
//        return sum;
//    }
//    public static int getCount(){
//        return count;
//    }
//}
