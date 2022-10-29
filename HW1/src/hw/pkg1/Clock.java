package hw.pkg1;
public class Clock {
    private int hour;
    private int mins;
    private int second;
    
    public Clock(int hour,int mins,int second){
        if(hour>=0 && hour<=24){
            this.hour=hour;
        }
        if(mins>=0 && mins<=60){
            this.mins=mins;
        }
        if(second>=0 && second<=60){
            this.second=second;
        }
    }
    public void set_hour(int hour){
        if(hour>23){
            this.hour=0;
        }
        else{
             this.hour=hour;
        }
    }
    public void set_mins(int mins){
        if(mins>59){
            this.mins=0;
            hour+=1;
        }
        else{
            this.mins=mins;
        }
    }
    public void set_second(int second){
        if(second>59){
            this.second=0;
            mins+=1;
        }
        else{
            this.second=second;
        }
    }
    public int get_hour(){
        return hour;
    }
    public int get_mins(){
        return mins;
    }
    public int get_second(){
        return second;
    }
    public void displayTime(){
        System.out.printf("Times:%02d:%02d:%02d\n",hour,mins,second);
    }
}
