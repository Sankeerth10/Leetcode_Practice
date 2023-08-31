class Solution {
    public int[] twoSum(int[] nums, int target) {
        int [] res = new int[2];
        HashMap<Integer,Integer> h = new HashMap<>();
        for(int i =0; i < nums.length;i++){
            int diff = target - nums[i];
            if(h.containsKey(diff)){
                res[0] =h.get(diff);
                res[1] =i;
            }
            h.put(nums[i],i);
        }
        return res;
    }
}