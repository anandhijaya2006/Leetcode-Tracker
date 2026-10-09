// Last updated: 10/9/2026, 9:52:49 AM
1class Solution {
2    public int minInsertions(String s) {
3        Stack<Character> st = new Stack<>();
4        int res = 0;
5        for(int i=0;i<s.length();i++) {
6            char ch = s.charAt(i);
7            if(ch == '(') {
8                st.push(ch);
9            }
10            else {
11                if(st.isEmpty()) {
12                    if(i < s.length()-1 && s.charAt(i+1) == ')') {
13                        i++;
14                    }
15                    else {
16                        res++;
17                    }
18                    res++;
19                }
20                else {
21                    if(i < s.length()-1 && s.charAt(i+1) == ')') {
22                        i++;
23                    }
24                    else {
25                        res++;
26                    }
27                    st.pop();
28                }
29            }
30        }
31        return res+st.size()*2;
32    }
33}