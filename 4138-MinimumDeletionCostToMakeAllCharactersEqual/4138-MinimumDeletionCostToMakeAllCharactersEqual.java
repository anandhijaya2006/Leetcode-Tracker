// Last updated: 7/9/2026, 3:05:55 PM
class Solution {
    public long minCost(String s, int[] cost) {
    
        long total = 0;
        long[] keep = new long[26]; 

        for (int i = 0; i < s.length(); i++) {
            total += cost[i];
            keep[s.charAt(i) - 'a'] += cost[i];
        }

        long best = 0;
        for (int k = 0; k < 26; k++) best = Math.max(best, keep[k]);

        return total - best; 
    }
}

