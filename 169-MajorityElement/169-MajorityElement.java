// Last updated: 7/9/2026, 3:10:16 PM
class Solution {
    public int majorityElement(int[] nums) {
        int count = 0;
        int maj = 0;

        for(int num : nums){
            if(count == 0){
                maj = num;
            }
            if(num == maj){
                count++;
            }else{
                count--;
            }
        }
        return maj;
        
    }
}