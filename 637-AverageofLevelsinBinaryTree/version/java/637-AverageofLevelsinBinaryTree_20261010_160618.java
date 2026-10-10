// Last updated: 10/10/2026, 4:06:18 PM
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
17    public List<Double> avg=new ArrayList<>();
18    public List<Double> averageOfLevels(TreeNode root) {
19        bfs(root);
20        return avg;
21    }
22    public void bfs(TreeNode root){
23        if(root==null) return;
24        Queue<TreeNode> nodes=new LinkedList<>();
25        nodes.add(root);
26        while(!nodes.isEmpty()){
27            int n=nodes.size();double sum=0;
28            for(int i=0;i<n;i++){
29                TreeNode curr=nodes.poll();
30                sum+=(double)(curr.val);
31                if(curr.left!=null) nodes.offer(curr.left);
32                if(curr.right!=null) nodes.offer(curr.right);
33            }
34            avg.add(sum/(double)n);
35        }
36        return;
37    }
38}