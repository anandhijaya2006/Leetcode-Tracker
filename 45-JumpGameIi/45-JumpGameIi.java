// Last updated: 7/9/2026, 3:12:04 PM
class Solution {
    public int jump(int[] nums) {
        int minJumps = 0;

        int near = 0;
        int far = 0;

    
        while (far < nums.length - 1) {

         
            int farthest = 0;

          
            for (int i = near; i <= far; i++) {
                farthest = Math.max(farthest, i + nums[i]);
            }

            
            near = far + 1;
            far = farthest;

            
            minJumps++;
        }

        return minJumps;
    }
}