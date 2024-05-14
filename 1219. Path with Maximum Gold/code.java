class Solution {
    int max = 0;
    public void dfs(int[][] grid,int i, int j, int[][] vis, int a) {
        int m = grid.length;
        int n = grid[0].length;
        vis[i][j] = 1;
        int ans = a + grid[i][j]; 
        int[] delrow = {-1,0,1,0};
        int[] delcol = {0,1,0,-1};
        for(int k = 0;k < 4;k++) {
            int r = i + delrow[k];
            int c = j + delcol[k];
            if(r >= 0 && r < m && c >= 0 && c < n && grid[r][c] != 0 && vis[r][c] == 0) {
                dfs(grid,r,c,vis,ans);
            }
        }
        vis[i][j] = 0;
        max = Math.max(ans,max);
    }
    public int getMaximumGold(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int[][] vis = new int[m][n];
        for(int i = 0; i < m;i ++) {
            for(int j = 0; j < n;j ++) {
                if(grid[i][j] != 0 ) {
                    dfs(grid,i,j,vis,0);
                }
            }
        }
        return max;

    }
}
