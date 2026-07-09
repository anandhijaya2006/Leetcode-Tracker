// Last updated: 7/9/2026, 3:05:56 PM
import java.util.*;
class Solution {
    public long finishTime(int n, int[][] edges, int[] baseTime) {
        int[][] tor = edges;
        List<Integer>[] adj = new ArrayList[n];
        for(int i = 0;i<n;i++) adj[i] = new ArrayList<>();
        for(int[] e:edges) adj[e[0]].add(e[1]);

        long[] finish = new long[n];
        dfs(0, adj, baseTime, finish);
        return finish[0];
    }

    private void dfs(int u, List<Integer>[] adj,int[] baseTime,long[] finish ){
        if(adj[u].isEmpty()){
            finish[u] = baseTime[u];
            return;
        }

        long min = Long.MAX_VALUE, max = Long.MIN_VALUE;
        for(int v: adj[u]){
            dfs(v,adj,baseTime,finish);
            min = Math.min(min, finish[v]);
            max = Math.max(max,finish[v]);
        }
        finish[u] = max+(max-min) + baseTime[u];
    }
}