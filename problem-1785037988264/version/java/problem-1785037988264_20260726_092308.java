// Last updated: 7/26/2026, 9:23:08 AM
1class Solution {
2    public int largestInteger(int n, int s) {
3     if(s == 0) return 0;
4        if(s > 9 *n) return -1;
5        long ans = 0;
6
7        for(int i=0;i<n;i++){
8            int digit = Math.min(9,s);
9            ans = ans * 10 + digit;
10            s -= digit;
11        }
12
13        if(ans > Integer.MAX_VALUE)
14            return -1;
15
16        return (int) ans;
17    }
18}