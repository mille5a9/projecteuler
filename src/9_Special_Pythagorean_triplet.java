// A Pythagorean triplet is a set of three natural numbers, a < b < c, for which,
// a2 + b2 = c2
// For example, 32 + 42 = 9 + 16 = 25 = 52.
// There exists exactly one Pythagorean triplet for which a + b + c = 1000.
// Find the product abc.
class ProjectEuler {
    public static void main(String[] args) {
        // a = m^2 - n^2
        // b = 2 * m * n
        // c  = m^2 + n^2
        int a = 0, b = 0, c = 0, m = 2;

        while (a + b + c != 1000) {
            for (int n = 1; n < m; n++) {
                a = m * m - n * n;
                b = 2 * m * n;
                c = m * m + n * n;
                if (a + b + c == 1000) break;
                System.out.println(a + " " + b + " " + c);
            }
            m++;
        }
        long product = a * b * c;
        System.out.println(a + " " + b + " " + c);
        System.out.println(product); 
    }
}