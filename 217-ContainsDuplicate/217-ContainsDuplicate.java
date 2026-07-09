// Last updated: 7/9/2026, 3:09:35 PM
class Solution {
    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        for(int i = 1; i < n; i++){
                if(nums[i] == nums[i-1])
                return true;

        }
        return false;
    }
}