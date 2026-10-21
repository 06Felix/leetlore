# Number of Sub-arrays of Size K and Average Greater than or Equal to Threshold

## Idea
- Compute the first `k`-element sum and average, then inspect every fixed-size window.
- After each inspection, subtract the departing value, add the entering value, and recompute the average before the next iteration.

## Why It Works
- Removing and adding exactly the boundary elements preserves the sum of the current window.
- Iterations from `k` through `n` check each of the $n-k+1$ windows once, incrementing only when its average meets the threshold.

## Edge Cases
- `k = 1` checks individual elements; `k = n` checks one window.
- Equality counts, and threshold zero accepts every window under the positive-element constraints.

## Complexity
- $O(n)$ time and $O(1)$ auxiliary space; the input is unchanged.
- The code uses `double`. Window sums are at most $10^9$ and exactly representable; comparison against an integer threshold is safe at the stated bounds.
