# Explanation

Problem: [Convert an Array Into a 2D Array With Conditions](https://leetcode.com/problems/convert-an-array-into-a-2d-array-with-conditions/)

## Idea

Count how many times each value has appeared. The first copy of a value goes to row `0`, the second copy to row `1`, and so on, creating new rows as needed.

## Why It Works

Putting the `t`-th occurrence of a number into row `t - 1` guarantees that no row receives the same value twice. If a value appears `f` times, at least `f` rows are necessary because those copies must all be in different rows. The implementation creates exactly as many rows as the maximum frequency seen, so the number of rows is minimal.

## Edge Cases

- All values distinct produce one row.
- Repeated values automatically extend the answer with additional rows.

## Complexity

- Time: `O(n)`.
- Space: `O(n)` for the output plus the frequency array.
