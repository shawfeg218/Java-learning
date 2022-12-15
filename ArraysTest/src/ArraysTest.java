//import java.util.Arrays;
//
//public class ArraysTest{
//    public static void main(String[] args){
//        
//        double[] doubleArray = {8.4, 9.3, 0.2, 7.9, 3.4};
//        
//        Arrays.sort(doubleArray);
//        System.out.print("doubleArray after sort: ");
//        for(double num : doubleArray){
//            System.out.printf("%.1f ", num);
//        }
//        System.out.println();
//        
//        int[] filledIntArray = new int[10];
//        Arrays.fill(filledIntArray, 6);
//        displayArray(filledIntArray, "filledIntArray");
//        System.out.println();
//        
//        int[] intArray = {1, 2, 3, 4, 5, 6};
//        int[] intArrayCopy = new int[intArray.length];
//        System.arraycopy(intArray, 0, intArrayCopy, 0, intArray.length);
//        displayArray(intArrayCopy, "intArrayCopy");
//        System.out.println();
//        
//        boolean b = Arrays.equals(intArray, intArrayCopy);
//        System.out.printf("intArray %s intArrayCopy%n", (b? "==":"!="));
//        b = Arrays.equals(intArray, filledIntArray);
//        System.out.printf("intArray %s intArrayCopy%n", (b? "==":"!="));
//        
//        int location = Arrays.binarySearch(intArray, 5);
//        if(location > 0){
//            System.out.printf("The index of 5 in intArray is %d%n", location);
//        }else{
//            System.out.printf("5 not found in intArray.%n");
//        }
//        
//        location = Arrays.binarySearch(intArray, 8888);
//        if(location > 0){
//            System.out.printf("The index of 8888 in intArray is %d%n", location);
//        }else{
//            System.out.printf("8888 not found in intArray.%n");
//        }
//        
//        
//    }
//    public static void displayArray(int[] array, String arrayName){
//        System.out.print(arrayName + ": ");
//        for(int num : array){
//            System.out.printf("%d ", num);
//        }
//    }
//}


import java.util.Arrays;
public class ArraysTest{
    public static void main(String[] args){
        double[] doubleArray = {8.4, 9.3, 0.2, 7.9, 3.4};
        Arrays.sort(doubleArray);
        for(double n : doubleArray){
            System.out.printf("%.1f ", n);
        }
        System.out.println();
        
        int[] fillInArray = new int[5];
        Arrays.fill(fillInArray, 4);
        displayArray(fillInArray);
        
        int[] intArray = {1,2,3,4,5};
        int[] intArrayCopy = new int[intArray.length];
        System.arraycopy(intArray, 0, intArrayCopy, 0, intArray.length);
        displayArray(intArrayCopy);
        
        boolean b = Arrays.equals(intArray, intArrayCopy);
        System.out.printf("intArray %s intArrayCopy%n", b? "==":"!=");
        b = Arrays.equals(intArray, fillInArray);
        System.out.printf("intArray %s fillInArray%n", b? "==":"!=");
        
        int location = Arrays.binarySearch(intArray, 3);
        if(location > 0){
            System.out.printf("3 is in the intArray of index=%d%n", location);
        }else{
            System.out.println("There is no 3");
        }
        location = Arrays.binarySearch(intArray, 888);
        if(location > 0){
            System.out.printf("888 is in the intArray of index=%d%n", location);
        }else{
            System.out.println("There is no 888");
        }
        
    }
    public static void displayArray(int[] array){
        for(int n : array){
            System.out.printf("%d ", n);
        }
        System.out.println();
    }
}










