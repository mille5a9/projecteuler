// If the numbers 1 to 5 are written out in words: one, two, three, four, five, then there are 3 + 3 + 5 + 4 + 4 = 19 letters used in total.
// If all the numbers from 1 to 1000 (one thousand) inclusive were written out in words, how many letters would be used?
// NOTE: Do not count spaces or hyphens. For example, 342 (three hundred and forty-two) contains 23 letters and 115 (one hundred and fifteen) contains 20 letters. The use of "and" when writing out numbers is in compliance with British usage.

class ProjectEuler {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i < 1001; i++) {
            sum += ProjectEuler.letterCount(i);
        }
        System.out.println(sum); 
    }

    private static int letterCount(int n) {
        int sum = 0;
        switch (n / 100) { // hundreds place
            case 1: case 2: case 6: sum = 10; break;// one, two, six hundred
            case 4: case 5: case 9: sum = 11; break;
            case 3: case 7: case 8: sum = 12; break;
            case 10: return 11;
            default: sum = 0;
        }
        if (n % 100 > 0 && sum > 0) sum += 3; // "and" after the hundreds

        switch((n % 100) / 10) { // tens place
            case 4: case 5: case 6:         sum += 5; break;// forty fifty sixty
            case 2: case 3: case 8: case 9: sum += 6; break;// twenty thirty eighty ninety
            case 7:                         sum += 7; break;// seventy
        }
        if (((n % 100) / 10) == 1) {
            switch (n % 20) {// explicitly define 1 to 19
                case 19: sum += 8; break;//nineteen
                case 18: sum += 8; break;//eighteen
                case 17: sum += 9; break;//seventeen
                case 16: sum += 7; break;//sixteen
                case 15: sum += 7; break;//fifteen
                case 14: sum += 8; break;//fourteen
                case 13: sum += 8; break;//thirteen
                case 12: sum += 6; break;//twelve
                case 11: sum += 6; break;//eleven
                case 10: sum += 3; break;
            }
        }
        else {
            switch (n % 10) {
                case 9: sum += 4; break;
                case 8: sum += 5; break;
                case 7: sum += 5; break;
                case 6: sum += 3; break;
                case 5: sum += 4; break;
                case 4: sum += 4; break;
                case 3: sum += 5; break;
                case 2: sum += 3; break;
                case 1: sum += 3; break;
            }
        }

        return sum;
    }
}