// Last updated: 7/22/2026, 6:37:23 PM
1class Solution {
2    public int[] intersection(int[] nums1, int[] nums2) {
3        
4        HashSet<Integer> set1 = new HashSet<>();
5        HashSet<Integer> set2 = new HashSet<>();
6        
7        for(int n1 : nums1){
8            set1.add(n1);
9        }
10     
11        for(int n2 : nums2){
12            set2.add(n2);
13        }
14        if(set1.size() <= set2.size()){
15            int[] result = new int[set1.size()];
16            int i = 0;
17            for(int n1 : set1){
18                if(set2.contains(n1)){
19                    result[i]=n1;
20                    i++;
21                }
22            }
23            return Arrays.copyOfRange(result,0,i);
24        }
25        else{
26            int[] result = new int[set2.size()];
27            int i = 0;
28            for(int n2 : set2){
29                if(set1.contains(n2)){
30                    result[i]=n2;
31                    i++;
32                }
33            }
34            return Arrays.copyOfRange(result,0,i);
35        }
36       
37    }
38}
39