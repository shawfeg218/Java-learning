public class VehicleTest{
    public static void main(String[] args){
        Car c = new Car("ABCD" , 500000, 0.02);
        Motorcycle m = new Motorcycle("YUMA", 800, 400);
        System.out.println(c);
        System.out.println(m);
    }
}
class Vehicle{
    private String plate;
    public Vehicle(String plate){
        this.plate = plate;
    }
    public String getPlate(){
        return plate;
    }
    public String toString(){
        return String.format("plate is %s", getPlate());
    }
}

class Car extends Vehicle{
    private int price;
    private double taxRate;
    public Car(String plate, int price, double taxRate){
        super(plate);
        this.price = price;
        this.taxRate = taxRate;
    }
    public double getTax(){
        return price * taxRate;
    }
    public String toString(){
        return String.format("%s Tax is %.2f", super.toString(), getTax());
    }
}

class Motorcycle extends Vehicle{
    private int tax;
    public Motorcycle(String plate, int q, int w){
        super(plate);
        tax = q + w;
    }
    public double getTax(){
        return tax;
    }
    public String toString(){
        return String.format("%s Tax is %.2f", getPlate(), getTax());
    }
}