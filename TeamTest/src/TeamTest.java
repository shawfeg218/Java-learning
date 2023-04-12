//public class TeamTest {
//    public static void main(String[] args){
//        StudentA[] team = new StudentA[3];
//        StudentA a = new StudentA("Mary", 90, 80);
//        StudentA b = new StudentA("Tom", 78, 86);
//        StudentB c = new StudentB("Jack", 80, 88, 42);
//        team[0] = a;
//        team[1] = b;
//        team[2] = c;
//        for(StudentA t : team){
//            if(t instanceof StudentB){
//                StudentB new_c = (StudentB)t;
//                new_c.setScore3(new_c.getScore3() * 2);
//            }
//        }
//        
//        System.out.printf("%s\n", team[0]);
//        System.out.printf("%s\n", team[1]);
//        System.out.printf("%s\n", team[2]);
//    }
//}
//
//interface Average {
//    int cal_avg();
//}
//
//class StudentA implements Average {
//    private String name;
//    private int score1, score2;
//
//    public StudentA(String name, int score1, int score2) {
//        this.name = name;
//        this.score1 = score1;
//        this.score2 = score2;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public int getScore1() {
//        return score1;
//    }
//
//    public int getScore2() {
//        return score2;
//    }
//    
//    public int cal_avg() {
//        int sum;
//        sum = score1 + score2;
//        return sum/2;
//    }
//    
//    public String toString() {
//        return String.format("%s: %s and %s, average is %s", name, score1, score2, cal_avg());
//    }
//}
//
//class StudentB extends StudentA {
//    private int score3;
//
//    public StudentB(String name, int score1, int score2, int score3) {
//        super(name, score1, score2);
//        this.score3 = score3;
//    }
//
//    public int getScore3() {
//        return score3;
//    }
//
//    public void setScore3(int score3) {
//        this.score3 = score3;
//    }
//    
//    @Override
//    public int cal_avg(){
//        int sum;
//        sum = getScore1() + getScore2() + score3;
//        return sum/3;
//    }
//    
//    @Override
//    public String toString(){
//        return String.format("%s: %s and %s and %s, average is %s", getName(), getScore1(), getScore2(), score3, cal_avg());
//    }
//    
//}

public class TeamTest {
    public static void main(String[] args){
        StudentA[] team = new StudentA[3];
        StudentA a = new StudentA("Mary", 90, 80);
        StudentA b = new StudentA("Tom", 78, 86);
        StudentB c = new StudentB("Jack", 80, 88, 42);
        
        team[0] = a;
        team[1] = b;
        team[2] = c;
        
        for(StudentA t : team){
            if(t instanceof StudentB){
                StudentB new_c = (StudentB)t;
                new_c.setScore3(new_c.getScore3()*2);
            }
        }
        
        System.out.printf("%s\n", team[0]);
        System.out.printf("%s\n", team[1]);
        System.out.printf("%s\n", team[2]);
        
    }
}

interface Average{
    int cal_avg();
}

class StudentA implements Average {
    private String name;
    private int score1, score2;

    public StudentA(String name, int score1, int score2) {
        this.name = name;
        this.score1 = score1;
        this.score2 = score2;
    }

    public String getName() {
        return name;
    }

    public int getScore1() {
        return score1;
    }

    public int getScore2() {
        return score2;
    }
    
    public int cal_avg(){
        int sum;
        sum = score1 + score2;
        return sum / 2;
    }
    
    public String toString(){
        return String.format("%s: %s and %s, average is %s", name, score1, score2, cal_avg());
    }
    
}

class StudentB extends StudentA {
    private int score3;

    public StudentB(String name, int score1, int score2, int score3) {
        super(name, score1, score2);
        this.score3 = score3;
    }

    public int getScore3() {
        return score3;
    }

    public void setScore3(int score3) {
        this.score3 = score3;
    }
    
    @Override
    public int cal_avg(){
        int sum;
        sum = getScore1() + getScore2() + score3;
        return sum / 3;
    }
    
    @Override
    public String toString(){
        return String.format("%s: %s, %s and %s, average is %s", getName(), getScore1(), getScore2(), score3, cal_avg());
    }
    
}