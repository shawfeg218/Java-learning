import java.util.Scanner;
public class IndexOf {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String s = input.nextLine();
        int i = 0;
        int count = 0;
        while(i<s.length()){
            if(i == s.indexOf("ed", i)){
                count++;
                i+=2;
            }
            else {
                i++;
            }
        }
        System.out.printf("%s has %d eds\n", s, count);
    }
}