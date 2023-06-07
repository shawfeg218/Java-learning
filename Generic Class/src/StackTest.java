import java.util.NoSuchElementException;
public class StackTest {
    public static void main(String[] args){
        Double[] doubleElements = {1.1, 2.2, 3.3, 4.4, 5.5};
        Integer[] integerElements = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        Stack<Double> doubleStack = new Stack<>(5);
        Stack<Integer> integerStack = new Stack<>();
        
        pushElements(doubleStack, doubleElements);
        popElements(doubleStack);
        
        pushElements(integerStack, integerElements);
        popElements(integerStack);
        
    }
    
    public static <E> void pushElements(Stack<E> stack, E[] values){
        System.out.println("\nPushing elements");
        for(E value: values){
            System.out.printf("%s ", value);
            stack.push(value);
        }
    }
    
    public static <E> void popElements(Stack<E> stack){
        try {
            System.out.println("\nPopping elements");
            E popValue;
            while(true){
                popValue = stack.pop();
                System.out.printf("%s ", popValue);
            }
        }
        catch(NoSuchElementException noSuchElementException) {
            System.err.println();
            noSuchElementException.printStackTrace();
        }
    }
    
}