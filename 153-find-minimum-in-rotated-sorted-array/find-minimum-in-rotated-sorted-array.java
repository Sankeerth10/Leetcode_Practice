class Solution {
    public int findMin(int[] nums) {
        int left = 0, right = nums.length - 1, result =  Integer.MAX_VALUE;
        while(left <= right) {
            int mid = left + (right - left)/2;
            if(nums[left] <= nums[mid]) {
                result = Math.min(result, nums[left]);
                left = mid + 1;
            }
            else {
                result = Math.min(result, nums[mid]);
                right = mid - 1;
            }
        }
        return result;
    }
}