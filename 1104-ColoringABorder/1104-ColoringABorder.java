// Last updated: 7/9/2026, 3:07:32 PM
class Solution {
    public int[][] colorBorder(int[][] grid, int r, int c, int color) {
        if(grid == null || grid.length == 0)
        return null;
        if(grid[r][c] == color) return grid;
        int oldColor = grid[r][c];
        int n = grid.length,m = grid[0].length;
        boolean [][] visit = new boolean [n][m];
        dfs(grid,r ,c,oldColor,visit,color);
        
        return grid;
    }
    public void dfs(int[][] grid,int i,int j,int oldColor,boolean[][] visit,int color){
        if(i<0 || j<0|| i >= grid.length || j >=grid[0].length ||grid[i][j] !=oldColor || visit[i][j]) return;
        visit[i][j] = true;
        int flag = 0;

        if(i==0 || i==grid.length-1 || j==0 ||j==grid[0].length-1 || grid[i+1][j] != oldColor || grid[i-1][j] != oldColor || grid[i][j+1] != oldColor || grid[i][j-1] != oldColor)
        flag =1;

        dfs(grid,i+1,j,oldColor,visit,color);
        dfs(grid,i-1,j,oldColor,visit,color);
        dfs(grid,i,j+1,oldColor,visit,color);
        dfs(grid,i,j-1,oldColor,visit,color);
        if(flag == 1)
        grid[i][j] = color;
        
    }
}