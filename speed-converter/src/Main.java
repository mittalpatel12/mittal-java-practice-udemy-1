public class Main {
    public static void main(String[] args)
    {

        long miles = SpeedConverter.toMilesPerHour(10.5);
        System.out.println("miles:" + miles);

        SpeedConverter.printConversion(10.5);

        long miles1= SpeedConverter.toMilesPerHour(51.7);
        System.out.println("miles:" + miles1);

        SpeedConverter.printConversion(51.7);
    }
}
