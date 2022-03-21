// 2^15 = 32768 and the sum of its digits is 3 + 2 + 7 + 6 + 8 = 26.
// What is the sum of the digits of the number 2^1000?

import java.math.BigInteger;

class ProjectEuler {
    public static void main(String[] args) {
        Integer input = 2, exp = 15, sum = 0;
        BigInteger n = new BigInteger(input.toString());
        n = n.pow(exp);
        String product = n.toString();
        for (int i = 0; i < product.length(); i++) {
            String productDigit = product.substring(i, i + 1);
            sum += Integer.parseInt(productDigit);
        }
        System.out.println(sum); 
    }
}