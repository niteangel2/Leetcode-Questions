class Solution {
    public int findCenter(int[][] edges) {
        List<List<Integer>> adj = new ArrayList<>();
        int n =  edges.length+1;
        for(int i = 0;i <= n;i++) {
            adj.add(new ArrayList<>());
        }
        for(int i = 0 ; i < n-1;i++) {
            int u = edges[i][0];
            int v = edges[i][1];
            adj.get(u).add(v);
            adj.get(v).add(u);
        }
        for(int i = 0;i < n + 1;i++) {
            if(adj.get(i).size() == n-1) return i;
        }
        return -1;
    }
}