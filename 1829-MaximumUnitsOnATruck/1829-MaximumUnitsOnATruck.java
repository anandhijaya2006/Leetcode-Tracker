// Last updated: 7/9/2026, 3:06:49 PM
class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        Arrays.sort(boxTypes,(a,b)->b[1]-a[1]);
        int i = 0;
        int ans = 0;
        int n = boxTypes.length;
        while(i< n && truckSize > 0){
            int maxi = Math.min(boxTypes[i][0],truckSize);
            ans += maxi *boxTypes[i][1];
            i++;
            truckSize -= maxi;
        }
        return ans;
    }
}