// Starting in the top left corner of a 2×2 grid, and only being able to move to the right and down, there are exactly 6 routes to the bottom right corner.
// How many such routes are there through a 20×20 grid?
import java.math.BigInteger;

class ProjectEuler {
    public static void main(String[] args) {
        int length = 20;

        System.out.println(binomialCoefficient(length * 2, length)); 
    }

    private static BigInteger binomialCoefficient(int n, int k) {
        return ProjectEuler.factorialOver20(n).divide(
            ProjectEuler.factorialOver20(n - k).multiply(ProjectEuler.factorialOver20(k))
        );
    }
    
    private static BigInteger factorialOver20(int n) {
        BigInteger factorial = BigInteger.ONE;

        for (int i = n; i > 0; i--) {
            factorial = factorial.multiply(BigInteger.valueOf(i));
        }

        return factorial;
    }
}