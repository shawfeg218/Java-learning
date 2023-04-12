public class Try{
    public static void main(String[] args){
        V1 t = new V1(3, 5);
        V11 u = new V11(7, 8, 9);
        t.display( );
        u.display( );
    }
}
class V1{
    private int a;
    private int b;
    public V1(int in_a, int in_b){
        a = in_a;
        b = in_b;
    }
    public void display( ){   
        System.out.println("a is " + a);
        System.out.println("b is " + b);
    }    
}
class V11 extends V1{   
    private int c;
    public V11 (int in_a, int in_b, int in_c){
        this(in_a, in_b);
        c=in_c;
    }
    public V11 (int in_a, int in_b)	{    
        super(in_a,in_b);
    }
    @Override
    public void display( ){   
        super.display( );
        System.out.println("c is " + c);
    }    
}