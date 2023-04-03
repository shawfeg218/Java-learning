public class HW1015 {
    public static void main(String[] args){
         SalariedEmployee salariedEmployee = new SalariedEmployee("John", "Smith", "111-11-1111", 800.00);
         HourlyEmployee hourlyEmployee = new HourlyEmployee("Karen", "Price", "222-22-2222", 16.75, 40);
         CommissionEmployee commissionEmployee = new CommissionEmployee("Sue", "Jones", "333-33-3333", 10000, 0.06);
         BasePlusCommissionEmployee basePlusCommissionEmployee = new BasePlusCommissionEmployee("Bob", "Lewis", "444-44-4444", 5000, 0.04, 300);
         PieceWorker pieceWorkerEmployee = new PieceWorker("John", "Smith", "111-11-1111", 500.00, 50);
         
         Employee[] employees = new Employee[5];
         employees[0] = salariedEmployee;
         employees[1] = hourlyEmployee;
         employees[2] = commissionEmployee;
         employees[3] = basePlusCommissionEmployee;
         employees[4] = pieceWorkerEmployee;
         
         for(Employee employee : employees){
             System.out.println(employee);
             System.out.printf("earning: %s%n%n", employee.earnings());
         }
    }
}
abstract class Employee{
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
        return String.format("%s %s%nsocial security number: %s", firstName, lastName, socialSecurityNumber);
    }
    
    public abstract double earnings();
    
}

class SalariedEmployee extends Employee {
    private double weeklySalary;

    public SalariedEmployee(String firstName, String lastName, String socialSecurityNumber, double weeklySalary) {
        super(firstName, lastName, socialSecurityNumber);
        if(weeklySalary < 0.0){
            throw new IllegalArgumentException("Weekly salary must be >= 0.0");
        }
        this.weeklySalary = weeklySalary;
    }

    public double getWeeklySalary() {
        return weeklySalary;
    }

    public void setWeeklySalary(double weeklySalary) {
        if(weeklySalary < 0.0){
            throw new IllegalArgumentException("Weekly salary must be >= 0.0");
        }
        this.weeklySalary = weeklySalary;
    }
    
    @Override
    public double earnings(){
        return getWeeklySalary();
    }
    @Override
    public String toString(){
        return String.format("Salaried employee: %s%nweekly salary: $%,.2f", super.toString(), getWeeklySalary());
    }
    
}

class HourlyEmployee extends Employee{
    private double wage;
    private double hours;

    public HourlyEmployee(String firstName, String lastName, String socialSecurityNumber, double wage, double hours) {
        super(firstName, lastName, socialSecurityNumber);
        if(wage < 0.0){
            throw new IllegalArgumentException("Hourly wage must be >= 0.0");
        }
        if(hours < 0.0 || hours > 168.0){
            throw new IllegalArgumentException("Hours worked must be >= 0.0 and <= 168.0");
        }
        this.wage = wage;
        this.hours = hours;
    }

    public double getWage() {
        return wage;
    }

    public void setWage(double wage) {
        if(wage < 0.0){
            throw new IllegalArgumentException("Hourly wage must be >= 0.0");
        }
        this.wage = wage;
    }

    public double getHours() {
        return hours;
    }

    public void setHours(double hours) {
        if(hours < 0.0 || hours > 168.0){
            throw new IllegalArgumentException("Hours worked must be >= 0.0 and <= 168.0");
        }
        this.hours = hours;
    }
    @Override
    public double earnings(){
        if(getHours() <= 40){
            return getWage() * getHours();
        }
        else{
            return 40 * getWage() + (getHours() - 40) * getWage() * 1.5;
        }
    }
    
    @Override
    public String toString(){
        return String.format("Hourly employee: %s%nhourly wage: $%,.2f; hours worked: %,.2f", super.toString(), getWage(), getHours());
    }
    
}

class CommissionEmployee extends Employee{
    private double grossSales;
    private double commissionRate;

    public CommissionEmployee(String firstName, String lastName, String socialSecurityNumber, double grossSales, double commissionRate) {
        super(firstName, lastName, socialSecurityNumber);
        if(commissionRate <= 0.0 || commissionRate >= 1.0){
            throw new IllegalArgumentException("Commission rate must be > 0.0 and < 1.0");
        }
        if(grossSales < 0.0){
            throw new IllegalArgumentException("Gross sales must be >= 0.0");
        }
        this.grossSales = grossSales;
        this.commissionRate = commissionRate;
    }

    public double getGrossSales() {
        return grossSales;
    }

    public void setGrossSales(double grossSales) {
        if(grossSales < 0.0){
            throw new IllegalArgumentException("Gross sales must be >= 0.0");
        }
        this.grossSales = grossSales;
    }

    public double getCommissionRate() {
        return commissionRate;
    }

    public void setCommissionRate(double commissionRate) {
        if(commissionRate <= 0.0 || commissionRate >= 1.0){
            throw new IllegalArgumentException("Commission rate must be > 0.0 and < 1.0");
        }
        this.commissionRate = commissionRate;
    }
    
    @Override
    public double earnings(){
        return getCommissionRate() * getGrossSales();
    }
    
    @Override
    public String toString(){
        return String.format("Commission employee: %s%ngross sales: $%,.2f; commission rate: %.2f", super.toString(), getGrossSales(), getCommissionRate());
    }
    
}

class BasePlusCommissionEmployee extends CommissionEmployee{
    private double baseSalary;

    public BasePlusCommissionEmployee(String firstName, String lastName, String socialSecurityNumber, double grossSales, double commissionRate, double baseSalary) {
        super(firstName, lastName, socialSecurityNumber, grossSales, commissionRate);
        
        if(baseSalary < 0.0){
            throw new IllegalArgumentException("Base salary must be >= 0.0");
        }
        this.baseSalary = baseSalary;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        if(baseSalary < 0.0){
            throw new IllegalArgumentException("Base salary must be >= 0.0");
        }
        this.baseSalary = baseSalary;
    }
    
    @Override
    public double earnings(){
        return getBaseSalary() + super.earnings();
    }
    @Override
    public String toString(){
        return String.format("Base-salaried: %s; base salary: $%,.2f", super.toString(), getBaseSalary());
    }
    
}

class PieceWorker extends Employee {
    private double wage;
    private int pieces;
    public PieceWorker(String firstName, String lastName, String socialSecurityNumber, double wage, int pieces){
        super(firstName, lastName, socialSecurityNumber);
        this.wage = wage;
        this.pieces = pieces;
    }

    public double getWage() {
        return wage;
    }

    public void setWage(double wage) {
        this.wage = wage;
    }

    public int getPieces() {
        return pieces;
    }

    public void setPieces(int pieces) {
        this.pieces = pieces;
    }
    
    @Override
    public double earnings(){
        return getWage() * getPieces();
    }
    
    @Override
    public String toString(){
        return String.format("Piece worker: %s%nwage per piece: $%,.2f; pieces: %d", super.toString(), getWage(), getPieces());
    }
}
