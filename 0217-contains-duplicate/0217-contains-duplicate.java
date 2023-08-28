class Solution {
    public boolean containsDuplicate(int[] nums) {
        boolean res = false;
        HashSet<Integer> h = new HashSet<>();
        for(int i =0; i < nums.length;i++){
            if(h.contains(nums[i])){
                res = true;
            }
            h.add(nums[i]);
        }
        return res;
    }
}