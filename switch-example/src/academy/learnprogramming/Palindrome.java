package academy.learnprogramming;

public class Palindrome {
    public static void main(String[] args) {
        boolean value = isPalindrome(232);
        System.out.println("number is:" + value);

        boolean value1= isPalindrome(454);
        System.out.println("number is:" + value1);

        boolean value2 = isPalindrome(54387);
        System.out.println("number is:" + value2);

        boolean value3 = isPalindrome(45554);
        System.out.println("number is:" + value3);
    }

    public static boolean isPalindrome(int n) {
        int r, sum = 0, temp;
        temp = n;
        while (n > 0) {
            r = n % 10;  //getting remainder
            sum = (sum * 10) + r;
            n = n / 10;

        }
        if (temp == sum)
            return true;
        else
            return false;

    }
}
