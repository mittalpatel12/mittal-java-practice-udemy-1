package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
	byte byteValue = 10;
	short shortValue = 20;
	int intValue =30;

	long longTotal = 50000L +10L * ( byteValue + shortValue + intValue );
        System.out.println(longTotal);

        short shortTotal = (short) (5000 + 10 * (byteValue + shortValue + intValue));
        System.out.println(shortTotal);
    }
}
