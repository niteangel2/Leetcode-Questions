class Solution {
    public int nthUglyNumber(int n) {
        int i1=0,i2=0,i3=0;
        int f1=2;
        int f2=3;
        int f3=5;
        int[] arr=new int[n];
        arr[0]=1;
        int min=Integer.MAX_VALUE;
        for(int i=1;i<n;i++){
            int mini=Math.min(Math.min(f1,f2),f3);
            arr[i]=mini;
            if(f1==mini){
                i1++;
                f1=2*arr[i1];
            }
            if(f2==mini){
                i2++;
                f2=3*arr[i2];
            }
            if(f3==mini){
                i3++;
                f3=5*arr[i3];
            }
        }
        return arr[n-1];
    }
}