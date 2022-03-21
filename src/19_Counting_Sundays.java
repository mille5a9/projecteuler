// You are given the following information, but you may prefer to do some research for yourself.
//     1 Jan 1900 was a Monday.
//     Thirty days has September,
//     April, June and November.
//     All the rest have thirty-one,
//     Saving February alone,
//     Which has twenty-eight, rain or shine.
//     And on leap years, twenty-nine.
//     A leap year occurs on any year evenly divisible by 4, but not on a century unless it is divisible by 400.
// How many Sundays fell on the first of the month during the twentieth century (1 Jan 1901 to 31 Dec 2000)?

class ProjectEuler {
    public static void main(String[] args) {
        int elapsedDays = 2, sundays = 0; // so % 7 == 0 is a Sunday
        for (int year = 1901; year < 2001; year++) {
            for (int month = 1; month < 13; month++) {
                elapsedDays += ProjectEuler.advanceMonth(month, year);
                if (elapsedDays % 7 == 0) sundays++;
            }
        }
        System.out.println("" + elapsedDays + " : " + sundays); 
    }

    // returns number of days to the first of the next month
    private static int advanceMonth(int month, int year) {
        switch (month) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12: return 31;
            case 4: case 6: case 9: case 11: return 30;
            default: {
                if (ProjectEuler.isLeapYear(year)) return 29;
                else return 28;
            }
        }
    }

    private static boolean isLeapYear(int year) {
        return ((year % 4 == 0) && (year % 100 != 0 || year % 400 == 0));
    }
}