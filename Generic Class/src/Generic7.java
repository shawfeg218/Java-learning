class max_of_array <T extends Comparable<T>> {
    private T[] array;
    public max_of_array(T[] arr){
        this.array = arr;
    }
    public void print_max(){
        T max = array[0];
        for(T item: array){
            if(item.compareTo(max) > 0){
                max = item;
            }
        }
        System.out.printf("Max = %s\n", max);
    }
}

public class Generic7 {
    public static void main(String[] args){
        Integer[] a = {2, 3, 5, 67, 45};
        max_of_array<Integer> arr = new max_of_array<>(a);
        arr.print_max();
        
        Double[] b = {1.1, 2.2, 3.3, 4.4, 5.5};
        max_of_array<Double> arr1 = new max_of_array<>(b);
        arr1.print_max();
    }
}
