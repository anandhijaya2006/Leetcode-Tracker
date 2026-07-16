// Last updated: 7/16/2026, 6:57:32 PM
1class Solution {
2      public static int firstOccurences(int nums[],int target){
3        int left=0;
4        int right=nums.length-1;
5        int index  =-1;
6        while(left<=right){
7            int mid = left + (right - left)/2;
8            if (nums[mid] == target) index = mid;
9            if(target <= nums[mid]) right = mid - 1;
10            else left = mid + 1;
11        }
12        return index;
13      }
14      public static int LastOccurencces(int nums[],int target){
15        int left=0;
16        int right  =nums.length-1;
17        int index = -1;
18       while(left<=right){
19                 int mid = left+(right-left)/2;
20                 if(nums[mid]==target) index=mid;
21                 if(target>=nums[mid]) left=mid+1;
22                 else right=mid-1;
23       }
24       return index;
25      }
26    public int[] searchRange(int[] nums, int target) {
27       int res[]=new int[2];
28       res[0]=firstOccurences(nums,target);
29       res[1]=LastOccurencces(nums,target);
30       return res; 
31    }
32}