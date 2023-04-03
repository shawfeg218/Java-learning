public class animals {   
    public static void main(String[] args) {
        Animal a1 = new Bird(5);   
        Animal a2 = new Frog(8);  
        a1.move();            
        a2.move();    
        a1.print_X();            
        a2.print_X();
    }
}
abstract class Animal {
    private int location_x;
    public Animal(int a){
        location_x = a; 
    }  
    public abstract void move();
    public int getx(){
        return location_x;
    }
    public void setx(int a){
        location_x+=a;
    }
    public void print_X(){
        System.out.println("final location  is " + getx() ); 
    }
}
class Bird extends Animal {    
    public Bird(int x) {
        super(x);
    }    
    public void move(){
        setx(30);          
    }
}
class Frog  extends Animal {
    public Frog(int x) {
        super(x);
    }
    public void move(){
        setx(10);          
    }
}
