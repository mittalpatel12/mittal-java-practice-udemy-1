package academy.learnprogramming;

public class TeenNumber {
    public static Boolean isTeenagerNumber(int value1, int value2, int value3) {
        if ((value1 <= 19 && value1 >= 13) || (value2 <= 19 && value2 >= 13) || (value3 <= 19 && value3 >= 13)) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Boolean teenNumber = isTeenagerNumber(15,56,23);
        if (teenNumber == true) {
            System.out.println("it has teen number");
        }
        else {
            System.out.println("it does not have teen number");
        }
    }
}
