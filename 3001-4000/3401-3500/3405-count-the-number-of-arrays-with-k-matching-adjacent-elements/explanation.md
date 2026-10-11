# Count the Number of Arrays with K Matching Adjacent Elements

## Idea
- Choose which `k` of the `n - 1` boundaries have matching neighbors.
- Multiply that binomial coefficient by `m` choices for the first value and $(m-1)^{n-1-k}$ choices across the other boundaries, modulo $10^9+7$.

## Why It Works
- A matching boundary forces the next value, while a nonmatching boundary allows every value except the previous one.
- Every array has exactly one boundary pattern, so multiplying choices for each pattern and the number of patterns counts all valid arrays once.
- Modular inverses evaluate the binomial product, and binary exponentiation computes powers efficiently.

## Edge Cases
- `n = 1` yields `m`; `k = n - 1` yields the `m` constant arrays.
- For `m = 1`, the power is zero when any nonmatching boundary is required and one for exponent zero, giving the correct result.

## Complexity
- Time: $O(k\log MOD+\log n)$ in the general binomial branch; each denominator inverse is computed separately. Boundary binomial cases return immediately.
- Space: $O(1)$ auxiliary storage with iterative exponentiation.
