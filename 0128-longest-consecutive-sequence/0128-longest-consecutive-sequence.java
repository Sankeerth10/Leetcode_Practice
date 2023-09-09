class Solution {
    public int longestConsecutive(int[] nums) {
        int max =1;
        int len =1;
        if(nums.length ==0){
            return 0;
        }
        HashSet<Integer> h = new HashSet<>();
        for(int i:nums){
            h.add(i);
        }
        for(int i =0; i <nums.length;i++){
            if(!h.contains(nums[i]-1)){
               while(h.contains(nums[i]+1)){
                len++;
                nums[i] = nums[i]+1;
            } 
            }
            max = Math.max(max,len);
            len = 1;
        }
        return max;
    }
}