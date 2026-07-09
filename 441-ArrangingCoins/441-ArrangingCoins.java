// Last updated: 7/9/2026, 3:08:37 PM
class Solution {
    public int arrangeCoins(int n) {
        int row=1;
        while(n>=row){
            n-=row;
            row ++;
        }
        return row -1;
        
    }
}