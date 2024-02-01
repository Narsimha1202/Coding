class Solution {
    public static boolean isPowerOfTwo(int n) {
          // Check if n is positive
          if (n <= 0) {
              return false;
          }
  
          // Keep dividing n by 2 until it becomes odd
          while (n % 2 == 0) {
              n = n / 2;
          }
  
          // If n becomes 1, it's a power of two; otherwise, it's not
          return n == 1;
      }
  }