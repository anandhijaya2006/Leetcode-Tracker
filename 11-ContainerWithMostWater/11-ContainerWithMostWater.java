// Last updated: 7/9/2026, 3:12:52 PM
class Solution {
    public int maxArea(int[] height) {
        int start = 0;
        int end = height.length - 1;
        int maxArea = 0;
        while(start < end){
            int l = Math.min(height[start],height[end]);
            int b = Math.abs(start - end);
            int area = l * b;
            maxArea = Math.max(area,maxArea);
            if(height[start] < height[end]){
                start++;
            }else{
                end--;
            }
        }
        return maxArea;

        
    }
}