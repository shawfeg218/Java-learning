public class RationalTest {
    public static void main(String[] args) {
        
        Rational f1 = new Rational(2,6);
        Rational f2 = new Rational(2,10);
        
        Rational sum = addTwo(f1, f2);
        System.out.printf("%s + %s = %s (%s)%n", f1, f2, sum, sum.toFloatingPoint());
        
        Rational diff = subtractTwo(f1, f2);
        System.out.printf("%s - %s = %s (%s)%n", f1, f2, diff, diff.toFloatingPoint());

        Rational product = multiplyTwo(f1,f2);
        System.out.printf("%s * %s = %s (%s)%n", f1, f2, product, product.toFloatingPoint());
        
        Rational quotient = divideTwo(f1,f2);
        System.out.printf("%s / %s = %s (%s)%n", f1, f2, quotient, quotient.toFloatingPoint());
        
    }
    public static Rational addTwo(Rational F1, Rational F2){
        Rational result;
        int Rnum;
        int Rden;
        if(F1.getDenominator() == F2.getDenominator()){
            Rnum = F1.getNumerator() + F2.getNumerator();
            result = new Rational(Rnum, F1.getDenominator());
        }else{
            Rnum = F1.getNumerator()*F2.getDenominator() + F2.getNumerator()*F1.getDenominator();
            Rden = F1.getDenominator() * F2.getDenominator();
            result = new Rational(Rnum, Rden);
        }
        return result;
    }
    public static Rational subtractTwo(Rational F1, Rational F2){
        Rational result;
        int Rnum;
        int Rden;
        if(F1.getDenominator() == F2.getDenominator()){
            Rnum = F1.getNumerator() - F2.getNumerator();
            result = new Rational(Rnum, F1.getDenominator());
        }else{
            Rnum = F1.getNumerator()*F2.getDenominator() - F2.getNumerator()*F1.getDenominator();
            Rden = F1.getDenominator() * F2.getDenominator();
            result = new Rational(Rnum, Rden);
        }
        return result;
    }
    public static Rational multiplyTwo(Rational F1, Rational F2){
        Rational result;
        int Rnum;
        int Rden;
        Rnum = F1.getNumerator() * F2.getNumerator();
        Rden = F1.getDenominator() * F2.getDenominator();
        result = new Rational(Rnum, Rden);
        
        return result;
    }
    public static Rational divideTwo(Rational F1, Rational F2){
        Rational result;
        int Rnum;
        int Rden;
        Rnum = F1.getNumerator() * F2.getDenominator();
        Rden = F1.getDenominator() * F2.getNumerator();
        result = new Rational(Rnum, Rden);
        
        return result;
    }
    
}