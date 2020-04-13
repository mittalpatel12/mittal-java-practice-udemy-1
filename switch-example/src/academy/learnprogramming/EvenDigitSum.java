package academy.learnprogramming;

public class EvenDigitSum {
    public static void main(String[] args) {
        int sum1 = evenSum(34845);
        System.out.println("sum is" +sum1);

    }
    private static int evenSum(int number){
        int sum = 0;
        while(number > 0){
            int reminder = number % 10;
            if (reminder % 2 == 0) {
                sum += reminder;
            }
            number /= 10;

        } return sum;

    }
}
