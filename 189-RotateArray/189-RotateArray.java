// Last updated: 7/9/2026, 3:09:55 PM
class Solution {
    public void reverse(int[] arr, int st, int ed) {
        while(st < ed){
            int t = arr[st];
            arr[st] = arr[ed];
            arr[ed] = t;
            st++;
            ed--;
        }
    }
    public void rotate(int[] nums,int k){
        int n = nums.length;
        k %= n;
        reverse(nums,0,n-1);
        reverse(nums,0,k-1);
        reverse(nums,k,n-1);
    }
}