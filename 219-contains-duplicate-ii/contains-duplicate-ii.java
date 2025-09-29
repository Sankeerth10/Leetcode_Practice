class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
    //    if (k <= 0 || nums == null || nums.length < 2) return false;

    //     Set<Integer> window = new HashSet<>();

    //     int left = 0; 
    //     for (int right = 0; right < nums.length; right++) {
    //         if (window.contains(nums[right])){
    //              return true;
    //         }
    //         window.add(nums[right]);

    //         if (right - left + 1> k) {
    //             window.remove(nums[left]);
    //             left++;
    //         }
    //     }
    //     return false;

        HashMap<Integer, Integer>  map  = new HashMap<>();
        for(int i =0; i< nums.length; i++ ) {
            if(map.containsKey(nums[i]) && (i - map.get(nums[i]) <= k)) {
                return true;
            }
            map.put(nums[i], i);
        }
        return false;
    }    
}