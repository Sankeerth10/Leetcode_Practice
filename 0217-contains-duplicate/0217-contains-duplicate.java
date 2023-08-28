class Solution {
    public boolean containsDuplicate(int[] nums) {
        boolean res = false;
        Arrays.sort(nums);
        for(int i =0; i<nums.length-1;i++){
            if(nums[i] == nums[i+1]){
                res = true;
            }
        }
        System.out.println(Arrays.toString(nums));
        return res;
    }
}