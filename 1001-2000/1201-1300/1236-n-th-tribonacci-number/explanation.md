# Explanation

Problem: [N-th Tribonacci Number](https://leetcode.com/problems/n-th-tribonacci-number/)

## Idea

- Return the base values for `n = 0`, `1`, and `2`.
- Keep the latest three Tribonacci values in variables `a`, `b`, and `c`.
- Iterate from `3` through `n`, computing `s = a + b + c`.
- Shift the window forward after each computation.

## Why It Works

- The recurrence defines each value as the sum of the previous three values.
- The variables always store the three most recent values before the next computation.
- Computing `s` from them gives the next Tribonacci number.
- Shifting `a`, `b`, and `c` preserves the invariant for the next iteration.

## Edge Cases

- The base cases avoid reading uninitialized recurrence values.
- `n = 3` performs one loop iteration and returns `2`.

## Complexity

- Time: $O(n)$.
- Space: $O(1)$.

## Notes

- The answer is guaranteed to fit in a 32-bit integer.
