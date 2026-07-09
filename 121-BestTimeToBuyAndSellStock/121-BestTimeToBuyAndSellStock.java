// Last updated: 7/9/2026, 3:10:43 PM
class Solution {
    public int maxProfit(int[] prices) {
        int bp = prices[0];
        int maxp = 0;
        for(int i = 1;i<prices.length;i++){
            int sp = prices[i];
            if(sp > bp){
                int profit = sp-bp;
                if(maxp < profit)
                maxp = profit;
            }else{
                bp = prices[i];

            }
        }
        return maxp;
    }
}