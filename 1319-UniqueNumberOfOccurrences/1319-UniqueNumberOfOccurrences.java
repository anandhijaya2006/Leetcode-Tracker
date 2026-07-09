// Last updated: 7/9/2026, 3:07:15 PM
class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        for(int n:arr){
            map.put(n, map.getOrDefault(n,0)+1);
        }
        HashSet<Integer> set = new HashSet<Integer>();
        for(int freq:map.values()){
            if(!set.add(freq)){
                return false;
            }
        }
        return true;
    }
}