public class Solution {
    public int searchInsert(int[] A, int target) {
        //error check
        if(A == null) {
            return 0;
        }
        
        int left = 0;
        int right = A.length - 1;
        while(left <= right) {
            int mid = (right + left) / 2;
            if(A[mid] == target) {
                return mid;
            }
            else if(target < A[mid]) {
                right = mid - 1;
            }
            else {
                left = mid + 1;
            }
        }
        return left;
    }
}