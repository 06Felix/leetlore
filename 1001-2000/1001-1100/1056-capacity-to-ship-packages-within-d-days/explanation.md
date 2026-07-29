# Capacity To Ship Packages Within D Days

## Idea

- Binary search the minimum feasible ship capacity.
- The lower bound is the heaviest package; the upper bound is the sum of all weights.
- For a candidate capacity, greedily load packages in order until the next package would exceed capacity, then start a new day.

## Why It Works

- If a capacity can ship all packages within `days`, any larger capacity can also do so.
- If a capacity cannot, any smaller capacity cannot.
- The greedy check uses the fewest days for a fixed capacity because it fills each day as much as possible while preserving order.

## Edge Cases

- `days = 1` returns the total weight.
- `days = weights.length` can return the maximum single package weight.
- The lower bound guarantees no package exceeds the candidate capacity during feasibility checks.

## Complexity

- Time: `O(n log S)`, where `S` is the sum of weights.
- Space: `O(1)`.
