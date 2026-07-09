// Last updated: 7/9/2026, 3:05:39 PM
class Solution {
    public int minAllOneMultiple(int k) {
        if(k % 2 == 0 || k % 5 == 0){
            return -1;
        }
        int remainder = 0;
        for(int length = 1; length <=k; length++){
            remainder =  (remainder * 10 +1) % k;
            if(remainder == 0){
                return length;
            }
        }
        return-1;
        
    }
}