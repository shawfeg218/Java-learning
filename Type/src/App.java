import java.security.SecureRandom;

public class RandomNumber {
    public static void main(String[] args){
        int face;
        SecureRandom random = new SecureRandom();
        for(int i = 1; i<30 ; i++){
            face = 1 + random.nextInt(6);
            System.out.printf("%d ", face);
            if(i%5 == 0){
                System.out.println();
            }
        }

    }
}