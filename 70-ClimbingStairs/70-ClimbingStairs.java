// Last updated: 7/9/2026, 3:11:34 PM
class Solution {
    public int climbStairs(int n) {
      if(n <= 2) return n;
        int a = 1;
        int b = 2;
        int c = 0;
        for(int i = 3; i<=n;i++){
            c = a+b;
            a = b;
            b = c;

        }
      return c;

        
    }
}