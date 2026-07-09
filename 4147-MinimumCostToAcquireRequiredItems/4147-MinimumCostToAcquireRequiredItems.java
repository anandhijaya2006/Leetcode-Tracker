// Last updated: 7/9/2026, 3:05:53 PM
class Solution {
    public long minimumCost(int cost1, int cost2, int costBoth, int need1, int need2) {
        long ans = Long.MAX_VALUE;
        int[] candiates = {
            0,
            need1,
            need2,
            Math.max(need1, need2)
        };
        for(int x : candiates){
            long cost = 
                (long) x * costBoth
                +(long) Math.max(0,need1 - x) * cost1
                +(long) Math.max(0, need2 - x)*cost2;
            ans = Math.min(ans, cost);
        }
        return ans;
    }
}