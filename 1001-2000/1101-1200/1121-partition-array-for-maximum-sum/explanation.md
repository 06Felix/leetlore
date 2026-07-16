# Partition Array for Maximum Sum

## Idea

- `dp[i]` stores the best transformed sum for the first `i` elements.
- For each ending position `i`, the code tries every last block length `j` from `1` to `k`.
- While expanding that last block backward, it maintains the block maximum.
- The candidate value is `dp[i - j] + max * j`.

## Why It Works

- In any optimal partition of the first `i` elements, the last block has some valid length `j <= k`.
- That last block contributes its maximum value repeated `j` times.
- The prefix before it is independent and optimally represented by `dp[i - j]`.
- Trying all valid last block lengths therefore includes the optimal partition.

## Edge Cases

- `k = 1` leaves every element in its own block.
- A one-element array fills `dp[1]` directly.
- Large values fit because the problem guarantees the final answer fits in a 32-bit integer.

## Complexity

- Time: $O(nk)$.
- Space: $O(n)$.
