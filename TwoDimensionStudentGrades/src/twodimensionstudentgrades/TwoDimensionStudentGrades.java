public class TwoDimensionStudentGrades{
    public static void main(String[] args){
        int[][] grades= {{100, 92, 93, 84}, {85, 96, 87},{77, 67}};
        Group mygroup = new Group(grades);
        mygroup.calculate();
        mygroup.output();
    }
}
//class Group{
//    private int[][] grades;
//    private int[] avgs = new int[3];
//    public Group(int[][] grades){
//        this.grades = grades;
//    }
//    public void calculate(){
//        int count = 0;
//        for(int[] scores : grades){
//            int sum = 0;
//            for(int score : scores){
//                sum += score;
//            }
//            avgs[count] = sum/scores.length;
//            count++;
//        }
//    }
//    public void output(){
//        for(int avg : avgs){
//            System.out.printf("%d ", avg);
//        }
//    }
//}


class Group{
    private int[][] grades;
    private int[] avgs = new int[3];
    public Group(int[][] grades){
        this.grades = grades;
    }
    public void calculate(){
        int count = 0;
        for(int[] scores : grades){
            int sum = 0;
            for(int score : scores){
                sum += score;
            }
            avgs[count] = sum/scores.length;
            count++;
        }
    }
    public void output(){
        for(int avg : avgs){
            System.out.printf("%d ", avg);
        }
    }
}