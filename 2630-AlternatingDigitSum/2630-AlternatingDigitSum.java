// Last updated: 7/9/2026, 3:06:25 PM
class Solution {
    public int alternateDigitSum(int n) {
        int sum = 0;
        String s = String.valueOf(n);
        for(int i = 0;i < s.length();i++){
            int d = s.charAt(i) - '0';
            if(i % 2==0)
                sum +=d;
            else
                sum -=d;
                
                
        }
        return sum;
        
    }
}