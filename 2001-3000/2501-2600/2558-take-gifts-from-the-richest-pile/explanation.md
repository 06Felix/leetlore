## Idea
- Put every pile in a max heap. For each of the k seconds, remove the largest pile and reinsert its integer square root.
- Drain the heap into a long total after all replacements.

## Why It Works
- The heap always selects a richest pile, and reinserting the reduced size preserves that invariant for the next second.
- Truncating the nonnegative square root leaves exactly the required number of gifts. Summing the remaining piles gives the final answer.

## Edge Cases
- Tied largest piles can be chosen in any order.
- A pile of one stays one. The total uses long because many large piles can exceed the int range.

## Complexity
- O((n + k) log(n + 1)) time, including individual insertions and the final heap drain; O(n) auxiliary space.
