// Last updated: 10/5/2026, 7:59:29 PM
1class Solution {
2    public int distributeCandies(int[] candyType) {
3        Set<Integer> set = new HashSet<>();
4        
5        for (int candy : candyType) 
6            set.add(candy);
7
8        return Math.min(candyType.length / 2, set.size());
9    }
10}