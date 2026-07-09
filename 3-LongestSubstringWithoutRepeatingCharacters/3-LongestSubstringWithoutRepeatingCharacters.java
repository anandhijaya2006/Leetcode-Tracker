// Last updated: 7/9/2026, 3:13:08 PM
class Solution {
    public int lengthOfLongestSubstring(String s) {
        int i= 0;
        int j=0;
        int c=0;
        HashSet <Character> set = new HashSet<>();
        
        for(j = 0;j<s.length();j++){
            while(set.contains(s.charAt(j))){
                set.remove(s.charAt(i));
                i++;
            }
                set.add(s.charAt(j));
                c = Math.max(c,(j -i + 1));
            
        }
        return c;
        
    }
}