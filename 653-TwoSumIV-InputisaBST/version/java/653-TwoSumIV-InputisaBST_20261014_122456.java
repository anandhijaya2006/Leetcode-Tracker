// Last updated: 10/14/2026, 12:24:56 PM
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
17    public boolean findTarget(TreeNode root, int k) {
18    List<Integer> ls = new ArrayList<>();
19    inorder(root , ls); 
20    HashMap<Integer, Integer> mp = new HashMap<>();
21    for(int i = 0 ; i < ls.size() ; i++){
22        int com = k - ls.get(i);
23        if(mp.containsKey(com)){
24            return true;
25        }
26        mp.put(ls.get(i) , i);
27    }
28    return false;
29    }
30   public void inorder(TreeNode root ,List<Integer> ls){
31    if(root == null){ return; }
32    inorder(root.left , ls);
33    ls.add(root.val);
34    inorder(root.right , ls);
35   }
36}