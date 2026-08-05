// Last updated: 8/5/2026, 8:46:31 PM
1public class Solution {
2    public boolean repeatedSubstringPattern(String s) {
3        String doubled = s + s;
4        String sub = doubled.substring(1, doubled.length() - 1);
5        return sub.contains(s);
6    }
7}