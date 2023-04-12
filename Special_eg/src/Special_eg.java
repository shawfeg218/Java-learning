//public class Special_eg {
//    public static void main(String[] args){
//        G t1 = new G11();
//        t1.print_sum();
//    }
//}
//
//abstract class G {
//    private int a = 3;
//    public int geta(){
//        return a;
//    }
//    public abstract void print_sum();
//}
//
//abstract class G1 extends G {
//    private int b = 7;
//    public int getb(){
//        return b;
//    }
//    public abstract void print_all();
//    public void print_sum(){
//        print_all();
//    }
//}
//
//class G11 extends G1 {
//    public void print_all(){
//        System.out.println("sum of a and b is " + (geta()+getb()));
//    }
//}


public class Special_eg{
    public static void main(String[] args){
        G1 t1 = new G11();
        t1.print_sum();
    }
}

abstract class G{
    private int a = 3;
    public int getA(){
        return a;
    }
    public abstract void print_sum();
}

abstract class G1 extends G{
    private int b = 2;
    public int getB(){
        return b;
    }
    public abstract void print_all();
    public void print_sum(){
        print_all();
    }
}

class G11 extends G1 {
    public void print_all(){
        System.out.printf("sum of a and b is %d", getA()+getB());
    }
}