// Last updated: 7/9/2026, 3:05:27 PM
class Solution {
    public long maxSum(int[] nums, int k, int mul) {
        Arrays.sort(nums);
        long ans = 0;
        int n = nums.length;
        int index = n-1;

        while(k > 0 && index >= 0){
            if(mul > 1){
                ans += (long) nums[index] * mul;
            }else{
                ans += nums[index];
            }
            index--;
            mul--;
            k--;
        }
        return ans;
    }
}