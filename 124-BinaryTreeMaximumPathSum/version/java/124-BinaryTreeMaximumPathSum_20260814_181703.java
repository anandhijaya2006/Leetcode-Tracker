// Last updated: 8/14/2026, 6:17:03 PM
1class Solution {
2
3    int maxSum = Integer.MIN_VALUE;
4
5    public int maxPathSum(TreeNode root) {
6        findMax(root);
7        return maxSum;
8    }
9
10    private int findMax(TreeNode root) {
11
12        if (root == null) {
13            return 0;
14        }
15
16        // Get maximum contribution from left and right
17        // Ignore negative contributions
18        int left = Math.max(0, findMax(root.left));
19        int right = Math.max(0, findMax(root.right));
20
21        // Complete path passing through current node
22        int currentPath = left + root.val + right;
23
24        // Update global maximum
25        maxSum = Math.max(maxSum, currentPath);
26
27        // Parent can use only one branch
28        return root.val + Math.max(left, right);
29    }
30}