// Last updated: 7/9/2026, 3:11:29 PM
class Solution {
    public boolean searchMatrix(int[][] nums, int target) {
        int s = 0;
        int row = nums.length;
        int col = nums[0].length;
        int e =  row*col-1;
        while(s<=e){
            int mid = (e+s)/2;
            int val = nums[mid/col][mid%col];
            if(val == target)  return true;
            if(val > target) e = mid-1;
            else s = mid+1;
        }
        return false;
        
    }
}