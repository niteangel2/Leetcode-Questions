class Solution {
    public double averageWaitingTime(int[][] customers) {
        long time = 0;
        int totaltime = 0;
        for(int i = 0; i < customers.length;i++) {
            totaltime = Math.max(customers[i][0],totaltime) + customers[i][1];
            time += (totaltime-customers[i][0]);
            // System.out.println(time);
        }
        double avg = (1.0 * time)/customers.length;
        return avg;
    }
}