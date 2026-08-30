// Last updated: 8/30/2026, 6:30:21 PM
1class Solution {
2    public int minimumDeletions(int[] nums) {
3        int n = nums.length;
4        int left = 0;
5        int right = 0;
6
7        for(int i  = 1;i<n;i++){
8            if(nums[i] < nums[left])
9            left = i;
10            if(nums[i] > nums[right])
11            right = i;
12        }
13        if(left < right ){
14            int temp = left;
15            left = right;
16            right = temp;
17        }
18        int ans = n;
19
20        for(int i=0;i <= n;i++){
21            int extra = 0;
22            if(right >= i)
23            extra = n-right;
24            else if(left >= i)
25            extra = n- left;
26
27            ans = Math.min(ans, i+extra);
28        }
29        return ans;
30    }
31}