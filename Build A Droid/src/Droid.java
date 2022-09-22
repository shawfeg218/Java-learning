import java.util.Scanner;

public class Droid {
  String name;
  int batteryLevel;

  public Droid(String droidName) {
    name = droidName;
    batteryLevel = 100;
  }

  public String toString() {
    return "Hello, I am the droid: " + name + " (bettery:" + batteryLevel + "%)";
  }

  public void performTask(String task) {
    batteryLevel -= 10;
    System.out.println(name + " is performing task: " + task + " (bettery:" + batteryLevel + "%)");
  }

  public static void main(String[] args) {
    
    Scanner input = new Scanner(System.in);
    
    System.out.println("You can build a Robot, enter the name:");
    String robotName = input.nextLine();
    Droid theRobot = new Droid(robotName);
    System.out.println(theRobot);
    
    System.out.println("Enter the action for the robot:");
    String action1 = input.nextLine();
    theRobot.performTask(action1);
    
    System.out.println("Enter the action for the robot:");
    String action2 = input.nextLine();
    theRobot.performTask(action2);
    
    System.out.println("Enter the action for the robot:");
    String action3 = input.nextLine();
    theRobot.performTask(action3);
    

  }

}