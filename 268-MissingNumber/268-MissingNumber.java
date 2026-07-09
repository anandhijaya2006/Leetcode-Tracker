// Last updated: 7/9/2026, 3:09:09 PM
class Solution {
    public int missingNumber(int[] nums) {
        int expectedsum = 0;
        for(int i = 0; i<=nums.length;i++){
            expectedsum +=i;
        }
        int actualsum = 0;
        for(int num :nums){
            actualsum+=num;
        }
        return expectedsum - actualsum;

        
    }
}