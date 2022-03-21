// The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.
// Find the sum of all the primes below two million.

class ProjectEuler {
    public static void main(String[] args) {
        int limit = 2000000;
        long sum = 0;
        for (int i = 0; i < limit; i++) {
            if (ProjectEuler.isPrime(i)) sum += i;
        }

        System.out.println(sum); 
    }

    //Given an integer, return true if the integer is prime
    private static boolean isPrime(int n) {
        if (n <= 1) return false;
        else if (n == 2) return true;
        else if (n % 2 == 0) return false;

        for (int i = 3; i <= Math.sqrt(n); i += 2) {
            if (n % i == 0) return false;
        }
        return true;
    }
}