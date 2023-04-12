//public class Animals {
//    public static void main(String[] args){
//        Animal a1 = new Bird(5);
//        Animal a2 = new Frog(8);
//        a1.move();
//        a2.move();
//        a1.print_x();
//        a2.print_x();
//    }
//}
//
//abstract class Animal {
//    private int location_x;
//    public Animal(int a){
//        location_x = a;
//    }
//
//    public int getLocation_x() {
//        return location_x;
//    }
//
//    public void setLocation_x(int a) {
//        this.location_x += a;
//    }
//    
//    public abstract void move();
//    public void print_x() {
//        System.out.println("Final location is " + getLocation_x());
//    }
//}
//
//class Bird extends Animal {
//    public Bird(int a) {
//        super(a);
//    }
//    public void move() {
//        setLocation_x(30);
//    }
//}
//
//class Frog extends Animal {
//    public Frog(int a) {
//        super(a);
//    }
//    public void move() {
//        setLocation_x(10);
//    }
//}

public class Animals {
    public static void main(String[] agrs){
        Animal a1 = new Bird(5);
        Animal a2 = new Frog(8);
        a1.move();
        a2.move();
        a1.print_x();
        a2.print_x();
    }
}

abstract class Animal {
    public int location_x;
    public Animal(int a){
        this.location_x = a;
    }
    
    public void setLocation_x(int a){
        location_x += a;
    }
    
    abstract void move();
    
    public void print_x(){
        System.out.printf("%d\n", location_x);
    }
    
}

class Bird extends Animal{
    public Bird(int a) {
        super(a);
    }
    public void move() {
        setLocation_x(30);
    }
}

class Frog extends Animal {
    public Frog(int a){
        super(a);
    }
    public void move() {
        setLocation_x(10);
    }
}