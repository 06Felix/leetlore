class Solution {
    public int[] deckRevealedIncreasing(int[] deck){
        Deque<Integer> q = new ArrayDeque<>();
        Arrays.sort(deck);
        int l = deck.length;
        q.offer(deck[l-1]);
        for(int i = l - 2 ; i >= 0 ; i--){
            q.addFirst(q.pollLast());
            q.addFirst(deck[i]);
        }
        for(int i = 0 ; i < l ; i++)
            deck[i] = q.poll();
        return deck;
    }
}
