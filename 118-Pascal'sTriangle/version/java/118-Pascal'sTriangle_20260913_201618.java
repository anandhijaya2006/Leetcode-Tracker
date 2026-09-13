// Last updated: 9/13/2026, 8:16:18 PM
1class Solution {
2    public List<List<Integer>> generate(int numRows) {
3        List<List<Integer>> res = new ArrayList<>();
4        res.add(List.of(1));
5
6        for (int i = 0; i < numRows - 1; i++) {
7            List<Integer> dummyRow = new ArrayList<>();
8            dummyRow.add(0);
9            dummyRow.addAll(res.get(res.size() - 1));
10            dummyRow.add(0);
11            List<Integer> row = new ArrayList<>();
12
13            for (int j = 0; j < dummyRow.size() - 1; j++) {
14                row.add(dummyRow.get(j) + dummyRow.get(j + 1));
15            }
16
17            res.add(row);
18        }
19
20        return res;        
21    }
22}