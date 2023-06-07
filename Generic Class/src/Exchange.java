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
        
        pair1.print2();
        pair2.print2();
        pair1.exchange();
        pair2.exchange();
        System.out.println("After exchange: ");
        pair1.print2();
        pair2.print2();
        
    }
}
