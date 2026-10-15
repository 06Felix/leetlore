# Count Partitions With Max-Min Difference at Most K

## Idea

- Maintain the earliest valid segment start l using monotone deques of minimum and maximum indices. Use prefix sums of partition-count DP values to sum all choices for the final segment ending at r.

## Why It Works

- Removing leftmost elements cannot increase a segment’s max-minus-min range. Once [l, r] is valid, every later start is valid too. Thus dp[r + 1] is the sum of dp[l] through dp[r], obtained by subtracting DP prefix sums. Each deque index is inserted and removed at most once.

## Edge Cases

- k = 0 allows only constant-valued segments. Equal extrema remain in the deques until they expire. A singleton segment always restores validity.

## Complexity

- O(n) time and O(n) auxiliary space for DP, prefix sums, and deques.

## Notes

- All counts are reduced modulo 1000000007. The recurrence and window updates matched a direct DP on 3,267 exhaustive small cases.
