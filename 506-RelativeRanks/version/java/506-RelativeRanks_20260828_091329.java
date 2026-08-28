// Last updated: 8/28/2026, 9:13:29 AM
1class Solution {
2    public String[] findRelativeRanks(int[] score) {
3        int n = score.length;
4        int[][] SortedPairs = new int[n][2];
5        for(int i=0;i<n;i++) SortedPairs[i] = new int[] {i,score[i]};
6        Arrays.sort(SortedPairs, (x,y) -> (y[1] - x[1]));
7        String[] ans = new String[n];
8        for(int i=0;i<n;i++){
9            if(i == 0){
10                ans[SortedPairs[i][0]] = "Gold Medal";
11            }else if(i == 1){
12                ans[SortedPairs[i][0]] = "Silver Medal";
13            }else if(i == 2){
14                ans[SortedPairs[i][0]] = "Bronze Medal";
15            }else{
16                ans[SortedPairs[i][0]] = String.valueOf(i + 1);
17            }
18        }
19        return ans;
20    }
21}