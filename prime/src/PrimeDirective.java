class PrimeDirective {

    // Add your methods here:
    public boolean isPrime(int number) {
        if (number == 2) {
            return true;
        } else if (number < 2) {
            return false;
        }
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        PrimeDirective pd = new PrimeDirective();
        int[] numbers = { 6, 29, 28, 33, 11, 100, 101, 43, 89 };
        for(int i = 0; i < numbers.length; i++) {
            boolean isPrime = pd.isPrime(numbers[i]);
            System.out.println(numbers[i] + " is prime: " + isPrime);
        }
    }

}