// Last updated: 9/27/2026, 6:58:54 PM
1/*
2// Definition for a Node.
3class Node {
4    public int val;
5    public List<Node> children;
6
7    public Node() {}
8
9    public Node(int _val) {
10        val = _val;
11    }
12
13    public Node(int _val, List<Node> _children) {
14        val = _val;
15        children = _children;
16    }
17};
18*/
19
20class Solution {
21    public int maxDepth(Node root) {
22        if(root == null) return 0;
23
24        int maxHeight = 0;
25        for(Node child : root.children){
26            maxHeight = Math.max(maxHeight, maxDepth(child));
27        }
28
29        return 1 + maxHeight;
30    }
31}