# Explanation

## Idea
- Scan left to right, counting black balls seen so far.
- For every white ball, add that count to the answer: it must pass all those earlier black balls.

## Why It Works
- Each black-before-white pair is an inversion that must be removed.
- An adjacent swap of a misplaced black and white ball removes exactly one inversion.
- Moving each white ball past its preceding black balls achieves this bound, so the inversion count is the minimum number of swaps.

## Edge Cases
- All-white, all-black, and already grouped inputs need zero swaps.
- A black prefix followed by a white suffix can require a quadratic number of swaps, so the answer uses `long`.

## Complexity
- Time: $O(n)$.
- Auxiliary space: $O(n)$ because the actual implementation calls `s.toCharArray()`; its counters otherwise use $O(1)$.
