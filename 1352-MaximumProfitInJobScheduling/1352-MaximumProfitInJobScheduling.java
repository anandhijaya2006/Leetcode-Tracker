// Last updated: 7/9/2026, 3:07:11 PM
class Solution {
    public int jobScheduling(int[] st, int[] end, int[] profit) {
        int[][] arr = new int[st.length][3];
        for(int i = 0;i <st.length;i++){
            arr[i][0] = st[i];
            arr[i][1] = end[i];
            arr[i][2] = profit[i];
        }
        Arrays.sort(arr,(a,b)->a[0]-b[0]);
        int n = st.length;
        int [] dp = new int[n+1];
        dp[n] = 0;
        Arrays.sort(st);
        for(int i = n-1;i>= 0;i--){
            int curr = arr[i][2];
            int af = 0;
            int en = arr[i][1];
            int ind = -1;
            for(int k = i+1;k<n;k++){
                if(en <= st[k]){
                ind =k;
                break;
            }
            }
            if(ind != -1)  af = dp[ind];
            int tot = curr+af;
            dp[i] = Math.max(tot,dp[i+1]);
           
        }
        return dp[0];
    }
    
}