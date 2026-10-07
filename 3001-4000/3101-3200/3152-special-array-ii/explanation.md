# Explanation

## Idea
- Build a prefix counter of adjacent pairs with equal parity.
- A query interval is special exactly when its two endpoint counters are equal.

## Why It Works
- The difference between counters at `r` and `l` counts bad pairs whose right endpoints lie in `l + 1` through `r`.
- Equality therefore means every adjacent pair inside the interval has different parity.

## Edge Cases
- A single-element interval is always special because it contains no pair.
- A bad pair immediately before the interval is excluded by subtracting the counter at its left endpoint.

## Complexity
- Time: $O(n + q)$ for preprocessing and all queries.
- Auxiliary space: $O(n)$ excluding the returned query answers.
