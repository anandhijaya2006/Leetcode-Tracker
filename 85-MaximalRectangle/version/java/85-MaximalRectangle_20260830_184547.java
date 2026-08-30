// Last updated: 8/30/2026, 6:45:47 PM
1class Solution {
2    public int maximalRectangle(char[][] matrix) {
3        if (matrix == null || matrix.length == 0 || matrix[0].length == 0)
4            return 0;
5
6        int M = matrix.length;
7        int N = matrix[0].length;
8
9        int[][] mat = new int[M][N];
10        for (int i = 0; i < M; i++) {
11            for (int j = 0; j < N; j++) {
12                mat[i][j] = matrix[i][j] - '0';
13            }
14        }
15
16        for (int i = 0; i < M; i++) {
17            for (int j = 1; j < N; j++) {
18                if (mat[i][j] == 1) {
19                    mat[i][j] += mat[i][j - 1];
20                }
21            }
22        }
23
24        int Ans = 0;
25
26    
27        for (int j = 0; j < N; j++) {
28            for (int i = 0; i < M; i++) {
29                int width = mat[i][j];
30                if (width == 0) continue;
31
32                int currWidth = width;
33                for (int k = i; k < M && mat[k][j] > 0; k++) {
34                    currWidth = Math.min(currWidth, mat[k][j]);
35                    int height = k - i + 1;
36                    Ans = Math.max(Ans, currWidth * height);
37                }
38
39
40                currWidth = width;
41                for (int k = i; k >= 0 && mat[k][j] > 0; k--) {
42                    currWidth = Math.min(currWidth, mat[k][j]);
43                    int height = i - k + 1;
44                    Ans = Math.max(Ans, currWidth * height);
45                }
46            }
47        }
48
49        return Ans;
50    }
51}