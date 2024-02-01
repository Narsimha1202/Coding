//approach 1
class Solution {
    static String armstrongNumber(int n){
        int sum = 0;
        int temp=n;
        while(n>0) {
            int digit=n%10; //3 will be taken out from the number 153 
            sum += digit*digit*digit; //cubes will be taken 
            n/=10;
        }
        
        if(sum==temp) return "Yes";
        return "No";
    }
}

// approach 2
class Solution {
    static String armstrongNumber(int n){
        int sum = 0;
        for(int i=n; i>0; i/=10) {
            sum += (i%10)*(i%10)*(i%10);
        }
        if(sum==n) return "Yes";
        return "No";
    }
}