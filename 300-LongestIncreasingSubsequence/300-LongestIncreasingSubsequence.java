// Last updated: 7/9/2026, 3:09:01 PM
class Solution {
    public int lengthOfLIS(int[] nums) {
        int n = nums.length;
        if(n <= 1) return n;
     
    int arr[] = new int[n];
    arr[n-1] = 1;
    int max = 1;
    for(int i = n-1; i >= 0;i--){
        int ans = 0;
        for(int j = i+1;j<n;j++){
            if(nums[i] < nums[j]){
                ans = Math.max(ans,arr[j]);
            }
        }
        arr[i] = ans+1;
        max = Math.max(max,arr[i]);
    }
    return max;
}

}