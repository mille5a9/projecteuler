class GetDivisorCount {

    public static int getDivisorCount(long n) {
        int divisorCount = 0, sqrt = (int)Math.sqrt(n);
        for (int i = 1; i <= sqrt; i++) {
            if (n % i == 0) divisorCount += 2;
        }
        return divisorCount;
    }
}