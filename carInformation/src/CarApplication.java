public class CarApplication {
    public static void main(String[] args) {
        Car car1 = new Car("Benz", "2019", 500000);        
        Car car2 = new Car("Toyota", "2000", 300000);
        car1.get();
        car2.get();
        car1.setPrice(500000 * 0.95);
        car2.setPrice(300000 * 0.95);
        System.out.println("After discount:");
        car1.get();
        car2.get();
        
    }
}