// Last updated: 7/9/2026, 3:11:45 PM
class Solution {
    public int uniquePathsWithObstacles(int[][] obg) {
        int n = obg.length;
        int m = obg[0].length;
        int[][] arr = new int[n][m];
        if(obg[0][0] == 1 || obg[n-1][m-1] == 1) return 0;
        arr[0][0] = 1;
        for(int i = 0;i < n;i++){
            for(int j=0;j<m;j++){
                if(i==0 && j==0) continue;
                if(obg[i][j] == 1){
                    arr[i][j] = 0;
                }
                else if(i == 0 && j>0){
                    arr[i][j] = arr[i][j-1];
                }else if(j==0 && i>0){
                    arr[i][j] = arr[i-1][j];
                }
                else{
                    arr[i][j] = arr[i-1][j] + arr[i][j-1];
                } 
            }
        }
        return arr[n-1][m-1];
    }
}