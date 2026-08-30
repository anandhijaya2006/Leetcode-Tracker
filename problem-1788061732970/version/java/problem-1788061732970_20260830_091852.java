// Last updated: 8/30/2026, 9:18:52 AM
1class Solution {
2    public int countSpecialIntegers(int[] nums) {
3        HashSet<Integer> seen = new HashSet<>();
4        HashSet<Integer> bad = new HashSet<>();
5        int prev = nums[0];
6        seen.add(prev);
7
8        for(int i = 1;i<nums.length;i++){
9            int x = nums[i];
10
11            if(seen.contains(x) && x != prev){
12                bad.add(x);
13                
14            }
15            seen.add(x);
16            prev = x;
17        }
18        return seen.size() - bad.size();
19    }
20}