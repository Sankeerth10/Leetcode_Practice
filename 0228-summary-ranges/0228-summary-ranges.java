class Solution {
    public List<String> summaryRanges(int[] nums) {
        ArrayList<String> res = new ArrayList<>();
        int index = 0;
        while (index < nums.length) {
            int temp = index;
            while (((temp + 1) < nums.length) && (nums[temp + 1]  == nums[temp] + 1))             {
                temp++;
            }
            if (index == temp) {
                res.add(nums[index] + "");
            }
            else {
                res.add(nums[index] + "->" + nums[temp]);
                index = temp;
            }
            index++;
        }
        
        return res;
    }
}