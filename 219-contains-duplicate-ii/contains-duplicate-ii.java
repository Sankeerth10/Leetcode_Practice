class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
       if (k <= 0 || nums == null || nums.length < 2) return false;

        Set<Integer> window = new HashSet<>();

        int left = 0; 
        for (int right = 0; right < nums.length; right++) {
            if (window.contains(nums[right])){
                 return true;
            }
            window.add(nums[right]);

            if (right - left + 1> k) {
                window.remove(nums[left]);
                left++;
            }
        }
        return false;
    }    
}