// Last updated: 7/9/2026, 3:11:19 PM
class Solution {
    public boolean search(int[] nums, int target) {
        int l = 0, r = nums.length - 1;

        while(r >= l){
           int mid = l + ( r - l ) / 2;

            if(nums[mid] == target) return true;

            if(nums[mid] == nums[l] && nums[mid] == nums[r]){
                l++;
                r--;
            }

           else if(nums[l] <= nums[mid]){ 
                if(target < nums[mid] && target >= nums[l]){
                    r = mid - 1;
                }else{
                    l = mid + 1;
                }
                }
            else{ 
                if(target > nums[mid] && target <= nums[r]){
                    l = mid + 1;
                }else{
                    r = mid - 1;
            }
            }
        }
        return false;
    }
}