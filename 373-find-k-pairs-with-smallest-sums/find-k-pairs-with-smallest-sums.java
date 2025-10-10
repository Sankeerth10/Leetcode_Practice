class Solution {
    public List<List<Integer>> kSmallestPairs(int[] nums1, int[] nums2, int k) {
        List<List<Integer>> result = new ArrayList<>();
        if (nums1.length == 0 || nums2.length == 0 || k <= 0) {
            return result;
        }

        PriorityQueue<int[]> minHeap = new PriorityQueue<>(
            (a, b) -> Integer.compare(a[0], b[0])
        );

        int rows = Math.min(nums1.length, k);
        for (int i = 0; i < rows; i++) {
            int sum = nums1[i] + nums2[0];
            minHeap.offer(new int[]{sum, i, 0});
        }

        while (k > 0 && !minHeap.isEmpty()) {
            int[] top = minHeap.poll();
            int i = top[1];
            int j = top[2];
            result.add(Arrays.asList(nums1[i], nums2[j]));

            if (j + 1 < nums2.length) {
                int sum = nums1[i] + nums2[j + 1];
                minHeap.offer(new int[]{sum, i, j + 1});
            }

            k--;
        }

        return result;
    }
}