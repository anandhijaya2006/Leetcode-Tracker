// Last updated: 7/9/2026, 3:12:05 PM
class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        method(nums,0,ans);
        return ans;
    }
    public void method(int[] nums,int idx,List<List<Integer>> ans){
        if(idx == nums.length){
            List<Integer> temp = new ArrayList<>();
            for(int i:nums){
                temp.add(i);
            }
            ans.add(temp);
            return;
        }
        for(int i=idx;i<nums.length;i++){
            swap(nums,i,idx);
            method(nums,idx+1,ans);
            swap(nums,i,idx);
        }
    }
    public void swap(int[] nums,int i,int j){
        int t = nums[i];
        nums[i] = nums[j];
        nums[j] = t;
    }
}