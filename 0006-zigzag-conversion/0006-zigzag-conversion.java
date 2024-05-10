class Solution {
    StringBuilder sb = new StringBuilder();
    public String convert(String s, int numRows) {
        if(numRows == 1){
            return s;
        }
        String arr[] = new String [numRows];
        boolean flag = true;
        for(int i = 0 ; i < arr.length ; i++){
            arr[i] = "";
        }
        int i = 0;
        int j = 0;
        for(i = 0 ; i < s.length() ; i ++){
            arr[j] += s.charAt(i);
            if(flag){
                if(j < numRows - 1){
                    j ++;
                }
                else if(j == numRows - 1){
                    flag = false;
                    j --;
                }
            }
            else{
                if(j > 0){
                    j --;
                }
                else if(j == 0){
                    flag = true;
                    j ++;
                }
            }
        }
        
        String res = "";
        for(String temp : arr){
            res += temp;
        }
        return res;
    }
}