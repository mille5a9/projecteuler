import java.util.Stack;

class IsPalindrome {

    // returns true if the parameter n is a palindrome
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

    // returns true if the parameter subject is a palindrome
    private static boolean isPalindrome(String subject) {
        Stack<Character> charStack = new Stack<Character>();
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