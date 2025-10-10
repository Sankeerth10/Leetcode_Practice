class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals, (a,b) -> {
             if (a[1] != b[1])  {
                return a[1] - b[1];
             }
            return a[0] - b[0];
        });

        int kept = 1;                     
        int prevEnd = intervals[0][1];

         for (int i = 1; i < intervals.length; i++) {
            int start = intervals[i][0];
            int end   = intervals[i][1];

            if (start >= prevEnd) {
                kept++;
                prevEnd = end;
            } 
        }

        return intervals.length - kept;   
    }
}