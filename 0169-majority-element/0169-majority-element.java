class Solution {
    public int majorityElement(int[] nums) {
        int threshold = nums.length/2;
        int res = 0;
        HashMap<Integer, Integer> hm = new HashMap<>();
        for(int i = 0 ; i < nums.length; i ++){
            if(hm.containsKey(nums[i])) {
                int temp = hm.get(nums[i]);
                temp+=1;
                hm.put(nums[i], temp);
            }
            else {
                hm.put(nums[i], 1);
            }
            
            if(hm.get(nums[i]) > threshold){
                res = nums[i];
            }
        }
        return res;
    }
}