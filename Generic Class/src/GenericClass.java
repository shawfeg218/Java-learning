class Num<T> {
    private T a;
    public Num(T a){
        this.a = a;
    }
    public void print1(){
        System.out.printf("%s\n", a);
    }
}

public class GenericClass {
    public static void main(String[] args){
        Num<Integer> integerNum = new Num<>(41);
        Num<Double> doubleNum = new Num<>(3.2);
        integerNum.print1();
        doubleNum.print1();
    }
}