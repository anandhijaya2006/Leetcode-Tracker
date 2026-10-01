// Last updated: 10/1/2026, 4:27:19 PM
1public class Codec {
2    public String serialize(TreeNode root) {
3        if (root == null) return "";
4        Queue<TreeNode> q = new LinkedList<>();
5        StringBuilder res = new StringBuilder();
6        q.add(root);
7        while (!q.isEmpty()) {
8            TreeNode node = q.poll();
9            if (node == null) {
10                res.append("n ");
11                continue;
12            }
13            res.append(node.val + " ");
14            q.add(node.left);
15            q.add(node.right);
16        }
17        return res.toString();
18    }
19
20    public TreeNode deserialize(String data) {
21        if (data == "") return null;
22        Queue<TreeNode> q = new LinkedList<>();
23        String[] values = data.split(" ");
24        TreeNode root = new TreeNode(Integer.parseInt(values[0]));
25        q.add(root);
26        for (int i = 1; i < values.length; i++) {
27            TreeNode parent = q.poll();
28            if (!values[i].equals("n")) {
29                TreeNode left = new TreeNode(Integer.parseInt(values[i]));
30                parent.left = left;
31                q.add(left);
32            }
33            if (!values[++i].equals("n")) {
34                TreeNode right = new TreeNode(Integer.parseInt(values[i]));
35                parent.right = right;
36                q.add(right);
37            }
38        }
39        return root;
40    }
41}