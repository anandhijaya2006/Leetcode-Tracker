// Last updated: 7/9/2026, 3:07:06 PM
class Solution {
    public int subtractProductAndSum(int n) {
        int sum =0;
        int mul = 1;
        while(n!=0){
            sum += n % 10;
            mul *= n % 10;
            n/=10;
        }
        return mul-sum;
        
    }
}