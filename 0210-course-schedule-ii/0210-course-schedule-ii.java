class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for(int i = 0; i < numCourses;i++) {
            adj.add(new ArrayList<>());
        }
        for(int i = 0; i < prerequisites.length;i++) {
            adj.get(prerequisites[i][1]).add(prerequisites[i][0]);
        }
        Queue<Integer> q = new LinkedList<>();
        int[] indegree = new int[numCourses];
        for(int i = 0; i < numCourses;i++) {
            for(int j = 0; j < adj.get(i).size();j++) {
                int v = adj.get(i).get(j);
                indegree[v]++;
            }
        }
        for(int i = 0; i < indegree.length;i++) {
            if(indegree[i] == 0) q.add(i);
        }
        ArrayList<Integer> res = new ArrayList<>();
        while(! q.isEmpty()) {
            int node = q.remove();
            res.add(node);
            for(int i = 0; i < adj.get(node).size();i++) {
                int v = adj.get(node).get(i);
                indegree[v]--;
                if(indegree[v] == 0) q.add(v);
            }

        }
        if(res.size() == numCourses) {
            int[] topo = new int[res.size()];
            for(int i = 0; i < res.size();i++) topo[i] = res.get(i);
            return topo;
        }
        return new int[0];
    }
}