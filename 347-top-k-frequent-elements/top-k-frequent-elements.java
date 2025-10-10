class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i: nums) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        
        PriorityQueue<Map.Entry<Integer, Integer>> minHeap =
            new PriorityQueue<>((a,b) -> a.getValue() - b.getValue());
        
         for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            minHeap.offer(entry);
            if (minHeap.size() > k) {
                minHeap.poll(); // remove the least frequent
            }
        }

        int[] result = new int[k];
        for (int i = k - 1; i >= 0; i--) {
            result[i] = minHeap.poll().getKey();
        }

        return result;
    }
}