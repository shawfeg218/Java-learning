//public class JavaTry {
//    public static void main(String[] args) {
//        G1 t1 = new G11();
//        G1 t2 = new G12();
//        t1.print_sum();
//        t2.print_sum();
//    }
//}
//
//abstract class G1 {
//    private int a = 3;
//    protected int c = 8;
//
//    public int getA() {
//        return a;
//    }
//    
//    public abstract void print_sum();
//}
//
//class G11 extends G1 {
//    private int b = 2;
//    public void print_sum() {
//        int sum = getA() + c + b;
//        System.out.printf("%d, %d and %d in G11 sum = %d\n", getA(), c, b, sum);
//    }
//}
//
//class G12 extends G1 {
//    private int b = 4;
//    public void print_sum() {
//        int sum = getA() + c + b;
//        System.out.printf("%d, %d and %d in G12 sum = %d\n", getA(), c, b, sum);
//    }
//}


public class JavaTry{
    public static void main(String[] args){
        G1 t1 = new G11();
        G1 t2 = new G12();
        t1.print_sum();
        t2.print_sum();
    }
}

abstract class G1 {
    private int a = 3;
    protected int c = 8;

    public int getA() {
        return a;
    }
    
    public abstract void print_sum();
}

class G11 extends G1 {
    private int b = 2;
    public void print_sum(){
        System.out.printf("%d, %d and %d in G11, sum is %d\n", getA(), b, c, getA()+b+c);
    }
}

class G12 extends G1 {
    private int b = 4;
    
    public void print_sum() {
        System.out.printf("%d, %d and %d in G12, sum is %d\n", getA(), b, c, getA()+b+c);
    }
}