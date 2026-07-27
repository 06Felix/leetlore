# Explanation

Problem: [Ugly Number II](https://leetcode.com/problems/ugly-number-ii/)

## Idea

- Generate ugly numbers in ascending order.
- Track three indices for the next number that can be multiplied by `2`, `3`, and `5`.
- The next ugly number is the minimum of those three candidate products.
- Advance every index whose candidate equals that minimum to avoid duplicates.

## Why It Works

- Every ugly number after `1` is a previous ugly number multiplied by `2`, `3`, or `5`.
- The three candidates are the smallest not-yet-used numbers from each multiplier stream.
- Taking their minimum produces the next smallest ugly number.
- Advancing all matching streams skips duplicate values like `6 = 2 * 3 = 3 * 2`.

## Edge Cases

- `n = 1` returns the initialized first ugly number, `1`.
- Duplicate candidate products are handled by three independent `if` checks.

## Complexity

- Time: $O(n)$.
- Space: $O(n)$.

## Notes

- The implementation stores candidate products in `int`, which is accepted under the problem's `n <= 1690` bound.
