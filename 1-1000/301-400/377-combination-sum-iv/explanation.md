# Explanation

## Idea

Use one-dimensional dynamic programming by total sum. `dp[i]` stores how many ordered sequences add up to `i`.

For every target sum from `1` to `target`, the code tries each number as the last chosen value.

## Why It Works

If `num` is the last value in a sequence summing to `i`, then the prefix must sum to `i - num`. There are `dp[i - num]` such prefixes.

Summing this over all usable `num` counts all sequences ending at `i`. Because the outer loop is the sum and the inner loop is over numbers, different orders are counted separately.

## Edge Cases

- `dp[0] = 1` represents the empty prefix.
- Numbers larger than the current sum are skipped.
- If no sequence reaches the target, `dp[target]` remains `0`.

## Complexity

Time: `O(target * nums.length)`.

Space: `O(target)`.
