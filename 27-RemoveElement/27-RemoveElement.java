// Last updated: 7/9/2026, 3:12:29 PM
class Solution {
    public int removeElement(int[] nums, int val) {
        int idx =0;
        for(int i=0;i < nums.length;i++){
            if(nums[i] != val){
                nums[idx] = nums[i];
                idx++;
            }
        }
        return idx;
    }
}