# Explanation

Problem: [Integer Break](https://leetcode.com/problems/integer-break/)

## Idea

The implementation handles the small forced-split cases first, then greedily cuts off factors of `3` while the remaining value is greater than `4`. The final remainder is multiplied into the answer.

## Why It Works

For maximizing a product from a fixed sum, using `3`s is optimal whenever possible: replacing a part of size at least `5` with `3` and the remainder does not decrease the product. The only exception is leaving a final `1`, because `3 * 1` is worse than `2 * 2`; the loop stops at `n <= 4` so the remainder is one of the best final factors. The special cases `n = 2` and `n = 3` are needed because the problem requires at least two positive summands.

## Edge Cases

- `n = 2` returns `1` for `1 + 1`.
- `n = 3` returns `2` for `1 + 2`.
- When the remainder is `4`, the code keeps it as `4`, equivalent to `2 * 2`.

## Complexity

- Time: `O(n)`, with one loop iteration per removed `3`.
- Space: `O(1)`.
