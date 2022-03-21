// n! means n × (n − 1) × ... × 3 × 2 × 1
// For example, 10! = 10 × 9 × ... × 3 × 2 × 1 = 3628800,
// and the sum of the digits in the number 10! is 3 + 6 + 2 + 8 + 8 + 0 + 0 = 27.
// Find the sum of the digits in the number 100!
import java.math.BigInteger;

class ProjectEuler {
    public static void main(String[] args) {
        String largeNumber = factorialOver20(100).toString();
        int sum = 0;

        for (int i = 0; i < largeNumber.length(); i++) {
            sum += Integer.parseInt(largeNumber.substring(i, i + 1));
        }

        System.out.println(sum); 
    }

    private static BigInteger factorialOver20(int n) {
        BigInteger factorial = BigInteger.ONE;

        for (int i = n; i > 0; i--) {
            factorial = factorial.multiply(BigInteger.valueOf(i));
        }

        return factorial;
    }
}