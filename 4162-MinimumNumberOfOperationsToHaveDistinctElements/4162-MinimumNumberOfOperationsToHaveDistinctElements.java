// Last updated: 7/9/2026, 3:05:45 PM
class Solution {
    public int minOperations(int[] nums) {
        
        int n = nums.length;
        int[] freq = new int[100001]; 
        int duplicateCount = 0;
        for (int i = 0; i < n; i++) {
            freq[nums[i]]++;
            if (freq[nums[i]] == 2) {
                duplicateCount++;
            }
        }
        if (duplicateCount == 0) {
            return 0;
        }
        int operations = 0;
        int index = 0;
        while (index < n && duplicateCount > 0) {
            operations++;
            for (int i = index; i < index + 3 && i < n; i++) {
                int val = nums[i];
                if (freq[val] == 2) {
                    duplicateCount--;
                }
                freq[val]--;
            }
            index = index + 3;
        }
        return operations;
    }
}

    
