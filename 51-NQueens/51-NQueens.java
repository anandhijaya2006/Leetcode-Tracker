// Last updated: 7/9/2026, 3:11:59 PM
class Solution {
    public List<List<String>> solveNQueens(int n) {

        List<List<String>> res = new ArrayList<>();
        boolean[] cols = new boolean[n];
        boolean[] digi1 = new boolean[ 2*n];
        boolean[] digi2 = new boolean[2*n];
        backtrack(n,0,cols,digi1,digi2,new int[n],res);
        return res;
    }

    public void backtrack(int n , int row, boolean[] cols, boolean[] digi1, boolean[] digi2, int[] queens,List<List<String>> res)
    {
        if( row == n )
        {
            res.add(buildBoard(queens,n));
            return;
        }

        for(int col =0; col<n; col++)
        {
            if(cols[col] || digi1[row-col +n] || digi2[row+col]) continue;
            cols[col]=digi1[row-col + n]=digi2[row+col]=true;
            queens[row] = col;
            backtrack(n,row+1,cols,digi1,digi2,queens,res);
            cols[col]=digi1[row-col+n]=digi2[row+col]=false;
        } 
    }

    public List<String> buildBoard(int[] queens , int n )
    {
        List<String> board = new ArrayList<>();

        for(int row =0; row<n; row++)
        {
            char[] currRow = new char[n];
            Arrays.fill(currRow,'.');
            currRow[queens[row]]='Q';
            board.add(new String(currRow));
        }
        return board;
    }
}