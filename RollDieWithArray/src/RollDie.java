//import java.security.SecureRandom;
//public class RollDie{
//    public static void main(String[] args){
//        int[] faceFrequency = new int[7];
//        SecureRandom randomNumber = new SecureRandom();
//        for(int i=0; i<6000; i++){
//            int face = 1 + randomNumber.nextInt(6);
//            faceFrequency[face]++;
//        }
//        System.out.printf("Face \t Frequency%n");
//        for(int i=1; i<faceFrequency.length; i++){
//            System.out.printf("%d \t %d%n", i, faceFrequency[i]);
//        }
//    }
//}
import java.security.SecureRandom;
public class RollDie{
    public static void main(String[] args){
        int[] frequency = new int[7];
        SecureRandom randomNumber = new SecureRandom();
        for(int i=0; i<6000; i++){
            int face = 1 + randomNumber.nextInt(6);
            frequency[face]++;
        }
        System.out.println("face \t frequency");
        for(int i=1; i<=6; i++){
            System.out.printf("%d \t %d%n", i, frequency[i]);
        }
    }
}