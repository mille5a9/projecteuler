// 2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.
// What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?

class ProjectEuler {
    public static void main(String[] args) {
        int highestDivisor = 20;
        long runningProduct = 1;

        // least common multiple = (a * b) / gcd(a, b)
        for (int i = 2; i <= highestDivisor; i++) {
            runningProduct = (runningProduct * i) / ProjectEuler.GCD(runningProduct, i);
            System.out.println(runningProduct);
        }
    }

    private static long GCD(long n1, long n2) {
        if (n2 == 0) return n1;
        return GCD(n2, n1 % n2);
    }
}