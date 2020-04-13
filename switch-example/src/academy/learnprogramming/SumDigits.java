package academy.learnprogramming;

public class SumDigits {

    public static void main(String[] args) {

        int sum1 = sumDigits(125);
        System.out.println("Sum of digit of the number is: " +sum1);

        int sum2 = sumDigits(120);
        System.out.println("Sum of digit of the number is: " +sum2);

        int sum3 = sumDigits(234);
        System.out.println("Sum of digit of the number is: " +sum3);

        int sum4 = sumDigits(4);
        System.out.println("Sum of digit of the number is: " +sum4);
    }

    private static int sumDigits(int number) {
        if (number < 10) {
            return -1;
        }
        int sum = 0;

        while(number > 0) {
            int digit = number % 10;
            sum = sum + digit;
            number = number /10;
        } return sum;


    }
}
