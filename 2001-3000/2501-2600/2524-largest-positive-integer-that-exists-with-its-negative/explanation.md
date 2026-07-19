# Explanation

Problem: [Largest Positive Integer That Exists With Its Negative](https://leetcode.com/problems/largest-positive-integer-that-exists-with-its-negative/)

## Idea

Use an array indexed by absolute value to track which signs have been seen. When both `k` and `-k` have appeared, the sum stored at index `k` becomes `0`, so `k` is a candidate answer.

## Why It Works

For each number `n`, the implementation maps it to `abs(n)`. It adds `n` into `ct[abs(n)]` unless that same signed value is already the stored value. With unique contribution from the positive and negative form, seeing both `k` and `-k` makes the bucket sum `0`. Whenever that happens, the answer is updated with the larger absolute value. Since every array element is processed, every valid pair is considered.

## Edge Cases

- If no opposite-signed pair exists, `ans` remains `-1`.
- Duplicate occurrences of the same sign do not create a false pair because the code avoids adding the same signed value again when it is already stored.

## Complexity

- Time: `O(n)`.
- Space: `O(1001)`, using the problem's value bound.
