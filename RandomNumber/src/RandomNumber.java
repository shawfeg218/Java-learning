import java.security.SecureRandom;

public class RandomNumber{
    public static void main(String[] args){
        SecureRandom randomNum = new SecureRandom();
        int face;
        for(int i = 1; i <= 30; i++){
            face = 1 + randomNum.nextInt(6);
            System.out.printf("%d ",face);
            if(i%5 == 0){
                System.out.println();
            }
        }
    }
}