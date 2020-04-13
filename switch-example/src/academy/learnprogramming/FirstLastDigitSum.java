package academy.learnprogramming;

public class FirstLastDigitSum {
    public static void main(String[] args) {
        int sum1 = isSum(4635378);
        System.out.println("sum of first and last digit is" +sum1);
    }

    private static int isSum(int number)
    {
        if (number == 0)
            return 0;

        int lastDigit = number % 10;
        int sum = 0;
        while(number > 9) {
            number /= 10;
        }
        sum = lastDigit + number;
        return sum;
    }

}
