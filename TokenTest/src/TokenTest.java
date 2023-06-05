public class TokenTest {
    public static void main(String[] args){
        String sentence = "This is a sentence of seven tokens";
        System.out.println(sentence);
        String[] tokens = sentence.split(" ");
        System.out.println("Number of elements: " + tokens.length);
        for(String token : tokens){
            System.out.println(token);
        }
        
    }
}