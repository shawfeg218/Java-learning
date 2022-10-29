package hw.pkg1;
public class ClockTest {
    public static void main(String[] argv){
        Clock c=new Clock(16,25,36);
        c.displayTime();
        c.set_mins(55);
        c.displayTime();
    }
}
