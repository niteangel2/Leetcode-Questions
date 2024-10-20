class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for(int i = 0;i < numCourses;i++) {
            adj.add(new ArrayList<>());
        }
        int n = numCourses;
        for(int i = 0; i < prerequisites.length;i++) {
            adj.get(prerequisites[i][0]).add(prerequisites[i][1]);
        }
        int[] indegree = new int[n];
        for(int i = 0; i < adj.size();i++) {
            int u = i;
            for(int j = 0; j < adj.get(i).size();j++) {
                indegree[adj.get(u).get(j)]++;
            }
        }
        Queue<Integer> q = new LinkedList<>();
        for(int i = 0; i < n;i++) {
            if(indegree[i] == 0) q.add(i);
        }
        List<Integer> topo = new ArrayList<>();
        
        while(! q.isEmpty()) {
            int node = q.remove();
            topo.add(node);
            for(int i = 0; i < adj.get(node).size();i++) {
                int v = adj.get(node).get(i);
                indegree[v]--;
                if(indegree[v] == 0) q.add(v);
            }

        }
        if(topo.size() == n) return true;
        return false;
    }
}