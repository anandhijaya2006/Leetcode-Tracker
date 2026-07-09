// Last updated: 7/9/2026, 3:12:47 PM
class Solution {
    public String longestCommonPrefix(String[] strs) {
        int ml = strs[0].length();
        String sub = strs[0];
        for(String s : strs){
            if(s.startsWith(sub)) continue;
            while(!s.startsWith(sub) && sub.length() >0){
                ml--;
                sub = sub.substring(0,ml);
            }
            if(ml == 0) return "";
        }
        return sub;
        
    }
}