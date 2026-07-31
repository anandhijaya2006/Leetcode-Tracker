// Last updated: 7/31/2026, 6:47:09 PM
1class Solution {
2    public int islandPerimeter(int[][] grid) {
3      int islands = 0;
4      int neighbours = 0;
5      for(int i = 0;i<grid.length;i++){
6        for(int j=0;j<grid[i].length;j++){
7            if(grid[i][j] == 1){
8                islands++;
9                if(i < grid.length - 1 && grid[i+1][j] == 1) neighbours++;
10                if(j < grid[i].length - 1 && grid[i][j+1] == 1) neighbours++;
11            }
12        }
13      }
14      return islands*4 - neighbours*2;
15    }
16}