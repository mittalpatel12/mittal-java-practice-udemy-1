public class BarkingDog {

    public static Boolean shouldWakeUp(Boolean barking, int hourOFTheDay)

    {
        if (hourOFTheDay <8 || hourOFTheDay > 22) {

            return true;
        }
        return false;
    }

    public static void wakeUp(Boolean barking1)
    {
        if (barking1 == true)
        {
            System.out.println("You should wake up now");
        }
        else
        {
            System.out.println("You should not wake up now");
        }
    }
}
