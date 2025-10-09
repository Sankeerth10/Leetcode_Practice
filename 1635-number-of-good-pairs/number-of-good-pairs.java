class Solution {
    public int numIdenticalPairs(int[] nums) {
        if(nums.length < 2) {
            return 0;
        }
        int res = 0;
        HashMap<Integer, Integer> h = new HashMap<>();
        for(int i: nums) {
            if (!h.containsKey(i)) {
                h.put(i, 1);
            }
            else {
                res += h.get(i);
                h.put(i, h.get(i) + 1);
            }
        }
        return res;
    }
}