public class JavaTry{ 
    public static void main( String args[]){ 
        G1 t1 = new G11();
        G1 t2 = new G12();
        t1.print_sum();
        t2.print_sum();
    } 
}  
abstract class G1{ 
    private int a = 3;
    protected int c = 8;
    public int geta(){
        return a;
    }
    public abstract void print_sum( );  // print the sum of a, b and c
}  
class G11 extends G1{  
    private int b = 2;
    public void print_sum(){
        System.out.println("In G11:");
        System.out.printf("a is %d , b is %d , c is %d\n",geta(),b,c);
        System.out.printf("The sum of a,b and c is %d\n\n",geta()+b+c);
    }
} 
class G12 extends G1{
    private int b = 4;
    public void print_sum(){
        System.out.println("In G12:");
        System.out.printf("a is %d , b is %d , c is %d\n",geta(),b,c);
        System.out.printf("The sum of a,b and c is %d\n",geta()+b+c);
    }
}
