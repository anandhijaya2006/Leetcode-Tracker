// Last updated: 10/8/2026, 10:14:25 AM
1class Solution {
2    public int rangeBitwiseAnd(int left, int right) {
3        while(right > left){
4            right = right & right - 1; 
5        }
6        return left & right;
7    }
8}