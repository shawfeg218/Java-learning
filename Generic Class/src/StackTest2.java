import java.util.ArrayList;
class Stack1<T> {
    private ArrayList<T> elements;
    public Stack1(){
        this(10);
    }
    public Stack1(int capacity){
        int initCapacity = capacity>0 ? capacity:10;
        elements = new ArrayList<T>(initCapacity);
    }
    public void push(T pushValue){
        elements.add(pushValue);
    }
    public T pop(){
        if(elements.isEmpty()){
            System.exit(1);
        }
        return elements.remove(elements.size() - 1);
    }
}

public class StackTest2 {
    public static void main(String[] args){
        Stack1<Integer> integerStack = new Stack1<>();
        Stack1<Double> doubleStack = new Stack1<>();
        String[] a = {"push", "12", "push", "33", "pop", "pop", "push", "45"};
        String[] b = {"push", "12.3", "push", "33.5", "pop", "pop", "push", "45.3", "pop"};
        
        int i=0;
        int value;
        double d_value;
        while(i < a.length){
            if(a[i].equals("push")){
                i++;
                value = Integer.parseInt(a[i]);
                testPush(integerStack, value);
            }
            if(a[i].equals("pop")){
              testPop(integerStack);  
            }
            i++;
        }
        
        i = 0;
        
        while(i < b.length){
            if(b[i].equals("push")){
                i++;
                d_value = Double.parseDouble(b[i]);
                testPush(doubleStack, d_value);
            }
            if(b[i].equals("pop")){
                testPop(doubleStack);
            }
            i++;
        }
        
    }
    private static <T> void testPush(Stack1<T> stack, T value){
        System.out.println("Pushing value into stack");
        System.out.printf("%s \n", value);
        stack.push(value);
    }
    private static <T> void testPop(Stack1<T> stack){
        System.out.println("Popping value from stack");
        T popValue;
        popValue = stack.pop();
        System.out.printf("%s \n", popValue);
    }
}
