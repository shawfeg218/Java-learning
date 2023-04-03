public class AlarmDoor {
    public static void main(String[] args){
        
    }
}

abstract class Door {
    abstract void open();
    abstract void close();
}

interface Alarm{
    void alarm();
}

class Clock implements Alarm{
    void alarm();
}