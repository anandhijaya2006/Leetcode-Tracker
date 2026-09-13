// Last updated: 9/13/2026, 7:54:58 PM
1class Solution {
2    public int countDigitOne(int n) {
3    int ones = 0;
4    for (long m = 1; m <= n; m *= 10)
5        ones += (n/m + 8) / 10 * m + (n/m % 10 == 1 ? n%m + 1 : 0);
6    return ones;
7}
8}