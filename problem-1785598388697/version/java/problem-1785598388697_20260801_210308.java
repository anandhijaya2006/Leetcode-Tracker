// Last updated: 8/1/2026, 9:03:08 PM
1class Solution {
2    public int countValidPrefixes(String s) {
3        int c0 = 0;
4        int c1 = 0;
5        int vp = 0;
6        for(int i=0;i<s.length();i++){
7            if(s.charAt(i) == '0'){
8                c0++;
9            }else{
10                c1++;
11            }
12            int l = i+1;
13            if(Math.abs(c0-c1) == (l%2)){
14                vp++;
15            }
16        }
17        return vp;
18    }
19}