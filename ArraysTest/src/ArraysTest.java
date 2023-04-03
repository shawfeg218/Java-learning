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
        int[] arr = {2,3,4,6,7,8,0,1,9};
        Arrays.sort(arr);
        displayArray(arr);
        int[] arrcop = new int[arr.length];
        System.arraycopy(arr, 0, arrcop, 0, arr.length);
        displayArray(arrcop);
        System.out.printf("arr %s arrcop%n", Arrays.equals(arr, arrcop)? "==":"!=");
        System.out.printf("5 %s in arr", (Arrays.binarySearch(arr, 5) != -1)? "is":"is not");
    }
    public static void displayArray(int[] arr){
        for(int n : arr){
            System.out.printf("%d ", n);
        }
        System.out.println();
    }
}
