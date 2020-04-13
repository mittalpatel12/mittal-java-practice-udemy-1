package academy.learnprogramming;

public class DecimalConverter {

   /* public static final double PI = 3.14;
    static {
        System.out.println("Inside static block");
    }

    {
        System.out.println("Inside instance block 1");
    }

    {
        System.out.println("Inside instance block 2");
    }
*/


    public static void areEqualByThreeDecimalPlaces(Double fValue, Double sValue, int points) {
        int value1 = (int) (fValue * Math.pow(10, points));
        int value2 = (int) (sValue * Math.pow(10, points));


        if (value1 == value2) {
            System.out.println("Both are Equal");
        } else {
            System.out.println("Both are not Equal");
        }

    }

    public static void main(String[] args) {
        areEqualByThreeDecimalPlaces(2.56489,2.564511, 5);
    }
}
