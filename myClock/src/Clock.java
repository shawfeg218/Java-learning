public class Clock {
    
    private int hour;
    private int minute;
    private int second;

    public Clock(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public void set(){
        
        second++;
        if(second == 60){
            second = 0;
            minute++;
            if(minute == 60){
                minute = 0;
                hour++;
                if(hour == 24){
                    hour = 0;
                }
            }    
        }

    }

    public void displayTime() {
        System.out.printf("%02d:%02d:%02d\n", hour, minute, second);
    }

}
