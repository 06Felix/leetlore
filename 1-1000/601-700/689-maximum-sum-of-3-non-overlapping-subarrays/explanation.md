# Explanation

## Idea
- Compute every length-`k` window sum with a sliding sum.
- Build arrays recording the best window at or before each index and at or after each index.
- Enumerate the middle window and combine it with the best left window ending before it and best right window starting after it.

## Why It Works
- For a fixed middle start `i`, eligible outer starts lie at most at `i - k` and at least at `i + k`, ensuring all three windows are disjoint.
- Prefix and suffix maxima independently select the best outer sums. Enumerating every valid middle therefore finds the maximum total.
- The prefix keeps earlier equal maxima; the suffix uses `>=` while scanning backward to do the same. Increasing middle starts and replacing the answer only for a strictly larger total preserve the lexicographically smallest optimal triple.

## Edge Cases
- When the array length is exactly `3 * k`, the only triple is `[0, k, 2 * k]`.
- Equal window sums still select the earliest valid starts; the middle-loop bounds guarantee a window is available on both sides.

## Complexity
- Time: $O(n)$ for window sums, two maximum-index passes, and middle enumeration.
- Auxiliary space: $O(n)$ for the three arrays.
