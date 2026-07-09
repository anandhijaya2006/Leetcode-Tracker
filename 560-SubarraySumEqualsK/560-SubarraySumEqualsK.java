// Last updated: 7/9/2026, 3:08:24 PM
class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,1);
        int sum = 0, c= 0;
        for(int i:nums){
            sum += i;
            c += map.getOrDefault(sum-k,0);
            map.put(sum,map.getOrDefault(sum,0)+1);
        }
        return c;
        
    }
}