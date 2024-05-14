class Pair{
    int x;
    int y;
    Pair(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
class Solution {
    public int shortestPathBinaryMatrix(int[][] grid) {
        int n = grid.length;
        if(grid[0][0] == 1 || grid[n-1][n-1] == 1) return -1;
        int vis[][] = new int[n][n];
        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(0,0));
        int min = Integer.MAX_VALUE;
        vis[0][0] = 1; 
        while(! q.isEmpty()) {
            Pair p = q.poll();
            int cnt = 1;
            int row = p.x;
            int col = p.y;
            for(int i = -1; i <= 1;i ++) {
                for(int j = -1; j <= 1; j++) {
                    int r = row + i;
                    int c = col + j;
                    if(r >= 0 && r < n && c >= 0&& c < n && grid[r][c] == 0 && vis[r][c] == 0) {
                        vis[r][c] = vis[row][col] + 1;
                        q.add(new Pair(r,c));
                    }
                }
            }

        }
        return vis[n-1][n-1] == 0 ? -1 : vis[n-1][n-1];
    }
}