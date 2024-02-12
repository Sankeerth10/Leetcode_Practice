class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double maxVal = 0;
        double sum = 0;
        for(int i =0; i < k ; i++){
            sum += nums[i];
        }
        maxVal = sum;
        for(int i = k; i < nums.length; i ++){
            sum = sum + nums[i] - nums[i-k];
            maxVal = Math.max(sum, maxVal);
        }
        return maxVal/k;
    }
}