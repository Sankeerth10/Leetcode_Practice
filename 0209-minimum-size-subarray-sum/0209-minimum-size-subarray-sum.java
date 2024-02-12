class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int min_len = Integer.MAX_VALUE;
        int left = 0;
        int right = 0;
        int sum = 0;
        while(right < nums.length) {
           sum += nums[right];
           while(sum >= target && left <= right){
                sum-= nums[left];
                min_len = Math.min(right - left + 1, min_len);
                left++;
            }
            right++;
        }
        
        if(min_len == Integer.MAX_VALUE) {
            return 0;
        }
        else {
            return min_len;
        }
    }
}