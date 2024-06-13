class Solution {
    public int minMovesToSeat(int[] seats, int[] students) {
        Arrays.sort(seats);
        Arrays.sort(students);     //sorting both arrays
        int minMoves=0;
        for(int i=0;i<seats.length;i++)    //for min moves just take the difference of both                                                           the array at same index 
        {
            minMoves=minMoves+Math.abs(seats[i]-students[i]);
        }
        return minMoves;
    }
}