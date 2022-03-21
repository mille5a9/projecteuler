package helpers;


// determine the greatest common factor of n1 and n2
class GCDHelper {
    public static long GCD(long n1, long n2) {
        if (n2 == 0) return n1;
        return GCD(n2, n1 % n2);
    }
    
    public static int GCD(int n1, int n2) {
        if (n2 == 0) return n1;
        return GCD(n2, n1 % n2);
    }
}