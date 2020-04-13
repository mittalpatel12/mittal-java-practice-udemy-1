package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {

        float myMinFloatValue = Float.MIN_VALUE;
        float myMaxFloatValue = Float.MAX_VALUE;
        System.out.println("minimum float value is" + myMinFloatValue);
        System.out.println("minimum float value is" + myMaxFloatValue);


        double myMinDoubleValue = Double.MIN_VALUE;
        double myMaxDoubleValue = Double.MAX_VALUE;
        System.out.println("minimum Double value is" + myMinDoubleValue);
        System.out.println("minimum Double value is" + myMaxDoubleValue);


        // float and double usages

        int i = 3 / 2;
        System.out.println(i);
        float f = 3f / 2f ;
        System.out.println(f);
        double d1 = 3d / 2d;
        System.out.println(d1);

        // pounds to kilogram

        int numberOfPounds = 200;
        double convertedKilograms = numberOfPounds * 0.45359237d;
        System.out.println(convertedKilograms);

        // char and boolean

        char myChar = 'D';
        char myUnicodeChar = '\u0044';
        System.out.println(myChar);
        System.out.println(myUnicodeChar);

        boolean myTrueBooleanChar = true;
        boolean myFalseBooleanChar = false;
        boolean isCustomer = true;
        System.out.println(myTrueBooleanChar);
        System.out.println(myFalseBooleanChar);




    }
}
