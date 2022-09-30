public class Account {
    
    private String name;
    private double balance;
    
    public Account(String name, double balance) {
        this.name = name;
        if(balance > 0 ){
            
        }
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

}
