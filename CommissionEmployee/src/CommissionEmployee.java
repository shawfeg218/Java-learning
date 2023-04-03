public class CommissionEmployee{
    private final String firstName;
    private final String lastName;
    private final String socialSecurity;
    private double grossSales;
    private double commissionRate;

    public CommissionEmployee(String firstName, String lastName, String socialSecurity, double grossSales, double commissionRate) {
        if(grossSales < 0.0){
            throw new IllegalArgumentException("Gross sale must be >= 0.0");
        }
        if(commissionRate <= 0.0 || commissionRate >= 1.0){
            throw new IllegalArgumentException("Commission rate must be > 0.0 and < 1.0");
        }
        this.firstName = firstName;
        this.lastName = lastName;
        this.socialSecurity = socialSecurity;
        this.grossSales = grossSales;
        this.commissionRate = commissionRate;
    }

    public void setGrossSales(double grossSales) {
        if(grossSales < 0.0){
            throw new IllegalArgumentException("Gross sale must be >= 0.0");
        }
        this.grossSales = grossSales;
    }
    public double getGrossSales() {
        return grossSales;
    }

    public void setCommissionRate(double commissionRate) {
        if(commissionRate <= 0.0 || commissionRate >= 1.0){
            throw new IllegalArgumentException("Commission rate must be > 0.0 and < 1.0");
        }
        this.commissionRate = commissionRate;
    }
    public double getCommissionRate() {
        return commissionRate;
    }
    
    public double earnings(){
        return getCommissionRate() * getGrossSales();
    }
    
    public String toString(){
        return String.format("commission employee: %s %s\nsocial security number: %s\ngross sales: %.2f\ncommission rate: %.2f", firstName, lastName, socialSecurity, getGrossSales(), getCommissionRate());
    }
    
    
}