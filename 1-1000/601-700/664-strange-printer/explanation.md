# Explanation

## Idea

Use memoized recursion on substrings. `strangePrinter(i, j)` returns the minimum turns needed to print `s[i..j]`.

The baseline prints `s[i]` separately, then solves the rest. If a later character equals `s[i]`, the code tries merging those two occurrences into one print turn.

## Why It Works

Printing `s[i]` alone gives a valid upper bound: `1 + solve(i + 1, j)`.

When `s[k] == s[i]`, the same print operation can cover both positions after the middle is arranged, so the solution can split into `solve(i, k - 1) + solve(k + 1, j)`.

Trying every matching `k` and memoizing each interval finds the best possible merge pattern.

## Edge Cases

- Empty intervals return `0`.
- Single-character intervals return `1` through the baseline.
- Repeated equal characters can collapse into fewer turns through the merge loop.

## Complexity

Time: `O(n^3)`.

Space: `O(n^2)` for memoization plus recursion stack.
