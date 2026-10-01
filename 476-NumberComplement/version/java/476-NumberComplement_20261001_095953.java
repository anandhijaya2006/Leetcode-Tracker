// Last updated: 10/1/2026, 9:59:53 AM
1class Solution {
2    public int findComplement(int num) {
3        if(num == 0) return 1;
4
5        int bitLength = Integer.toBinaryString(num).length();
6        int mask = (1 << bitLength) - 1;
7        return num^mask;
8    }
9}