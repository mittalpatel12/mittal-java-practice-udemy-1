package academy.learnprogramming;

public class SharedDigit {
    public static void main(String[] args) {
    boolean value1 = isSharedDigit(23 ,  103 );
        System.out.println("both value is" + " " +value1);
    }
    private static boolean isSharedDigit(int number1, int number2) {
        if (number1 < 10 || number2 > 99) {
            return false;
        }

        int reminder1 = number1 % 10;
        number1 /= 10;
        int reminder2 = number2 % 10;
        number2 /= 10;

        if (reminder1 == reminder2 || reminder1 == number2 || number1 == reminder2 || number1 == number2) {
            return true;
        } else {
            return false;
        }

    }

}
