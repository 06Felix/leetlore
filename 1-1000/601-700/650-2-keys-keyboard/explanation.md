# Explanation

Problem: [2 Keys Keyboard](https://leetcode.com/problems/2-keys-keyboard/)

## Idea

- Use `dp[i]` as the minimum operations to build exactly `i` characters.
- Initialize `dp[i] = i`, representing copy one `A` and paste until `i`.
- Search downward for a divisor `j` of `i`.
- If found, build `j` first, then copy and paste `i / j - 1` times, adding `i / j` operations.

## Why It Works

- The final copy operation before reaching `i` must copy some count `j` that divides `i`.
- After building `j`, one copy plus enough pastes creates `i` in `i / j` operations.
- Larger divisors produce fewer final paste operations, so the downward search finds the best final block split.
- If no divisor is found, `i` is prime and the default `i` operations are necessary.

## Edge Cases

- `n = 1` returns `0` because no operation is needed.
- Prime `n` values keep the default cost.

## Complexity

- Time: $O(n^2)$ in the worst case.
- Space: $O(n)$.

## Notes

- The divisor loop stops at `j > 2`; this still works because the default covers prime cases and `j = 2` gives the same cost as default for powers handled by larger divisors earlier.
