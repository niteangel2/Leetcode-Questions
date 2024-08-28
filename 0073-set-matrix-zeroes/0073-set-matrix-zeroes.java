class Solution1 { //brute force if cells are not negative
    private void markRows(int i, int[][] matrix) {
        for(int j = 0; j < matrix[0].length;j++) {
            if(matrix[i][j] == 0) continue;
            matrix[i][j] = -1;
        }
    }
    private void markCol(int j, int[][] matrix) {
        for(int i = 0; i < matrix.length;i++) {
            if(matrix[i][j] == 0) continue;
            matrix[i][j] = -1;
        }
    }
    public void setZeroes(int[][] matrix) {
        for(int i = 0;i < matrix.length;i++) {
            for(int j = 0; j < matrix[0].length;j++) {
                if(matrix[i][j] == 0) {
                    markRows(i,matrix);
                    markCol(j,matrix);
                }
            }
        }
        for(int i = 0; i < matrix.length;i++) {
            for(int j = 0;j < matrix[0].length;j++) {
                if(matrix[i][j] == -1) matrix[i][j] = 0;
            }
        }
    }
}

class Solution {//better solution
    public void setZeroes(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        int[] col = new int[m];
        int[] row = new int[n];
        for(int i = 0;i < matrix.length;i++) {
            for(int j = 0; j < matrix[0].length;j++) {
                if(matrix[i][j] == 0) {
                    col[i] = 1;
                    row[j] = 1;
                }
            }
        }
        for(int i = 0; i < matrix.length;i++) {
            for(int j = 0;j < matrix[0].length;j++) {
                if(row[j] == 1 || col[i] == 1) matrix[i][j] = 0;
            }
        }
    }
}