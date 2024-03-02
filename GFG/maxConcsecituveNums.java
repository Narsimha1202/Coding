class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int final_ans=0, curr_count=0;
        for(int num:nums){
            if(num==1){
                curr_count++;
            }
            else{
                curr_count=0;
            }
        final_ans=Math.max(final_ans, curr_count);
            
        }
        return final_ans;
    }
    
}