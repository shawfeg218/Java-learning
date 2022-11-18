package hw.pkg1;
//public class Clock {
//    private int hour;
//    private int mins;
//    private int second;
//    
//    public Clock(int hour,int mins,int second){
//        if(hour>=0 && hour<=24){
//            this.hour=hour;
//        }
//        if(mins>=0 && mins<=60){
//            this.mins=mins;
//        }
//        if(second>=0 && second<=60){
//            this.second=second;
//        }
//    }
//    public void set_hour(int hour){
//        if(hour>23){
//            this.hour=0;
//        }
//        else{
//             this.hour=hour;
//        }
//    }
//    public void set_mins(int mins){
//        if(mins>59){
//            this.mins=0;
//            hour+=1;
//        }
//        else{
//            this.mins=mins;
//        }
//    }
//    public void set_second(int second){
//        if(second>59){
//            this.second=0;
//            mins+=1;
//        }
//        else{
//            this.second=second;
//        }
//    }
//    public int get_hour(){
//        return hour;
//    }
//    public int get_mins(){
//        return mins;
//    }
//    public int get_second(){
//        return second;
//    }
//    public void displayTime(){
//        System.out.printf("Times:%02d:%02d:%02d\n",hour,mins,second);
//    }
//}








public class Clock{
    private int seconds;
    private int mins;
    private int hours;
    public Clock(int seconds, int mins, int hours){
        if(hours>=0 && hours<=24){
            this.hours = hours;
        }
        if(mins>=0 && mins<=60){
            this.mins = mins;
        }
        if(seconds>=0 && seconds<=60){
            this.seconds = seconds;
        }    
    }
    public void set_hour(int hours){
        if(hours>23){
            this.hours = 0;
        }
        else{
            this.hours = hours;
        }
    }
    public void set_min(int mins){
        if(mins>59){
            this.mins = 0;
            hours++;
        }else{
            this.mins = mins;
        }
    }
    public void set_second(int seconds){
        if(seconds>59){
            this.seconds = 0;
            mins++;
        }else{
            this.seconds = seconds;
        }
    }
    public int getHours(){
        return hours;
    }
    public int getMins(){
        return mins;
    }
    public int getSeconds(){
        return seconds;
    }
    
    public void displayTime(){
        System.out.printf("%02d:%02d:%02d%n", hours, mins, seconds);
    }
}
















