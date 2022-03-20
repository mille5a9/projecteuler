// By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.
// What is the 10 001st prime number?
class ProjectEuler {
    public static void main(String[] args) {
        // start count at 1 because of 2, and the loop starts looking at 3
        int primeCount = 2, current = 3;

        while (primeCount < 10001) {
            current += 2;
            if (ProjectEuler.isPrime(current)) primeCount++;
        }
        
        System.out.println("" + primeCount + ": " + current); 
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