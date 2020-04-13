package academy.learnprogramming;

public class NumbersToString {

    public static void main(String[] args) {

        int revNum = revrse(100);
        System.out.println("Revrsed number is: " +revNum);

        String value1 = numberToWords(123);
        System.out.println("revrse words of number is: " +value1);




    }
    private static String numberToWords(int number) {

        int actualDigit = getDigitCount(number);
        System.out.println("Actual Digit: " +actualDigit);

        int revNum = revrse(100);
        System.out.println("Revrsed number is: " +revNum);

        int reverseDigit = getDigitCount(revNum);
        System.out.println("reversedDigit: " +reverseDigit);

        if (actualDigit != reverseDigit) {
            int difference = actualDigit - reverseDigit;

            String formattedStr = String.format("%d %d",difference, revNum);
            System.out.println("With leading zeros = " + formattedStr);

        }
        String revrse_value = "";
        String final_string = "";

        while (number > 0) {
            int reminder = number % 10;
            number /= 10;
            switch (reminder) {
                case 0:
                    revrse_value = "ZERO";
                    break;
                case 1:
                    revrse_value = "ONE";
                    break;
                case 2:
                    revrse_value = "TWO";
                    break;
                case 3:
                    revrse_value = "THREE";
                    break;
                case 4:
                    revrse_value = "FOUR";
                    break;
                case 5:
                    revrse_value = "FIVE";
                    break;
                case 6:
                    revrse_value = "SIX";
                    break;
                case 7:
                    revrse_value = "SEVEN";
                    break;
                case 8:
                    revrse_value = "EIGHT";
                    break;
                case 9:
                    revrse_value = "NINE";
                    break;
                default:
                    break;

            }
            final_string = final_string +" " + revrse_value;
        } return final_string;

    }
    public static int revrse(int number1) {
        int reversed = 0;

        while(number1 != 0) {
            int digit = number1 % 10;
            reversed = reversed * 10 + digit;
            number1 /= 10;
        }
        return reversed;


    }

    private static int getDigitCount(int number2) {
        int count = 0;
        while (number2 != 0) {
            int reminder = number2 % 10;
            number2 /= 10;
            count++;
        }
        return count;
    }
}