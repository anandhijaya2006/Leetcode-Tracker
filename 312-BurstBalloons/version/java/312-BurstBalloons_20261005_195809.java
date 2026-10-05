// Last updated: 10/5/2026, 7:58:09 PM
1class Solution {
2    public int maxCoins(int[] iNums) {
3    int[] nums = new int[iNums.length + 2];
4    int n = 1;
5    for (int x : iNums) if (x > 0) nums[n++] = x;
6    nums[0] = nums[n++] = 1;
7
8
9    int[][] dp = new int[n][n];
10    for (int k = 2; k < n; ++k)
11        for (int left = 0; left < n - k; ++left) {
12            int right = left + k;
13            for (int i = left + 1; i < right; ++i)
14                dp[left][right] = Math.max(dp[left][right], 
15                nums[left] * nums[i] * nums[right] + dp[left][i] + dp[i][right]);
16        }
17
18    return dp[0][n - 1];
19}
20}