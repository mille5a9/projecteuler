// Let d(n) be defined as the sum of proper divisors of n (numbers less than n which divide evenly into n).
// If d(a) = b and d(b) = a, where a ≠ b, then a and b are an amicable pair and each of a and b are called amicable numbers.
// For example, the proper divisors of 220 are 1, 2, 4, 5, 10, 11, 20, 22, 44, 55 and 110; therefore d(220) = 284. The proper divisors of 284 are 1, 2, 4, 71 and 142; so d(284) = 220.
// Evaluate the sum of all the amicable numbers under 10000.
import java.util.HashMap;
import java.util.Collection;

class ProjectEuler {
    public static void main(String[] args) {
        HashMap<Integer, Integer> dict = new HashMap<Integer, Integer>();
        int amicableSum = 0;

        for (int i = 1; i < 10000; i++) {
            int current = ProjectEuler.sumDivisors(i);
            if (i == ProjectEuler.sumDivisors(current)) {
                if (current == i) continue;
                dict.put(current, i);
            }
        }

        Collection<Integer> values = dict.values();
        for (int value : values) { 
            System.out.println(amicableSum);
            amicableSum += value;
        }

        System.out.println(amicableSum); 
    }

    private static int sumDivisors(int n) {
        int sum = 0;
        for (int i = 1; i < n; i++) {
            if (n % i == 0) sum += i;
        }
        return sum;
    }
}