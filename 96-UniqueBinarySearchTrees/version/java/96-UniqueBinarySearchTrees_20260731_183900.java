// Last updated: 7/31/2026, 6:39:00 PM
1class Solution {
2    public int numTrees(int n) {
3        int [] G = new int[n+1];
4        G[0] = G[1] = 1;
5        for(int i=2; i <= n;i++){
6            for(int j=1;j<=i;j++){
7                G[i] += G[j-1] * G[i-j];
8            }
9        }
10        return G[n];
11    }
12}