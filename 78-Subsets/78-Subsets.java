// Last updated: 7/9/2026, 3:11:24 PM
class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> temp  = new ArrayList<>();
        method(0,nums,temp,ans);
        return ans;
    }
    void method(int index,int[] nums,List<Integer> temp,List<List<Integer>> ans){
        ans.add(new ArrayList<>(temp));
        int n= nums.length;
        for(int i=index;i<n;i++){
            temp.add(nums[i]);
            method(i+1,nums,temp,ans);
            temp.remove(temp.size()-1);
        }
    }
}