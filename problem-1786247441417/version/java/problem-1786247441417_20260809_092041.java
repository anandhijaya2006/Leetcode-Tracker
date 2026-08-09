// Last updated: 8/9/2026, 9:20:41 AM
1import java.util.Arrays;
2class Solution {
3    public double minPrice(int[] prices, int[] discounts) {
4        Arrays.sort(prices);
5        Arrays.sort(discounts);
6
7        int n = prices.length;
8        int m = discounts.length;
9        int k = Math.min(n,m);
10
11        double total = 0.0;
12
13        for(int i = 0;i< n-k;i++){
14            total += prices[i];
15        }
16        int j = m-k;
17        for(int i=n-k;i<n;i++){
18            total += prices[i] * (100.0 - discounts[j])/100.0;
19            j++;
20        }
21        return total;
22    }
23}