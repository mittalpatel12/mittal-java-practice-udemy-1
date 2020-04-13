package academy.learnprogramming;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int minimum = Integer.MAX_VALUE;
        int maximum = Integer.MIN_VALUE;
        int counter = 0;

        while (counter < 4) {
            System.out.println("Enter Number :");
            boolean hasNext = scanner.hasNextInt();

            if (hasNext) {
                counter++;
                int number = scanner.nextInt();

                if (number > maximum) {
                    maximum = number;
                }
                if (number < minimum) {
                    minimum = number;
                }

            } else {
                break;
            }
            scanner.nextLine();

        }
        System.out.println("Minimum number is:" + minimum);
        System.out.println("Maximum number is:" + maximum);
    }
}


