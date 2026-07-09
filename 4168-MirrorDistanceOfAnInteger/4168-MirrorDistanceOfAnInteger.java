// Last updated: 7/9/2026, 3:05:43 PM
class Solution {
    public int mirrorDistance(int n) {
        int n1=0;
        int temp=n;
        while(temp>0){
            n1=n1*10+temp%10;
            temp/=10;
        }
        return Math.abs(n-n1);
    }
}