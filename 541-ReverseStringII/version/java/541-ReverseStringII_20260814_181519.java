// Last updated: 8/14/2026, 6:15:19 PM
1class Solution {
2    public String reverseStr(String s, int k) {
3        char[] str = s.toCharArray();
4        int n = str.length;
5        for(int i = 0 ; i <= n-1; i += 2*k){
6            if(i+k-1 <= n-1){
7                reverseK(i,i+k-1,str);
8            }else{
9				//for fewer than k characters left (edge case)
10                reverseK(i,n-1,str);
11            }
12        }
13        String ans = new String(str);
14        return ans;
15    }
16    public void reverseK(int i, int j, char[] str){
17        while(i < j){
18            char temp = str[i];
19            str[i] = str[j];
20            str[j] = temp;
21            i++;
22            j--;
23        }
24    }
25}