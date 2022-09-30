public class ClockTest {
    public static void main(String[] args) {
        
        Clock myClock = new Clock(23,59,57);
        myClock.displayTime();
        for(int i=0 ; i<10 ; i++) {
            myClock.set();
            myClock.displayTime();
        }

    }
}
