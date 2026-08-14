// Last updated: 8/14/2026, 6:08:09 PM
1/**
2 * Definition for a binary tree node.
3 * public class TreeNode {
4 *     int val;
5 *     TreeNode left;
6 *     TreeNode right;
7 *     TreeNode() {}
8 *     TreeNode(int val) { this.val = val; }
9 *     TreeNode(int val, TreeNode left, TreeNode right) {
10 *         this.val = val;
11 *         this.left = left;
12 *         this.right = right;
13 *     }
14 * }
15 */
16class Solution {
17    private int i = 0;
18    private int p = 0;
19
20    public TreeNode buildTree(int[] preorder, int[] inorder) {
21        return build(preorder, inorder, Integer.MIN_VALUE);
22    }
23
24    private TreeNode build(int[] preorder, int[] inorder, int stop) {
25        if (p >= preorder.length) {
26            return null;
27        }
28        if (inorder[i] == stop) {
29            ++i;
30            return null;
31        }
32
33        TreeNode node = new TreeNode(preorder[p++]);
34        node.left = build(preorder, inorder, node.val);
35        node.right = build(preorder, inorder, stop);
36        return node;
37    }
38}