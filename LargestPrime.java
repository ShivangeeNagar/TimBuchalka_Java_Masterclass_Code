public class LargestPrime {
    public static int getLargestPrime(int number) {
        if (number <= 1)
            return -1;
        int maxPrime = -1;
        for (int i = 2; i <= number; i++) {
            while (number % i == 0) {
                if (i > maxPrime)
                    maxPrime = i;
                number = number / i;
            }
        }
        return maxPrime;
    }
}
