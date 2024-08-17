class Solution {
    public List<List<Integer>> merge(int[][] intervals) {
        List<List<Integer>> arr = new ArrayList();
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        int start = intervals[0][0];
        int end = intervals[0][1];
        ArrayList<Integer> a = new ArrayList();
        for(int i = 0; i < intervals.length;i++){
            if(end >= intervals[i][0]){
                end = Math.max(end, intervals[i][1]);
            }
            else{
                arr.add(Arrays.asList(start, end));
                start = intervals[i][0];
                end = intervals[i][1];
            }
        }
                arr.add(Arrays.asList(start, end));

       return arr;
    }
    public int[][] insert(int[][] intervals, int[] newInterval) {
        int[][] arr = new int[intervals.length + 1][2];
        int i = 0;
        while(i < intervals.length){
            arr[i][0] = intervals[i][0];
            arr[i][1] = intervals[i][1];
            i++; 
        }
        arr[i][0] = newInterval[0];
        arr[i][1] = newInterval[1];
         List<List<Integer>> a = new ArrayList();
        a = merge(arr);
         int[][] merged = new int[a.size()][2];
        for(i = 0; i < a.size(); i++){
            merged[i][0] = a.get(i).get(0);
            merged[i][1] = a.get(i).get(1);
        }
        return merged;
    }
}