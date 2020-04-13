public class LeapYear {
    public static Boolean isLeapYear(int year) {
        if (year >= 1 && year <= 9999) {
            return true;
        }
        return false;
    }

    public static Boolean calculateLeapYear(Boolean validYear, int year){

        if (validYear == true)
        {
            if ((year % 400) == 0)
                return true;
            if ((year % 100) == 0)
                return false;
            if ((year % 4) == 0)
                return true;
        }
        return false;
    }

    public static void printLeapYear(Boolean leapYear)
    {
        if (leapYear == true)
            System.out.println("Year is a LeapYear" );
        else
            System.out.println("Year is not a LeapYear");
    }
}
