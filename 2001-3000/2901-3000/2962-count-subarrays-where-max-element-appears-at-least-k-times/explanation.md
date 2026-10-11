# Count Subarrays Where Max Element Appears at Least K Times

## Idea
- Find the maximum of the entire array, then track its occurrence count in a sliding window.
- When the count reaches `k`, move the left edge until one maximum is removed; add the resulting left pointer to the answer.

## Why It Works
- After shrinking, the current window has fewer than `k` maxima, while every earlier starting position has at least `k`.
- The count cannot skip above `k`: each insertion adds at most one maximum, and the previous window had fewer than `k`.
- Summing the number of valid starts for each right endpoint counts all qualifying subarrays exactly once.

## Edge Cases
- If the maximum occurs fewer than `k` times globally, the answer is zero.
- The relevant maximum is the whole array's maximum, not a separately computed maximum for each subarray. The answer uses `long`.

## Complexity
- Time: $O(n)$ for the maximum scan and sliding window.
- Space: $O(1)$ auxiliary storage.
