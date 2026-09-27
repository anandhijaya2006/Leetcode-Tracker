// Last updated: 9/27/2026, 6:57:10 PM
1/*
2// Definition for a Node.
3class Node {
4    public int val;
5    public Node left;
6    public Node right;
7    public Node next;
8
9    public Node() {}
10    
11    public Node(int _val) {
12        val = _val;
13    }
14
15    public Node(int _val, Node _left, Node _right, Node _next) {
16        val = _val;
17        left = _left;
18        right = _right;
19        next = _next;
20    }
21};
22*/
23
24class Solution {
25    public Node connect(Node root) {
26        if(root == null) return null;
27        if(root.left != null) root.left.next = root.right;
28        if(root.right != null && root.next != null) root.right.next = root.next.left;
29        connect(root.left);
30        connect(root.right);
31        return root;
32    }
33}