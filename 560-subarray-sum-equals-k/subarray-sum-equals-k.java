class Solution {
    public int subarraySum(int[] nums, int k) {
        int count = 0;
        int currentSum = 0;
        // Map to store prefix sums and their frequencies
        // Key: prefix sum, Value: frequency of that prefix sum
        Map<Integer, Integer> prefixSumCounts = new HashMap<>();
        
        // Initialize with a prefix sum of 0 occurring once, 
        // to handle cases where a subarray starting from index 0 sums to k.
        prefixSumCounts.put(0, 1); 
        
        for (int num : nums) {
            currentSum += num;
            
            // If (currentSum - k) exists in the map, it means there's a subarray
            // ending at the current position whose sum is k.
            // The number of times (currentSum - k) has appeared is the number of such subarrays.
            if (prefixSumCounts.containsKey(currentSum - k)) {
                count += prefixSumCounts.get(currentSum - k);
            }
            
            // Add the current prefix sum to the map or increment its count
            prefixSumCounts.put(currentSum, prefixSumCounts.getOrDefault(currentSum, 0) + 1);
        }
        
        return count;
    }
}