// Last updated: 8/14/2026, 6:12:41 PM
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
17    Map<Integer,Integer>freq=new HashMap<>();
18    int maxValue=0,maxCount=0,max=0;
19    public int[] findMode(TreeNode root) {
20        if(root.left==null&&root.right==null)return new int[]{root.val};
21        helper(root);
22        if(maxCount==1)return new int[]{max};
23        int[]ans=new int[maxCount];
24        int index=0;
25        for(int val:freq.keySet()){
26            if(freq.get(val)==maxValue)ans[index++]=val;
27        }
28        return ans;        
29    }
30    public void helper(TreeNode node){
31        if(node==null)return;
32        helper(node.left);
33        freq.put(node.val,freq.getOrDefault(node.val,0)+1);
34        if(freq.get(node.val)==maxValue){
35            maxCount++;
36        }
37        else if(freq.get(node.val)>maxValue){
38            max=node.val;
39            maxValue=freq.get(node.val);
40            maxCount=1;
41        }
42        helper(node.right);
43    }
44}