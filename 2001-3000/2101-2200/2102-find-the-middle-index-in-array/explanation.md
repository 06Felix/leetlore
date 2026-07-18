# Explanation

## Idea

- Compute the total sum first.
- Scan from left to right while maintaining the left sum.
- Before testing index `i`, subtract `nums[i]` from the remaining right-side total.

## Why It Works

- At index `i`, the right sum is the total of elements after `i`.
- `rsum` tracks the sum of elements before `i`.
- The first index where both sums match is the leftmost valid middle index.

## Edge Cases

- Index `0` uses left sum `0`.
- The last index uses right sum `0`.
- If no index matches, return `-1`.

## Complexity

- Time: $O(n)$.
- Space: $O(1)$.
