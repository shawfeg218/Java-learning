class Pair<T> {
    private T a,b;

    public Pair(T a, T b){
        this.a = a;
        this.b = b;
    }

    public void exchange(){
        T tmp;
        tmp = a;
        a = b;
        b = tmp;
    }

    public void print2(){
        System.out.printf("a=%s, b=%s\n", a, b);
    }
    
}

public class Exchange {
    public static void main(String[] args){
        Pair<Integer> pair1 = new Pair<>(3, 5);
        Pair<Double> pair2 = new Pair<>(3.4, 5.2);
        int x = 8, y = 7;
        double u = 8.8, v = 7.7;
        
        pair1.print2();
        pair2.print2();
        pair1.exchange();
        pair2.exchange();
        System.out.println("After exchange: ");
        pair1.print2();
        pair2.print2();
        
        System.out.println();
        System.out.printf("x=%d, y=%d\n", x, y);
        System.out.printf("u=%.1f, v=%.1f\n", u, v);
        exchange(x, y);
        exchange(u, v);
        System.out.println("After exchange:");
        System.out.printf("%s, %s\n", x,y);
        System.out.printf("%s, %s\n", u,v);
        
        int z=15, s=12, tmp;
        tmp = z;
        z = s;
        s = tmp;
        System.out.printf("z=%d, s=%d\n", z, s);
    }
    public static <T> void exchange(T a, T b){
        T tmp;
        tmp = a;
        a = b;
        b = tmp;
        System.out.printf("%s, %s\n", a,b);
    }
}