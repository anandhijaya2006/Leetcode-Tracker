// Last updated: 7/29/2026, 7:04:30 PM
1
2class Solution {
3    public int[] intersect(int[] nums1, int[] nums2) {
4
5        Arrays.sort(nums1);
6        Arrays.sort(nums2);
7    
8        ArrayList<Integer> arr = new ArrayList<Integer>();
9     
10        int i = 0, j = 0;
11        while(i < nums1.length && j < nums2.length){
12       
13            if(nums1[i] < nums2[j]) {
14                i++;
15            }
16           
17            else if(nums1[i] > nums2[j]){
18                j++;
19            }
20        
21            else{
22                arr.add(nums1[i]);
23                i++;
24                j++;
25            }
26        }
27    
28        int[] output = new int[arr.size()];
29        int k = 0;
30        while(k < arr.size()){
31            output[k] = arr.get(k);
32            k++;
33        }
34        return output;
35    }
36}