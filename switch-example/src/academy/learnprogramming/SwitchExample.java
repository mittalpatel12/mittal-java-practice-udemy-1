package academy.learnprogramming;

public class SwitchExample {

    public static void main(String[] args) {
        // write your code here
        char alphabet = 'D';
        switch (alphabet) {
            case 'A':
                System.out.println("A was found");
                break;
            case 'B':
                System.out.println("B was found");
                break;
            case 'C':
                System.out.println("C was found");
                break;
            default:
                System.out.println("No one is found");
                break;

        }
    }
}