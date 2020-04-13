public class Main {
    public static void main(String[] args)
    {
        Boolean validYear = LeapYear.isLeapYear(2016);
        Boolean leapYear = LeapYear.calculateLeapYear(validYear,2026);
        LeapYear.printLeapYear(leapYear);

        int a = 1;
        int b = 1;

        if (a++ > 10 & b++ > 10) {
            System.out.println("Hello");
        }

        if (a++ < 10 | b++ < 10) {
            System.out.println("Hello");
        }

        System.out.println("a: " + a);
        System.out.println("b: " + b);
    }

}
