class Solution {
    public int maxArea(int[] height) {
        int maxArea = 0;
        int left = 0;
        int breadth = height.length;
        int right = breadth -1;
        while(left < right){
            int area = (Math.min(height[left], height[right]) * (right-left));
            maxArea = Math.max(maxArea,area);
            if(height[left] <= height[right]){
                left++;
            }
            else{
                right--;
            }
        }
        return maxArea;
    }
}
                        
                        