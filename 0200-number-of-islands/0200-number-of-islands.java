class Solution {
    public void dfs(char[][] grid, int x, int y, boolean[][] vis) {
        int m = grid.length;
        int n = grid[0].length;
        vis[x][y] = true;
        int[] rdir = {-1,0,1,0};
        int[] cdir = {0,1,0,-1};
        for(int i = 0; i < 4;i++) {
            int r = rdir[i] + x;
            int c = cdir[i] + y;
            if(r >= 0 && r < m && c >= 0 && c < n && grid[r][c] == '1' && vis[r][c] == false) {
                dfs(grid,r,c,vis);
            }
        }
        
    }
    public int numIslands(char[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        boolean[][] vis = new boolean[m][n];
        int cnt = 0;
        for(int i = 0;i < m;i++) {
            for(int j = 0;j < n;j++) {
                if(grid[i][j] == '1' && !vis[i][j]) {
                    dfs(grid,i,j,vis);
                    cnt++;
                }
            }
        }
        return cnt;
    }
}