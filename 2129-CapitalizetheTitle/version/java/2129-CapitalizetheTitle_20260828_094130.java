// Last updated: 8/28/2026, 9:41:30 AM
1class Solution {
2    public String capitalizeTitle(String title) {
3        char[] ch = title.toCharArray();
4        int len = ch.length;
5        for(int i = 0;i< len ;i++){
6            int firstIndex = i;
7
8            while(i < len && ch[i] != ' '){
9                ch[i] = Character.toLowerCase(ch[i]);
10                i++;
11            }
12            if(i - firstIndex > 2){
13                ch[firstIndex] = Character.toUpperCase(ch[firstIndex]);
14            }
15        }
16        return String.valueOf(ch);
17    }
18}