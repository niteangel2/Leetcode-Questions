class Solution {
    public boolean isNStraightHand(int[] hand, int groupSize) {
        if(hand.length % groupSize != 0) return false;
        Arrays.sort(hand);
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < hand.length;i++) {
            map.put(hand[i] , map.getOrDefault(hand[i],0)+1);
        }
        // int cnt = 0;
        for (int card : hand) {
            if (map.get(card) == 0) continue; 
            for (int i = 0; i < groupSize; i++) {
                int currentCard = card + i;
                if (!map.containsKey(currentCard) || map.get(currentCard) == 0) {
                    return false;  // If the sequence cannot be formed
                }
                map.put(currentCard, map.get(currentCard) - 1);
            }
        }

        return true;
    }
}