package academy.learnprogramming;

public class Pattern {

    public static void main(String[] args) {

        printSquareStar(5);
    }

    private static void printSquareStar(int number) {
        int[][] pattern = new int[30][30];
        if (number < 5) {
            System.out.println("Invalid Number");
        }



        for (int i = 0; i < number; i++) {

            for (int j = 0; j < number; j++) {

                if (i==0 || j==0 || i== number-1 || j==number-1 || i==j || j==(number-1)-(i+1)+1)
                {
                    pattern[i][j] = 1;
                }


            }
            }

        //print an array
        for (int i = 0; i < number; i++) {

            for (int j = 0; j < number; j++) {

                System.out.print(+ pattern[i][j] + " ");
            }
            System.out.println();


        }

        }


}