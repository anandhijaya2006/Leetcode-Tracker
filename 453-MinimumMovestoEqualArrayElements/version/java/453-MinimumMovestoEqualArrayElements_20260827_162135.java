// Last updated: 8/27/2026, 4:21:35 PM
1class Solution {
2    public int minMoves(int[] nums) {
3        int mn = Integer.MAX_VALUE;
4
5        for (int num : nums) {
6            mn = Math.min(mn, num);
7        }
8
9        int moves = 0;
10
11        for (int num : nums) {
12            moves += num - mn;
13        }
14
15        return moves;
16    }
17}