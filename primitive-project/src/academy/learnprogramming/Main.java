package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int i = 10_00_0;
        int minIntValue = Integer.MIN_VALUE;
        int maxIntValue = Integer.MAX_VALUE;
        System.out.println(minIntValue );
        System.out.println(maxIntValue );
        System.out.println(minIntValue -1);
        System.out.println(maxIntValue +1);
        System.out.println(i);
        int num = 2147483647   ;
        System.out.println(num );

        // Byte primitive
        byte minByteValue = Byte.MIN_VALUE;
        byte maxByteValue = Byte.MAX_VALUE;
        System.out.println("minimum byte value is" + minByteValue);
        System.out.println("maximum byte value is" + maxByteValue);

        // Short primitive values
        short minShortValue = Short.MIN_VALUE;
        short maxShortValue = Short.MAX_VALUE;
        System.out.println("minimum Short value is" + minShortValue);
        System.out.println("maximum Short value is" + maxShortValue);
        
        // long primitive values

        long minLongValue = Long.MIN_VALUE;
        long maxLongValue = Long.MAX_VALUE;
        System.out.println("minimum Long value is" + minLongValue);
        System.out.println("maximum Long value is" + maxLongValue);
       long j = maxLongValue + 1;
        System.out.println(j);
    }
}
