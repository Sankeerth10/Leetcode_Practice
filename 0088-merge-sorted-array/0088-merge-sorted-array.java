class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int resPointer = m + n -1;
        int nums1Pointer = m-1;
        int nums2Pointer = n-1;
        while ( nums1Pointer >=0 && nums2Pointer >= 0){
            if(nums1[nums1Pointer] > nums2[nums2Pointer] ){
                nums1[resPointer] = nums1[nums1Pointer];
                nums1Pointer--;
                resPointer--; 
            }else{
                nums1[resPointer] = nums2[nums2Pointer];
                nums2Pointer--;
                resPointer--; 
            }
        }
        while(nums2Pointer>=0){
            nums1[resPointer] = nums2[nums2Pointer];
            nums2Pointer--;
            resPointer--;
        }
    }
}