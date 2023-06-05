//// Stack.java
//import java.util.ArrayList;
//import java.util.NoSuchElementException;
//public class Stack<E> {
//    private ArrayList<E> elements;
//    
//    public Stack(){
//        this(10);
//    }
//    
//    public Stack(int capacity){
//        int initCapacity = capacity > 0 ? capacity:10;
//        this.elements = new ArrayList<E>(initCapacity);
//    }
//    
//    public void push(E pushValue){
//        elements.add(pushValue);
//    }
//    
//    public E pop(){
//        if(elements.isEmpty()){
//            throw new NoSuchElementException("Stack is empty, cannnot pop");
//        }
//        return elements.remove(elements.size()-1);
//    }
//    
//}