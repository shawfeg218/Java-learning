import java.util.ArrayList;
public class PrimeArrayMaker {

    public boolean isPrime(int number){
        if(number < 2){
            return false;
        }else if(number == 2){
            return true;
        }
        for(int i=2; i<number; i++){
            if(number % i == 0){
                return false;
            }
        }
        return true;
    }

    public ArrayList<Integer> PrimeArrayPrinter (int[] numbers) {
        ArrayList<Integer> PrimesArray = new ArrayList<Integer>();
        for(int eachNum : numbers){
            if(isPrime(eachNum)){
                PrimesArray.add(eachNum);
            }
        }
        return PrimesArray;
    }
    public static void main(String[] args) {
        PrimeArrayMaker A = new PrimeArrayMaker();
        int[] numbers = {6, 29, 28, 33, 11, 100, 101, 43, 89};
        System.out.println("Primes in numbers:" + A.PrimeArrayPrinter(numbers));
    }
}
