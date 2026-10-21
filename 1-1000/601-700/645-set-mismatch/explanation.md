# Set Mismatch

## Idea
- Count occurrences in a vector indexed by `num - 1`, remembering the value whose count reaches two.
- Sum all input values. Subtract the duplicate once to obtain the sum of the distinct present values, then subtract that sum from $n(n+1)/2$ to find the missing value.

## Why It Works
- Exactly one value occurs twice, so the count reaching two identifies the duplicate uniquely.
- Removing its extra occurrence leaves every expected value except the missing one. The difference from the full range sum is therefore exactly the missing number.

## Edge Cases
- The missing or duplicate value may be at either endpoint of `1..=n`; neither requires special handling.
- The largest intermediate sum is safely within `i32` for $n\le10^4$.

## Complexity
- $O(n)$ time and $O(n)$ auxiliary space for the count vector.
- The Rust implementation consumes the input vector and returns `[duplicate, missing]`.
