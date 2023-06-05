import java.util.Scanner;
public class StringIndexMethods {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a line of text:");
        String text = scanner.nextLine();
        System.out.println("Enter the character you want to search:");
        String c = scanner.nextLine();
        int count = 0;
        int index = text.indexOf(c);
        while(index != -1){
            count++;
            index = text.indexOf(c, index + 1);
        }
        System.out.println("The character \"" + c + "\" appears " + count + " times in the text.");
    }
}