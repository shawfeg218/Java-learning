public class StringMathod {
    public static void main(String[] args){
        String[] s = {"ABCD-123", "XYZ-13888"};
        String[] new_s = new String[s.length];
        
//        String[] letter = new String[s.length];
//        String[] number = new String[s.length];
//        for(int i=0; i<s.length; i++){
//            String[] token = s[i].split("-");
//            letter[i] = token[0];
//            number[i] = token[1];
//        }
//        
//        new_s[0] = letter[0] + "-" + number[1];
//        new_s[1] = letter[1] + "-" + number[0];

        new_s[0] = s[0].replaceAll("123", "13888");
        new_s[1] = s[1].replaceAll("13888", "123");
        
        for(String s1 : new_s){
            System.out.println(s1);
        }
        
    }
}