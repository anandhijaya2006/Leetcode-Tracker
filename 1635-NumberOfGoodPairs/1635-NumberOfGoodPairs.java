// Last updated: 7/9/2026, 3:06:55 PM
class Solution {
    public int numIdenticalPairs(int[] nums) {
        Map<Integer,Integer> freq = new HashMap();
        for(int x : nums){
            if(freq.containsKey(x)){
                freq.put(x,freq.get(x)+1);
            }else{
                freq.put(x,1);
            }
        }
        int pairs = 0;
        for(int n : freq.values()){
            pairs += (n * (n-1)) / 2;
        }
        return pairs;
    }
}