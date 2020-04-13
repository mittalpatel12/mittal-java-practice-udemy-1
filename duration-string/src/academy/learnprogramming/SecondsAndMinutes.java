package academy.learnprogramming;

import com.sun.jdi.Value;
import org.w3c.dom.ls.LSOutput;


public class SecondsAndMinutes {
    private static final String INVALID_VALUE_MESSAGE = "Invalid_value";
    public static String getDurationString(int minutes, int seconds) {
        if ((minutes >= 0) && (seconds >= 0 && seconds <= 59)) {

            int remainingMinutes = minutes % 60;
            int hours = minutes / 60;

            String hoursString = hours + "h";
            if (hours<10)
                hoursString = "0" + hoursString;

            String minutesString = minutes + "m";
            if (minutes<10)
               minutesString = "0" + minutesString;

            String secondsString = seconds + "s";
            if (seconds <10)
                secondsString = "0" + secondsString;


            return hoursString + " " + minutesString + " " + secondsString;
        }
        return INVALID_VALUE_MESSAGE;
    }

    public static String getDurationString(int seconds) {

        if (seconds < 0) {
            return INVALID_VALUE_MESSAGE;
        }
        int minutes = seconds / 60;
        int remainingSeconds = seconds % 60;
        String x = getDurationString(minutes, remainingSeconds);
        return x;
    }

    public static void main(String[] args) {
        System.out.println(getDurationString(65,45));
        System.out.println(getDurationString(3945));
    }
}