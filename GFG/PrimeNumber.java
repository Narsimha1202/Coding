class Solution {
    static int isPrime(int N) {
        // Handle edge cases
        if (N <= 1) {
            return 0;
        }

        // Check divisibility up to the square root of N
        for (int i = 2; i <= Math.sqrt(N); i++) {
            // If N is divisible by i, then it's not a prime number
            if (N % i == 0) {
                return 0;
            }
        }

        // If no divisor is found, N is a prime number
        return 1;
    }
}
