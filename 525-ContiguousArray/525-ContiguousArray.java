// Last updated: 7/9/2026, 3:08:28 PM
class Solution {
    public int findMaxLength(int[] nums) {
        int n = nums.length;
        Map<Integer,Integer> mp = new HashMap<>();
        int sum = 0;
        int subArrayLength = 0;
        for(int i =0;i<n;i++){
            sum += nums[i] == 0 ? -1 : 1;
            if(sum == 0){
                subArrayLength = i+1;
            }else if(mp.containsKey(sum)){
                subArrayLength = Math.max(subArrayLength, i-mp.get(sum));
            }else{
                mp.put(sum,i);
            }
        }
        return subArrayLength;
    }
}