public class Car {

    private String model;
    private String year;
    private double price;
    
    public Car(String model, String year, double price){
        this.model = model;
        this.year = year;
        this.price = price;
    }

    public void setPrice(double price){
        if(price > 0){
            this.price = price;
        }
    }
    
    public void setModel(String model){
        this.model = model;
    }
    
    public void setYear(String year){
        this.year = year;
    }

    public void get(){
        System.out.println("Information:");
        System.out.println("Car:" + model);
        System.out.println("Year:" + year);
        System.out.println("Price:" + price);
        System.out.println();
    }

}
