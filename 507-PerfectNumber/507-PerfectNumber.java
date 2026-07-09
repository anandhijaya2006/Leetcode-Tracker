// Last updated: 7/9/2026, 3:08:31 PM
class Solution {
    public boolean checkPerfectNumber(int num) {
        if(num<=0)
            return false;
        
        int sum = 0;
        for(int i=1;i<=num/2;i++){
            if(num %i == 0){
                sum+=i;
                
            }
               
        }
        return sum == num;
    }
}