// Last updated: 7/9/2026, 3:05:42 PM
class Solution {
    public int[] rotateElements(int[] nums, int k) {
        List<Integer> nonNeg = new ArrayList<>();

        for(int x: nums){
            if(x >= 0){
                nonNeg.add(x);
                
            }
        }
        int m = nonNeg.size();
        if(m == 0) return nums;
        k %= m;

        List <Integer> rotated = new ArrayList<>();

        for(int i=0;i<m;i++){
            rotated.add(nonNeg.get((i +k) % m));
        }
        int idx = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i] >= 0){
                nums[i] = rotated.get(idx++);
            }
        }
        return nums;
    }
}