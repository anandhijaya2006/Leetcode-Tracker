// Last updated: 10/7/2026, 10:26:45 AM
1import java.util.*;
2class Solution {
3    public String[] findRestaurant(String[] list1, String[] list2) {
4        HashMap<String, Integer> map = new HashMap<>();
5        for(int i = 0; i<list1.length;i++)
6        map.put(list1[i], i);
7
8        int ms = Integer.MAX_VALUE;
9        ArrayList<String> result = new ArrayList<>();
10        for(int i = 0;i<list2.length;i++){
11            if(map.containsKey(list2[i])){
12                int sum = i+map.get(list2[i]);
13
14                if(sum < ms){
15                    ms = sum;
16                    result.clear();
17                    result.add(list2[i]);
18                }else if(sum == ms){
19                    result.add(list2[i]);
20                }
21            }
22        }
23        return result.toArray(new String[0]);
24    }
25}