class Solution {
    public int singleNumber(int[] nums) {
        // if (nums.length == 1) {
        //     return nums[0];
        // }
        // HashMap<Integer, Integer> map = new HashMap<>();
        // for(int i =0; i < nums.length; i++) {
        //     if(!map.containsKey(nums[i])){
        //         map.put(nums[i], 1);
        //     }
        //     else {
        //         int val = map.get(nums[i]);
        //         map.put(nums[i], val+1);
        //     }
        // }
        // Integer foundKey = null;
        // for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
        //     if (entry.getValue().equals(1)) {
        //         foundKey = entry.getKey();
        //         break;
        //     }
        // }
        // return (int) foundKey;

    //SolOptimal:
        int a = 0;
        for (int num : nums) {
            a = a^num; 
        }
        return a;
    }
}