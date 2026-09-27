// Last updated: 9/27/2026, 9:12:28 AM
1import java.util.*;
2class Solution {
3    public int[] rearrangeArray(int[] nums) {
4        TreeMap<Integer, Integer> map = new TreeMap<>();
5        for(int num:nums){
6            map.put(num, map.getOrDefault(num, 0) + 1);
7            
8        }
9        int[] ans = new int[nums.length];
10        int index = 0;
11        while (!map.isEmpty()){
12            ArrayList<Integer> values = new ArrayList<>(map.keySet());
13            for(int value:values){
14
15            ans[index++] = value;
16            int count = map.get(value);
17                if(count == 1){
18                    map.remove(value);
19            }else {
20                map.put(value, count -1 );
21            }
22        }
23        }
24        return ans;
25    }
26}