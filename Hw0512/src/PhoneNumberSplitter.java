import java.util.Scanner;

public class PhoneNumberSplitter {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a phone number in the format (555) 555-5555: ");
        String phoneNumber = input.nextLine();
        phoneNumber = phoneNumber.replace("(", "");
        phoneNumber = phoneNumber.replace(")", "-");
        
        String[] tokens = phoneNumber.split("-");

        String areaCode = tokens[0];
        String phoneNumberConcatenated = tokens[1] + tokens[2];

        System.out.println("Area Code: " + areaCode);
        System.out.println("Phone Number: " + phoneNumberConcatenated);
    }
}
