public class EnhancedForTest{
    public static void main(String[] args){
        int[] array = {87, 68, 94, 100, 83, 78, 85, 91, 76, 87};
        int sum = 0;
        for(int number : array){
            sum += number;
        }
        System.out.println("Total of array element: " + sum);
    }
}