class Solution{
    static int sumOfDigits(int N) {
        // code here
        int ans = 0;

		while(N>0) {
			ans += N%10;
			N /= 10;
		}

		return ans;
    }
}