// Last updated: 7/12/2026, 9:35:54 PM
1class Solution {
2    public boolean isPerfectSquare(int num) {
3        long start = 1, end = num;
4
5        while (start <= end) {
6            long mid = start + (end - start) / 2;
7
8            if (mid * mid == num) {
9                return true;
10            } else if (mid * mid > num) {
11                end = mid - 1;
12            } else {
13                start = mid + 1;
14            }
15        }
16
17        return false;
18    }
19}