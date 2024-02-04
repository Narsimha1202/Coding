import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int K = sc.nextInt();
        int count = 0;

        int[] A = new int[N];

        // Read input values into the array
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }

        // Iterate through the array and check sum of digits
        for (int i = 0; i < N; i++) {
            int num = A[i];
            int sum = 0;

            // Calculate the sum of digits
            while (num > 0) {
                sum += num % 10;
                num /= 10;
            }

            // Check if the sum is less than K
            if (sum < K) {
                count++;
            }
        }

        System.out.println(count);
    }
}
