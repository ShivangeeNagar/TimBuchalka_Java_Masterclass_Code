public class NumberPalindrome {
    public static boolean isPalindrome(int number) {
        number = Math.abs(number);
        int temp = number;
        int sum = 0;
        while (number > 0) {
            int digit = number % 10;
            sum = (sum * 10) + digit;
            number = number / 10;
        }
        return temp == sum;
    }
}
