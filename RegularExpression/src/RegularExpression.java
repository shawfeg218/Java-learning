import java.util.*;
public class RegularExpression {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String carName = input.nextLine();
        if(carName.matches("[A-Z][a-zA-Z]+\\s[1-9][0-9]+")){
            System.out.println("yes");
        }else{
            System.out.println("No");
        }
    }
}
