# Explanation

## Idea

For every index, the solution stores two values:

- `length[i]`: longest increasing subsequence ending at `i`
- `count[i]`: number of such subsequences ending at `i`

It checks all earlier indices that can precede `i`, then combines lengths and counts.

## Why It Works

Every increasing subsequence ending at `i` must end at some earlier `j` with `nums[j] < nums[i]`, then append `nums[i]`.

If appending from `j` creates a longer sequence than the current best at `i`, the code replaces both `length[i]` and `count[i]`. If it creates another sequence with the same best length, the code adds `count[j]`.

After all indices are processed, summing counts for indices with the global maximum length gives the number of longest increasing subsequences.

## Edge Cases

- Each element starts as one subsequence of length `1`.
- Equal values are not linked because the comparison is strictly `<`.
- If all values decrease, every element is a longest subsequence of length `1`.

## Complexity

Time: `O(n^2)`.

Space: `O(n)`.
