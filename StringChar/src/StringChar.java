public class StringChar {
    public static void main(String[] args){
        String s1 = "hello there";
        char[] charArray = new char[5];
        System.out.printf("%s\n", s1);
        System.out.println("Length of s1: " + s1.length());
        
        System.out.println("The string reversed is: ");
        for(int i=s1.length()-1; i>=0; i--){
            System.out.printf("%c ", s1.charAt(i));
        }
        
        s1.getChars(0, 5, charArray, 0);
        System.out.println("\nThe character array is: ");
        for(char c : charArray){
            System.out.print(c);
        }
        System.out.println();
    }
}