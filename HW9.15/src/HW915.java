public class HW915{
    public static void main(String[] args){
        HourlyEmployee employee1 = new HourlyEmployee("Shawn","Feng","333-3333-33", 60, 168);
        System.out.println(employee1);
    }
}
class Employee{
    private final String firstName;
    private final String lastName;
    private final String socialSecurityNumber;

    public Employee(String firstName, String lastName, String socialSecurityNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.socialSecurityNumber = socialSecurityNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }
    
    public String toString(){
        return String.format("%s %s\nsocial security number: %s\n", firstName, lastName, socialSecurityNumber);
    }
    
}

class HourlyEmployee extends Employee{
    private double hours;
    private double wage;
    public HourlyEmployee(String firstName, String lastName, String socialSecurityNumber, double hours, double wage){
        super(firstName, lastName, socialSecurityNumber);
        if(wage < 0.0){
            throw new IllegalArgumentException("The wage must be > 0.0");
        }
        if(hours > 168 || hours < 0){
            throw new IllegalArgumentException("The hours must be >= 0 and <= 168");
        }
        this.hours = hours;
        this.wage = wage;
    }

    public void setHours(double hours) {
        if(hours > 168 || hours < 0){
            throw new IllegalArgumentException("The hours must be >= 0 and <= 168");
        }
        this.hours = hours;
    }
    public double getHours() {
        return hours;
    }

    public void setWage(double wage) {
        if(wage < 0.0){
            throw new IllegalArgumentException("The wage must be > 0.0");
        }
        this.wage = wage;
    }
    public double getWage() {
        return wage;
    }

    public double earnings(){
        if(hours > 40){
            return 40 * wage + (hours - 40) * wage * 1.5; 
        }
        return wage * hours;
    }
    
    @Override
    public String toString(){
        return String.format("Hourly employee: %s\nhourly wage: %s\nhours worked:%s\nSalary: %s", super.toString(), wage, hours ,earnings());
    }
}