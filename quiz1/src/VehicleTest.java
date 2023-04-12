public class VehicleTest{
    public static void main(String args[]){
    Car c = new Car("ABCD", 500000, 0.02); // plate is "ABCD"; price is 500000, rate is 0.02
    //Tax of car is 500000 * 0.02
    Motorcycle m = new Motorcycle("YUHA", 800, 0.01, 200); // plate is "YUHA"; price is 800, rate is 0.01 and base is 200
    // Tax of Motorcycle is 800 * 0.01 + 200   
    System.out.printf("%s", c);
    System.out.printf("%s", m);
    }
}
class Vehicle{
    private String plate;
    private int price;
    private int tax;
    private double rate;
    public Vehicle(String plate, int price, double rate){
        this.plate = plate;
        this.price = price; 
        this.rate = rate;
    }
    public String getplate(){
        return plate;
    }
    public int getprice(){
        return price;
    }
    public double getrate(){
        return rate;
    }
    public String toString(){
        return String.format("Plate is %s", getplate());
    } 
}
class Car extends Vehicle{
    public Car(String plate, int price, double rate){
        super(plate,price,rate);
    }
    public double gettax(){
        return getprice() * getrate();
    }
    @Override
    public String toString(){
        return String.format("%s Tax is %.2f", super.toString(), gettax());
    }
}
class Motorcycle extends Vehicle{
    private int base;
    public Motorcycle(String plate, int price, double rate, int base){
        super(plate,price,rate);
        this.base = base;
    }
    public double gettax(){
        return getprice() * getrate() + base;
    }
    @Override
    public String toString(){
        return String.format("\n%s Tax is %.2f\n", super.toString(), gettax());
    }
}
