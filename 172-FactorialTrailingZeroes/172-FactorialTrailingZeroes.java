// Last updated: 7/9/2026, 3:10:13 PM
class Solution {
    public int trailingZeroes(int n) {
        if(n==0){
            return 0;
        }else{
            return n/5 + trailingZeroes(n/5);
        }
        
    }
}