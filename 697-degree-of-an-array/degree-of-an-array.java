class Solution {
    public int findShortestSubArray(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        HashMap<Integer, Integer> firstOccurence = new HashMap<>();
        int degree =0;
        int result = 0;
        for(int i=0; i < nums.length; i++) {
            firstOccurence.putIfAbsent(nums[i], i);
            map.put(nums[i], map.getOrDefault(nums[i],0) + 1);
            if(map.get(nums[i]) > degree) {
                degree = map.get(nums[i]);
                result = i - firstOccurence.get(nums[i]) + 1;
            }
            else if(map.get(nums[i]) == degree) {
                result = Math.min(result, i - firstOccurence.get(nums[i]) + 1);
            }
        }
        return result;
    }
}