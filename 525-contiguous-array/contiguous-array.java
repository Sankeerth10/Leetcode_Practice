class Solution {
    public int findMaxLength(int[] nums) {
        if(nums.length < 2) {
            return 0;
        }
        Map<Integer, Integer>  map = new HashMap<>();
        int maxLen = 0;
        int sum = 0;
        for( int i =0; i < nums.length; i++ ) {
            sum += (nums[i] == 1) ? -1: 1;

            if(sum == 0) {
                maxLen = Math.max(maxLen, i + 1);
            }
            if( map.containsKey(sum)) {
                maxLen = Math.max(maxLen, i - map.get(sum));
            } 
            else {
                map.put(sum, i);
            }
        }

        return maxLen;
    }
}