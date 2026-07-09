// Last updated: 7/9/2026, 3:05:28 PM
class Solution {
    public boolean checkGoodInteger(int n) {
        int a=0;
        int b=0;
        while(n>0){
            int d=n%10;
            a+=d;
            b+=d*d;
            n=n/10;
        }

        return (b-a) >=50;
        
    }
}