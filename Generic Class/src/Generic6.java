class max_of_two<T extends Comparable<T>> {
    private T a, b, max;
    public max_of_two(T a, T b){
        this.a = a;
        this.b = b;
    }
    public void find_max(){
        if (a.compareTo(b) > 0){
            max = a;
        }else {
            max = b;
        }
    }
    public void printMax() {
        System.out.printf("max=%s\n", max);
    }
}

public class Generic6 {
    public static void main(String[] args){
        max_of_two<Integer> pair1 = new max_of_two<>(81, 12);
        max_of_two<Double> pair2 = new max_of_two<>(3.2, 4.5);
        pair1.find_max();
        pair2.find_max();
        pair1.printMax();
        pair2.printMax();
    }
}