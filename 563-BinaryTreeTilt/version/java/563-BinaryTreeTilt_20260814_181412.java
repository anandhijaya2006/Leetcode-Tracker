// Last updated: 8/14/2026, 6:14:12 PM
1class Solution {
2
3    int ans = 0;
4
5    public int findTilt(TreeNode root) {
6
7        solve(root);
8
9        return ans;
10    }
11
12    public int solve(TreeNode root) {
13
14        if (root == null) {
15            return 0;
16        }
17
18        int left = solve(root.left);
19
20        int right = solve(root.right);
21
22        ans += Math.abs(left - right);
23
24        return root.val + left + right;
25    }
26}