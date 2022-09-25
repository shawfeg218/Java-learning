import java.util.Random;

class LuckyFive {
  
  public static void main(String[] args) {
    
    Random randomGenerator = new Random();
    
    int dieRoll = randomGenerator.nextInt(6) + 1;
    int count = 1;
    
    while(dieRoll != 5){
      System.out.println(dieRoll);
      count++;
      dieRoll = randomGenerator.nextInt(6) + 1;
    }
    System.out.println(dieRoll);
    System.out.println("You tried " + count + " times to get a five.");
  }
  
}