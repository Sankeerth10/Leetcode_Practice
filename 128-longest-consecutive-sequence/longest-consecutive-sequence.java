class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums == null || nums.length < 1) {
            return 0;
        }
        int maxLen = 1;
        HashSet<Integer> set = new HashSet();
        for(int num: nums) {
            set.add(num);
        }
        for (int num : set) {
            if(!set.contains(num - 1)) {
                int len = 1;
                while(set.contains(num + 1)) {
                    len+=1;
                    num+=1;
                }
                maxLen = Math.max(len, maxLen);
            }
        }
        return maxLen;
    }
}