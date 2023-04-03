public class BasePlusCommissionEmployeeTest{
    public static void main(String[] args){
        BasePlusCommissionEmployee employee1 = new BasePlusCommissionEmployee("Bob", "Lewis","333-33-3333", 5000, 0.04, 300);
        System.out.printf("%s\n",employee1);
        employee1.setBaseSalary(1000);
        System.out.printf("\nUpdated employee information:\n\n%s\n",employee1);
    }
}