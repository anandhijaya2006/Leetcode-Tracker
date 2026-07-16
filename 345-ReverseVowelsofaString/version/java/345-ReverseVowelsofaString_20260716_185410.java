// Last updated: 7/16/2026, 6:54:10 PM
1class Solution {
2    public String reverseVowels(String s) {
3
4        char[] chars = s.toCharArray();
5
6        int start = 0 ;
7
8        int end = s.length()-1;
9
10        while (start<end){
11            while (start < end && !isVowel(chars[start])) {
12                start++;
13            }
14
15            while (start < end && !isVowel(chars[end])) {
16                end--;
17            }
18
19            if (start < end) {
20                swap(chars, start, end);
21                start++;
22                end--;
23            }
24
25        }
26
27        return new String(chars);
28    }
29
30    private void swap(char[] word, int start, int end){
31        char temp = word[start];
32        word[start] = word[end];
33        word[end] = temp;
34    }
35
36    private boolean isVowel(char c) {
37        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'
38                || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U';
39    }
40}