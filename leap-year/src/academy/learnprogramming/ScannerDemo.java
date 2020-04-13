package academy.learnprogramming;

import java.util.Scanner;

public class ScannerDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int counter = 0;
        int sum = 0;

        while (counter < 4) {
            int order = counter + 1;
            System.out.println("Enter number : " + order + " : ");
            boolean check = scanner.hasNextInt();

            if (check) {
                int number = scanner.nextInt();
                counter++;
                sum = sum + number;
                }
                scanner.nextLine();
            }
        System.out.println("sumi is :" + sum);
        scanner.close();

        }
    }


