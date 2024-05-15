class Solution {
    public int maxPointsInsideSquare(int[][] points, String str) {
        int n = points.length;
        for (int i = 0; i < n; i++) {
            points[i][0] = Math.abs(points[i][0]);
            points[i][1] = Math.abs(points[i][1]);
        }

        int s = 0;
        int e = (int) 1e9;
        int part = 0;
        int m = s + (e-s) / 2;
        while (s <= e) {
            Map<Character, Integer> map = new HashMap<>();
            int freq = 1;
            for (int i = 0; i < n; i++) {
                if (points[i][0] <= m && points[i][1] <= m) {
                    char c = str.charAt(i);
                    map.put(c, map.getOrDefault(c, 0) + 1);
                }
            }
            for (int val : map.values()) {
                if (val > 1) {
                    freq = 0;
                    break;
                }
            }
            if (freq == 1) {
                part = m;
                s = m + 1;
            } 
            else e = m - 1;
            m = s + (e-s)/2;
        }
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (points[i][0] <= part && points[i][1] <= part) count++;
        }
        return count;
    }
}
