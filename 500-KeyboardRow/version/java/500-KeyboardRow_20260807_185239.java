// Last updated: 8/7/2026, 6:52:39 PM
1class Solution {
2    public String[] findWords(String[] words) {
3        HashSet<Character> set1 = new HashSet<>(Arrays.asList('q','w','e','r','t','y','u','i','o','p'));
4        HashSet<Character> set2 = new HashSet<>(Arrays.asList('a','s','d','f','g','h','j','k','l'));
5        HashSet<Character> set3 = new HashSet<>(Arrays.asList('z','x','c','v','b','n','m'));
6        List<String> result = new ArrayList<>();
7        
8        for(String word : words){
9            String lower = word.toLowerCase();
10            char first = lower.charAt(0);
11
12            HashSet<Character> currentSet;
13            if(set1.contains(first)){
14                currentSet = set1;
15            }else if(set2.contains(first)){
16                currentSet = set2;
17            }else{
18                currentSet = set3;
19            }
20
21            boolean flag = true;
22            for(int i=1; i<lower.length(); i++){
23                if(!currentSet.contains(lower.charAt(i))){
24                    flag = false;
25                    break;
26                }
27            }
28            if(flag){
29                result.add(word);
30            }
31        }
32    return result.toArray(new String[0]);
33    }
34}