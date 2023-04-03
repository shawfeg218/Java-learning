//import java.security.SecureRandom;
//public class RandomNumberList{
//    public static void main(String[] args){
//        ListOfNumbers m = new ListOfNumbers();
//        m.max();
//        m.output();
//    }
//}
//class Number{
//    private int number;
//    SecureRandom randomNumber = new SecureRandom();
//    public Number(){
//        this.number = 1 + randomNumber.nextInt(10);
//    }
//    public int getNumber(){
//        return number;
//    }
//}
//class ListOfNumbers{
//    Number[] numberArray = new Number[10];
//    public ListOfNumbers(){
//        for(int i=0; i<numberArray.length; i++){
//            numberArray[i] = new Number();
//        }
//    }
//    public void max(){
//        int max = numberArray[0].getNumber();
//        for(Number n : numberArray){
//            if(n.getNumber() > max){
//                max = n.getNumber();
//            }
//        }
//        System.out.printf("The max is %d", max);
//    }
//    public void output(){
//        for(int i=0; i<numberArray.length; i++){
//            System.out.printf("%d ", numberArray[i].getNumber());
//        }
//    }
//}

import java.security.SecureRandom;
public class RandomNumberList{
    public static void main(String[] args){
        listOfNumbers mynum = new listOfNumbers();
        mynum.output();
        mynum.max();
    }
}
class Number{
    private int number;
    private static final SecureRandom randomNumber = new SecureRandom();
    public Number() {
        number = 1 + randomNumber.nextInt(10);
    }
    public int getNumber(){
        return number;
    }
}
class listOfNumbers{
    private Number[] arr = new Number[10];

    public listOfNumbers() {
        for(int i=0; i<arr.length; i++){
            arr[i] = new Number();
        }
    }
    public void max(){
        int max = arr[0].getNumber();
        for(Number num : arr){
            if(num.getNumber() > max){
                max = num.getNumber();
            }
        }
        System.out.printf("The max is %d%n", max);
    }
    public void output(){
        for(Number num : arr){
            System.out.printf("%d ", num.getNumber());
        }
    }
}