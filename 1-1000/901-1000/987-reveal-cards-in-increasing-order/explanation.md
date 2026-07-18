# Explanation

## Idea

- Sort the deck in increasing order.
- Build the answer in reverse using a deque, starting from the largest card.
- Before placing each next smaller card at the front, move the current last card to the front.

## Why It Works

- The forward reveal process removes the front card, then moves the next front card to the back.
- Reversing that process moves the previous back card to the front, then inserts the next revealed card at the front.
- Processing sorted cards from largest down to smallest reconstructs a deck that reveals in increasing order.

## Edge Cases

- A one-card deck is returned unchanged.
- Two cards are ordered naturally after the reverse simulation.
- Unique values avoid tie concerns.

## Complexity

- Time: $O(n \log n)$ for sorting.
- Space: $O(n)$ for the deque.
