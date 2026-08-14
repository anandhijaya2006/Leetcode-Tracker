// Last updated: 8/14/2026, 6:11:26 PM
1class Solution {
2    public int[] constructRectangle(int area) {
3         int[] ans = new int[2];
4        for (int i = (int)(Math.sqrt(area)); i >= 1 ; i--) {
5            if (area % i == 0) {
6                ans[1] = i;
7                ans[0] = area / i;
8                break;
9            }
10        }
11        return ans;
12    }
13}