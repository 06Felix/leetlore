# Explanation

Problem: [Partition Array for Maximum Sum](https://leetcode.com/problems/partition-array-for-maximum-sum/)

## Idea

- Use dynamic programming where `dp[i]` is the best score for the first `i` elements.
- For each endpoint `i`, try every last block length `j` from `1` to `k`, as long as the block fits.
- Maintain the maximum value inside that candidate last block while expanding it backward.
- Update `dp[i]` with `dp[i - j] + max * j`.

## Why It Works

- In an optimal partition of the first `i` elements, the final block has some length between `1` and `k`.
- Once that final block length is chosen, its contribution is its maximum value multiplied by its length.
- Everything before that block is independent and optimally represented by `dp[i - j]`.
- Trying all legal final block lengths therefore considers the optimal partition.

## Edge Cases

- `k = 1` leaves every element in its own block.
- A one-element array returns that element.
- Large values are stored in `int` because the problem guarantees the answer fits in 32 bits.

## Complexity

- Time: $O(nk)$.
- Space: $O(n)$.
