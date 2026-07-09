// Last updated: 7/9/2026, 3:08:29 PM
class Solution {
    public int recursion(String s,int le,int ri,HashMap <String,Integer> map){
        if(le > ri) return 0;
        if(le == ri) return 1;
        String t = le+","+ri;
        if(map.containsKey(t)) return map.get(t);
        int ans;
        if(s.charAt(le) == s.charAt(ri))
           ans = 2+recursion(s,le+1,ri-1,map);
        else 
           ans = Math.max(recursion(s,le+1,ri,map),recursion(s,le,ri-1,map));
        map.put(t,ans);
        return ans;
    }
    public int longestPalindromeSubseq(String s) {
        HashMap<String, Integer> map = new HashMap<>();
        return recursion(s,0,s.length()-1,map);
    }
}