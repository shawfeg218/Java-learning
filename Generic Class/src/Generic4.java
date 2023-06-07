//class One_Num<T> {
//    private T x;
//    public One_Num(T in_x){
//        this.x = in_x;
//    }
//    public T get_Num(){
//        return x;
//    }
//    public void set_Num(T x){
//        this.x = x;
//    }
//    public void printout(){
//        System.out.printf("value is %s\n", x);
//    }
//}
//
//public class Generic4 {
//    public static void main(String[] args){
//        One_Num<Integer> i1 = new One_Num<>(8);
//        One_Num<Integer> i2 = new One_Num<>(11);
//        One_Num<Double> r1 = new One_Num<>(3.2);
//        One_Num<Double> r2 = new One_Num<>(6.5);
//        
//        i1.printout();
//        i2.printout();
//        System.out.println("After exchange:");
//        exchange(i1, i2);
//        i1.printout();
//        i2.printout();
//        System.out.println();
//        r1.printout();
//        r2.printout();
//        System.out.println("After exchange:");
//        exchange(r1, r2);
//        r1.printout();
//        r2.printout();
//        
//    }
//    public static <T> void exchange(One_Num<T> a, One_Num<T> b){
//        T ta, tb;
//        ta = a.get_Num();
//        tb = b.get_Num();
//        a.set_Num(tb);
//        b.set_Num(ta);
//    }
//}

class Num1<T> {
    private T a;
    public Num1(T a){
        this.a = a;
    }
    public T getNum1(){
        return a;
    }
    public void setNum1(T new_a){
        a = new_a;
    }
    public void printNum(){
        System.out.printf("Value is %s\n", a);
    }
}

public class Generic4 {
    public static void main(String[] args){
        Num1<Integer> i1 = new Num1<>(5);
        Num1<Integer> i2 = new Num1<>(3);
        Num1<Double> d1 = new Num1<>(3.3);
        Num1<Double> d2 = new Num1<>(6.5);
        
        exchange(i1, i2);
        i1.printNum();
        i2.printNum();
        exchange(d1, d2);
        d1.printNum();
        d2.printNum();
        
    }
    public static <T> void exchange(Num1<T> a, Num1<T> b){
        T ta, tb;
        ta = a.getNum1();
        tb = b.getNum1();
        a.setNum1(tb);
        b.setNum1(ta);
    }
}