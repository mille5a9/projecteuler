//The prime factors of 13195 are 5, 7, 13 and 29.
//What is the largest prime factor of the number 600,851,475,143 ?

class ProjectEuler {
    public static void main(String[] args) {
        long product = 600851475143L;
        while (ProjectEuler.isPrime(product) == false) {
            for (int i = 2; i < product; i++) {
                if (ProjectEuler.isPrime(i) == false) continue;
                if (product % i == 0) {
                    product = product / i;
                    break;
                }
            }
        }

        System.out.println(product); 
    }

    //Given an integer, return true if the integer is prime
    private static boolean isPrime(long n) {
        if (n <= 1) return false;
        else if (n == 2) return true;
        else if (n % 2 == 0) return false;

        for (int i = 3; i <= Math.sqrt(n); i += 2) {
            if (n % i == 0) return false;
        }
        return true;
    }
}