//using dfs algorithm
class Solution {
    public boolean dfs(ArrayList<ArrayList<Integer>> adj, int node, int col, int[] color) {
        color[node] = col;
        for(int it : adj.get(node)) {
            if(color[it] == -1) {
                if(dfs(adj,it,1-col,color) == false) return false;
            }
            else if(color[it] == col) return false;
        }
        return true;
    }
    public boolean isBipartite(int[][] graph) {
        int v = graph.length;
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for(int i = 0; i < v;i++) {
            adj.add(new ArrayList<>());
        }
        for(int i = 0; i < v;i++) {
            for(int j = 0; j < graph[i].length;j++) {
                adj.get(i).add(graph[i][j]);
            }
        }
        //System.out.println(adj);
        int[] color = new int[v];
        Arrays.fill(color,-1);
        for(int i = 0; i < v;i++) {
            if(color[i] == -1) {
                if(dfs(adj,i,0,color) == false) return false;
            }
        }
        return true;
    }
} 

//using bfs algorithm

class Edge{
    int src;
    int dest;
    Edge(int x,int y) {
        this.src = x;
        this.dest = y;
    }
}
class Solution {
    public boolean bipartite( ArrayList<Edge>[] g){
        int col[] = new int[g.length];
        Arrays.fill(col,-1);
        Queue<Integer> q = new LinkedList<>();
        for(int i = 0; i < g.length;i++) {
            if(col[i] == -1) {
                q.add(i);
                col[i] = 0;
                while(! q.isEmpty()) {
                    int curr = q.remove();
                    for(int j = 0; j < g[curr].size();j++) {
                        Edge e = g[curr].get(j);
                        if(col[e.dest] == -1) {
                            col[e.dest] = col[curr] == 0 ? 1 : 0;
                            q.add(e.dest);
                        }
                        else if(col[e.dest] == col[curr]) {
                            return false;
                        }
                    }
                }
            }
            
        }
        return true;
    }
    public boolean isBipartite(int[][] graph) {
        ArrayList<Edge>[] g = new ArrayList[graph.length];
        for(int i = 0; i < graph.length;i++) {
            g[i] = new ArrayList<>();
        }
        for(int i = 0; i < graph.length;i++) {
            for(int j = 0;j < graph[i].length;j++) {
                g[i].add(new Edge(i,graph[i][j]));
            }
        }
        return bipartite(g);
    }
}
