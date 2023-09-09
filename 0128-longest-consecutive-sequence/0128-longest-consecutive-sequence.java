class Solution {
    public int longestConsecutive(int[] nums) {
        Arrays.sort(nums);
        int len =1;
        int max =1;
        if(nums.length==0){
            return 0;
        }
        for(int i=0;i<nums.length-1;i++){
            if(nums[i+1]-nums[i]==1){
                len++;
            }
            else if(nums[i+1]-nums[i]==0){
                len = len;
            }
            else{
                max = Math.max(max,len);
                len =1;
            }
        }
        return Math.max(max,len);
    }
}