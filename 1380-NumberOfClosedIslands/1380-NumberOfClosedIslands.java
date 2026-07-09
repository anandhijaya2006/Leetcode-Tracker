// Last updated: 7/9/2026, 3:07:10 PM
class Solution {
    public int closedIsland(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        boolean[][] visit = new boolean[m][n];
         for (int i = 0; i < m; i++) {
            dfs(grid, visit, i, 0, m, n);
            dfs(grid, visit, i, n - 1, m, n);
        }

        for (int j = 0; j < n; j++) {
            dfs(grid, visit, 0, j, m, n);
            dfs(grid, visit, m - 1, j, m, n);
        }

        int count = 0;
        for (int i = 1; i < m - 1; i++) {
            for (int j = 1; j < n - 1; j++) {
                if (grid[i][j] == 0 && !visit[i][j]) {
                    count++;
                    dfs(grid, visit, i, j, m, n);
                }
            }
        }

        return count;
    }
    public void dfs(int[][] grid,boolean[][] visit,int i,int j,int m,int n){
       if (i < 0 || i >= m || j < 0 || j >= n) {
            return;
        }

        if (visit[i][j] || grid[i][j] == 1) {
            return;
        }

        visit[i][j] = true;

        dfs(grid, visit, i + 1, j, m, n);
        dfs(grid, visit, i - 1, j, m, n);
        dfs(grid, visit, i, j + 1, m, n);
        dfs(grid, visit, i, j - 1, m, n);
    }
    

}