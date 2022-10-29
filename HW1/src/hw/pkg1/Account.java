package hw.pkg1;
public class Account {
    private String name;
    private double balance;
    
    public Account(String name, double balance){
        this.name=name;
        
        if(balance>0.0){
            this.balance=balance;
        }
    }
    public void deposit(double depositAmount){
        if(depositAmount>0.0){
            balance=balance+depositAmount;
        }
    }
    public void withdraw(double withdrawAmount){
        if(withdrawAmount<balance){
            balance=balance-withdrawAmount;
        }
        else{
            System.out.println("Withdraw amount exceeded account balance.");
        }
    }
    public double getBalance(){
        return balance;
    }
    public String getName(){
        return name;
    }
}

