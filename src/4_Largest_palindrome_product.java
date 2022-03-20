//A palindromic number reads the same both ways. The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.
//Find the largest palindrome made from the product of two 3-digit numbers.

import java.util.Stack;

class ProjectEuler {
    public static void main(String[] args) {
        int max = 0, maxComp1 = 0, maxComp2 = 0;

        // try all component2 values for each component1 starting with largest first
        for (int component1 = 999; component1 > 99; component1--) {
            for (int component2 = component1; component2 > 99; component2--) {
                int product = component1 * component2;

                if (isPalindrome(product)) {
                    if (product > max) {
                        max = product;
                        maxComp1 = component1;
                        maxComp2 = component2;
                    }
                }
            }
        }

        System.out.println("Final Answer: " + maxComp1 + " * " + maxComp2 + " = " + max); 
    }

    private static boolean isPalindrome(int n) {
        Stack<Character> charStack = new Stack<Character>();
        String subject = Integer.toString(n);
        int size = subject.length();

        // scan first half of string
        for (int i = 0; i < (size / 2); i++) {
            charStack.push(subject.charAt(i));
        }

        // pop middle char if size is odd
        if (size % 2 == 1) charStack.pop();

        // read out in reverse order
        for (int i = (size / 2); i < size; i++) {
            Character current = charStack.pop();
            if (subject.charAt(i) != current) return false;
            if (charStack.empty()) break;
        }

        return true;
    }
}