public class Rational {
    private int numerator;
    private int denominator;

    // default constructor
    public Rational() {
        this.numerator = 1;
        this.denominator = 1;
    }
    
    //find greatest common divisor
    public int findGcd(int num1, int num2) {
        int gcd = 1;
        int minOfTwo = Math.min(num1, num2);
        for (int i = minOfTwo; i > 1; i--) {
            if (num1 % i == 0 && num2 % i == 0) {
                gcd = i;
            }
        }
        return gcd;
    }

    // reduce form constructor
    public Rational(int numerator, int denominator) {
        int gcd = findGcd(numerator, denominator);
        this.numerator = numerator / gcd;
        this.denominator = denominator / gcd;
    }

    public int getNumerator() {
        return numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public String toString() {
        return numerator + "/" + denominator;
    }
    
    public String toFloatingPoint(){
        double num = numerator;
        double den = denominator;
        return String.format("%.3f", num/den);
    }

}