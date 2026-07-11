// Last updated: 7/11/2026, 6:17:31 PM
1public class Solution {
2    public int longestPalindrome(String s) {
3
4        HashSet<Character> charSet = new HashSet<>();
5   
6        int length = 0;
7        
8       
9        for (char c : s.toCharArray()) {
10           
11            if (charSet.contains(c)) {
12                charSet.remove(c);
13                length += 2;
14            } else {
15              
16                charSet.add(c);
17            }
18        }
19        
20        
21        if (!charSet.isEmpty()) {
22            length += 1;
23        }
24       
25        return length;
26    }
27}