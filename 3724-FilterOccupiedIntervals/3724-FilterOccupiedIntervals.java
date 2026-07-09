// Last updated: 7/9/2026, 3:06:05 PM
class Solution {
    public List<List<Integer>> filterOccupiedIntervals(int[][] occupiedIntervals, int freeStart, int freeEnd) {
        Arrays.sort(occupiedIntervals, (a, b) -> Integer.compare(a[0], b[0]));
        List<int[]> merge = new ArrayList<>();
        for(int[] in : occupiedIntervals){
            if(merge.isEmpty() || merge.get(merge.size()-1)[1] < in[0]-1){
                merge.add(new int[]{in[0],in[1]});
            }else{
                merge.get(merge.size()-1)[1] = Math.max(merge.get(merge.size()-1)[1],in[1]);
            }
        }
        List<List<Integer>> ans = new ArrayList<>();
        for(int[] in:merge){
            int s = in[0];
            int e = in[1];
            if(e < freeStart || s > freeEnd){
                ans.add(Arrays.asList(s,e));
            }else{
                if(s < freeStart){
                    ans.add(Arrays.asList(s, freeStart - 1));
                }
                if(e > freeEnd){
                    ans.add(Arrays.asList(freeEnd+1, e));
                }
            }
        }
        return ans;
    }
}