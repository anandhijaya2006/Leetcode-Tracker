// Last updated: 7/9/2026, 3:05:25 PM
class Solution {
    public int maxDigitRange(int[] nums) {
        int mr = -1;
        int sum = 0;
        for(int i=0;i< nums.length;i++){
            int n = nums[i];
            int max = 0;
            int min = 9;
            while(n > 0){
                int d = n % 10;
                if(d > max) max = d;
                if(d < min) min = d;
                n = n/10;
            }
            int range = max-min;
            if(range > mr){
                mr = range;
            }
        }
        for(int i=0;i<nums.length;i++){
            int n = nums[i];
            int temp = n;
            int max = 0;
            int min = 9;
            while(temp > 0){
                int d = temp % 10;
                if(d > max) max = d;
                if(d < min) min = d;
                temp = temp/10;
                
            }
            if(max - min == mr){
                sum += n;
            }
        }
        return sum;
    }
}