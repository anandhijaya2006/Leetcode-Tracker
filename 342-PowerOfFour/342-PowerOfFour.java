// Last updated: 7/9/2026, 3:08:53 PM
class Solution {
    public boolean isPowerOfFour(int n) {
        return (n > 0 && ((n&(n-1))==0 && (n-1)%3==0));

        
    }
}