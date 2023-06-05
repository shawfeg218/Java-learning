class One_Num<T> {
    private T x;
    public One_Num(T in_x){
        this.x = in_x;
    }
    public T get_Num(){
        return x;
    }
    public void set_Num(T x){
        this.x = x;
    }
    public void printout(){
        System.out.printf("value is %s\n", x);
    }
}

public class Generic4 {
    public static void main(String[] args){
        One_Num<Integer> i1 = new One_Num<>(8);
        One_Num<Integer> i2 = new One_Num<>(11);
        One_Num<Double> r1 = new One_Num<>(3.2);
        One_Num<Double> r2 = new One_Num<>(6.5);
        
        i1.printout();
        i2.printout();
        System.out.println("After exchange:");
        exchange(i1, i2);
        i1.printout();
        i2.printout();
        System.out.println();
        r1.printout();
        r2.printout();
        System.out.println("After exchange:");
        exchange(r1, r2);
        r1.printout();
        r2.printout();
        
    }
    public static <T> void exchange(One_Num<T> a, One_Num<T> b){
        T ta, tb;
        ta = a.get_Num();
        tb = b.get_Num();
        a.set_Num(tb);
        b.set_Num(ta);
    }
}