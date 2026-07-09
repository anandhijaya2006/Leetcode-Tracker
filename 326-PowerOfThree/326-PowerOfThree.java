// Last updated: 7/9/2026, 3:08:56 PM
class Solution {
    public boolean isPowerOfThree(int n) {
        if(n==0) return false;
        while ( n % 3==0){
            n/=3;
        }
         if(n==1) return true;
         else return false;        
    }
}