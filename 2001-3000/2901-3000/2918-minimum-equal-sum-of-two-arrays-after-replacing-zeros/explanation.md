# Minimum Equal Sum of Two Arrays After Replacing Zeros

## Idea
- Compute each array's existing sum and number of zeros using streams.
- Replacing every zero with one gives its minimum possible sum. Return the larger minimum unless a zero-free array is fixed below the other minimum.

## Why It Works
- An array with at least one zero can achieve every integer sum at or above its minimum by increasing one replacement.
- An array without zeros has exactly one achievable sum. The two impossibility checks detect when such a fixed sum cannot meet the other array's minimum.
- Otherwise, the larger minimum is achievable by both arrays and no smaller common sum can be valid.

## Edge Cases
- Two zero-free arrays succeed only when their sums already match.
- All-zero arrays still require positive replacements; sums and zero counts use `long` to cover large totals.

## Complexity
- Time: $O(n+m)$ for a constant number of scans over the two arrays.
- Space: $O(1)$ auxiliary storage; replacements are not materialized.
