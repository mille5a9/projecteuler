class FactorialUnder20 {

    //Given an integer, calculate the factorial as a long
    private static long factorialUnder20(int n) {
        long fact = 1;
        for (int i = 2; i <= n; i++) {
            fact = fact * i;
        }
        return fact;
    }
}