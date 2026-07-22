# Explanation

Problem: [Flip String to Monotone Increasing](https://leetcode.com/problems/flip-string-to-monotone-increasing/)

## Idea

- Scan the string once.
- Track `ct1`, the number of `1`s seen so far.
- Track `dp`, the minimum flips needed to make the processed prefix monotone increasing.
- When seeing `0`, either flip this `0` to `1`, or flip all previous `1`s to `0`.

## Why It Works

- A monotone increasing binary string cannot have a `0` after a kept `1`.
- When the next character is `1`, it can always stay after the current prefix, so only `ct1` increases.
- When the next character is `0`, the only valid fixes are flipping this `0` or flipping every previous `1`.
- Taking `min(ct1, dp + 1)` chooses the cheaper of those complete fixes for the prefix.

## Edge Cases

- All-zero strings keep `dp = 0`.
- All-one strings never need to flip a `0`.

## Complexity

- Time: $O(n)$.
- Space: $O(1)$.

## Notes

- The variables are compressed: `ct1` is ones seen, and `dp` is current best flips.
