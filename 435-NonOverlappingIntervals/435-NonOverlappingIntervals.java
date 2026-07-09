// Last updated: 7/9/2026, 3:08:38 PM
class Solution {
    public int eraseOverlapIntervals(int[][] inp) {
        Arrays.sort(inp,(a,b) ->a[1]-b[1]);
        int ans = 0;
        int ed = inp.length;
        int i = Integer.MIN_VALUE;
        for(int[] st : inp){
            if(i >st[0]) ans++;
            else i =st[1];
        }
        return ans;
    }
}