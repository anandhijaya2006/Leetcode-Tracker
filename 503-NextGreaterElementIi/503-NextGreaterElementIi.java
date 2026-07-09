// Last updated: 7/9/2026, 3:08:32 PM
class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n = nums.length;
        int[] da = new int[n*2];
        for(int i = 0; i < n; i++){
            da[i] = da[i + n] = nums[i];
        }
        int[] ans = new int[n];
        for(int i = 0;i < n; i++){
            ans[i] = -1;
            for(int j = i+1;j<da.length;j++){
                if(nums[i] < da[j]){
                    ans[i] = da[j];
                    break; }

            }
        }
        return ans;
        

    }
}