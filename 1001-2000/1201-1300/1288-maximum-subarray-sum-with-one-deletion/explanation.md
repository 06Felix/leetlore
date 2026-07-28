# Explanation

## Idea

Use two rolling DP states:

- `zero`: best subarray sum ending here with no deletion
- `one`: best subarray sum ending here with at most one deletion

The answer tracks the best `one` value seen.

## Why It Works

For each value `a`, `zero` is standard Kadane: either start at `a` or extend the previous no-deletion subarray.

For `one`, there are three choices: start at `a`, extend a previous one-deletion subarray with `a`, or delete the current `a` by taking the previous `zero`.

This covers every non-empty subarray with at most one deletion.

## Edge Cases

- All-negative arrays return the largest single value.
- Deleting is optional because `one` can start or extend with actual values.
- `Integer.MIN_VALUE / 2` avoids overflow when adding.

## Complexity

Time: `O(n)`.

Space: `O(1)`.
