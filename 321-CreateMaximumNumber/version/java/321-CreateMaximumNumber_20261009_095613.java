// Last updated: 10/9/2026, 9:56:13 AM
1
2class Solution {
3    public int[] maxNumber(int[] nums1, int[] nums2, int k) {
4        int n1 = nums1.length;
5        int n2 = nums2.length;
6        int[] best = new int[k];
7
8        for (int i = Math.max(0, k - n2); i <= Math.min(k, n1); i++) {
9            int[] ss1 = pmc(nums1, i); 
10            int[] ss2 = pmc(nums2, k - i);
11            int[] c = merge(ss1, ss2, k);
12            if (greater(c, 0, best, 0)) {
13                best = c;
14            }
15        }
16        return best;
17    }
18
19    private int[] pmc(int[] nums, int t) {
20        if (t == 0) return new int[0];
21        Deque<Integer> st1 = new LinkedList<>(); 
22        int toRemove = nums.length - t; // how many elements we can drop
23
24        for (int x : nums) {
25            while (!st1.isEmpty() && st1.peekLast() < x && toRemove > 0) {
26                st1.removeLast();
27                toRemove--;
28            }
29            st1.addLast(x);
30        }
31        int[] res = new int[t];
32        for (int i = 0; i < t; i++) {
33            res[i] = st1.removeFirst();
34        }
35        return res;
36    }
37
38    private int[] merge(int[] a, int[] b, int k) {
39        int[] res = new int[k];
40        int i = 0, j = 0, r = 0;
41        while (r < k) {
42            if (greater(a, i, b, j)) {
43                res[r++] = a[i++];
44            } else {
45                res[r++] = b[j++];
46            }
47        }
48        return res;
49    }
50
51    private boolean greater(int[] a, int i, int[] b, int j) {
52        int n = a.length, m = b.length;
53        while (i < n && j < m) {
54            if (a[i] != b[j]) return a[i] > b[j];
55            i++; j++;
56        }
57        return (n - i) > (m - j);//else the one with the more length will be considered as greater 
58    }
59}