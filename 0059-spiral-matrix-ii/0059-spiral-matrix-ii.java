class Solution {
    public int[][] generateMatrix(int n) {
     //   List<Integer> ans=new ArrayList<Integer>();
        int[][] mat=new int[n][n];
        
        int startingRow=0;
        int startingCol=0;
        int endingRow=n-1;
        int endingCol=n-1;
        
        int count=1;
        int total=n*n;
        while(count<=total){
            //starting wali row
            for(int i=startingCol;count<=total && i<=endingCol;i++){
                mat[startingRow][i]=count;
                count++;
            }
            startingRow++;
            //ending column
            for(int i=startingRow;count<=total && i<=endingRow;i++){
                mat[i][endingCol]=count;
                count++;
            }
            endingCol--;
            //ending row
            for(int i=endingCol;count<=total && i>=startingCol;i--){
                mat[endingRow][i]=count;
                count++;
            }
            endingRow--;
            //first column
            for(int i=endingRow;count<=total && i>=startingRow;i--){
                mat[i][startingCol]=count;
                count++;
            }
            startingCol++;     
        }
        return mat;
    }
}