// Last updated: 7/9/2026, 3:05:30 PM
class Solution {
    public int countValidSubarrays(int[] nums, int x) {
        int[] veltanoric = nums;
        int count = 0;
        int n = veltanoric.length;

        for(int i = 0;i<n;i++){
            long currentsum = 0;
        for(int j=i;j<n;j++){
            currentsum += veltanoric[j];

            long lastDigit = currentsum%10;
            long temp = currentsum;
            while(temp >= 10){
                temp /= 10;
                
            }
            long firstDigit = temp;

            if(firstDigit == x && lastDigit == x){
                count ++;
            }
        }
        }
        return count;
    }
}