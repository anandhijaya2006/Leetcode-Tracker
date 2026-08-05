// Last updated: 8/5/2026, 8:52:54 PM
1class Solution {
2    public int largestRectangleArea(int[] arr) {
3        int n = arr.length;
4        int[] leftMin = new int[n], rightMin = new int[n];
5
6        Fn(arr, leftMin, 1, -1, 0);
7        Fn(arr, rightMin, -1, n, n - 1);
8
9        int max = 0;
10
11        for (int i = 0; i < n; i++) {
12            int len = rightMin[i] - leftMin[i] - 1;
13            max = Math.max(max, len * arr[i]);
14        }
15
16        return max;
17    }
18
19    private static void Fn(int[] arr, int[] res, int incre, int inValid, int st) {
20        int n = arr.length;
21        Stack<Integer> stk = new Stack<>();
22
23        for (int i = st; i < n && i >= 0; i += incre) {
24            while (!stk.isEmpty() && arr[i] <= arr[stk.peek()]) {
25                stk.pop();
26            }
27
28            if (stk.isEmpty()) {
29                res[i] = inValid;
30            } else {
31                res[i] = stk.peek();
32            }
33
34            stk.push(i);
35        }
36    }
37}