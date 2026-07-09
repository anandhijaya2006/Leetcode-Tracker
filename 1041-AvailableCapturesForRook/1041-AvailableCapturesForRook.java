// Last updated: 7/9/2026, 3:07:36 PM
class Solution {
    public int numRookCaptures(char[][] board){
        int rookrow = -1, rookcol = -1;
        for(int i=0; i<8;i++){
            for(int j=0;j<8;j++){
                if(board[i][j]=='R'){
                    rookrow = i;
                    rookcol = j;
                    break;
                }
            }
            if (rookrow != -1) break;
        }
        int captures = 0;
        int[][] directions = {{1,0}, {-1,0}, {0,1}, {0,-1}};
        for (int[] dir: directions){
            int i = rookrow + dir[0];
            int j = rookcol + dir[1];
            while(i >=0 && i <8 && j >= 0 && j<8){
                if(board[i][j]=='B') break;
                if(board[i][j]== 'p'){
                captures++;
                break;
            }
            i+=dir[0];
            j+=dir[1];
        }
    }
         return captures;        
    }
}