//public class StudentPoll{
//    public static void main(String[] args){
//        int[] responses = {1,2,5,4,3,5,2,1,3,3,1,4,3,3,3,2,3,3,2,14};
//        int[] frequency = new int[6];
//        for(int i=0; i<responses.length; i++){
//            try{
//                frequency[responses[i]]++;
//            }catch(ArrayIndexOutOfBoundsException e){
//                System.out.println(e);
//                System.out.printf("responses[%d] = %d%n", i, responses[i]);
//            }
//        }
//        System.out.printf("Rating \t Frequency%n");
//        for(int i=1; i<frequency.length; i++){
//            System.out.printf("%d \t %d%n", i, frequency[i]);
//        }
//    }
//}

public class StudentPoll{
    public static void main(String[] args){
        int[] responses = {1,2,5,4,3,5,2,1,3,3,1,4,3,3,3,2,3,3,2,14};
        int[] frequency = new int[6];
        try{
            for(int ch : responses){
                frequency[ch]++;
            }
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }
        
        System.out.println("Rate \t Frequency");
        for(int i=1; i<6; i++){
            System.out.printf("%d \t %d%n", i, frequency[i]);
        }
    }
}