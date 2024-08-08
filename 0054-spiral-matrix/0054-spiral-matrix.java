class Solution {
    public List<Integer> spiralOrder(int[][] mat) {
        List<Integer> ans=new ArrayList<Integer>();
        int row=mat.length;
        int col=mat[0].length;
        
        int startingRow=0;
        int startingCol=0;
        int endingRow=row-1;
        int endingCol=col-1;
        
        int count=0;
        int total=row*col;
        while(count<total){
            //starting wali row
            for(int i=startingCol;count<total && i<=endingCol;i++){
                ans.add(mat[startingRow][i]);
                count++;
            }
            startingRow++;
            //ending column
            for(int i=startingRow;count<total && i<=endingRow;i++){
                ans.add(mat[i][endingCol]);
                count++;
            }
            endingCol--;
            //ending row
            for(int i=endingCol;count<total && i>=startingCol;i--){
                ans.add(mat[endingRow][i]);
                count++;
            }
            endingRow--;
            //first column
            for(int i=endingRow;count<total && i>=startingRow;i--){
                ans.add(mat[i][startingCol]);
                count++;
            }
            startingCol++;     
        }
        return ans;
    }
}