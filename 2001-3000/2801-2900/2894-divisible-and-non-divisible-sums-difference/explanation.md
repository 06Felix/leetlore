# Divisible and Non-divisible Sums Difference

## Idea
- Let `q = n / m`; the divisible values are `m, 2m, ..., qm`.
- Compute their sum and subtract it twice from the sum of all values from one to `n`.

## Why It Works
- The arithmetic-series formula gives divisible sum $m q(q+1)/2$.
- Nondivisible sum is total minus divisible sum, so the requested difference is total minus twice the divisible sum.

## Edge Cases
- If `m > n`, there are no multiples and the result is the full total.
- For `m = 1`, every value is divisible and the answer is the negative total. Intermediate products fit `int` under the stated bounds.

## Complexity
- Time: $O(1)$ arithmetic operations.
- Space: $O(1)$ auxiliary storage.
