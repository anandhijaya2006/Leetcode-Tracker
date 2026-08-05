// Last updated: 8/5/2026, 8:50:24 PM
1class Solution {
2    public int findPoisonedDuration(int[] timeSeries, int duration) {
3        int total = 0;
4        for (int i = 0; i < timeSeries.length-1; i++) {
5       
6            if (timeSeries[i+1] <= timeSeries[i] + duration-1) {
7                total += timeSeries[i+1] - timeSeries[i];
8            } else { 
9                total += duration;
10            }
11        }
12        total += duration; 
13        return total;
14    }
15}