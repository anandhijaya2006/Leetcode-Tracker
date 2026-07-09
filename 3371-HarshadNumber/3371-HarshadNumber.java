// Last updated: 7/9/2026, 3:06:10 PM
class Solution {
    public int sumOfTheDigitsOfHarshadNumber(int x) {
        int sum = 0;
        int temp = x;
        int digit;
        while(x !=0){
            digit = x %10;
            sum = sum + digit;
            x = x/10;

        }
        if(temp % sum==0){
            return sum;
        }else{
            return -1;
        }

        
    }
}