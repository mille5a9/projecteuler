// Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum.

class ProjectEuler {
    public static void main(String[] args) {
        long sumSquare = 0, squareSum = 0;

        for (int i = 1; i < 101; i++) {
            sumSquare += i;
            squareSum += (i * i);
        }

        sumSquare *= sumSquare;
        System.out.println("Sum of Squares: " + sumSquare + "\nSquare of Sums: " + squareSum); 

        long diff = sumSquare - squareSum;
        System.out.println("Difference: " + diff);
    }
}