# Explanation

## Idea

The implementation builds two nearest palindrome candidates around the input:

- the largest palindrome smaller than `n`
- the smallest palindrome greater than `n`

It mirrors the left half of the number, then adjusts that half down or up when the mirrored candidate is not on the needed side.

## Why It Works

Any closest palindrome must be produced by keeping, decreasing, or increasing the leading half and mirroring it. Changing a more significant digit by more than one would create a larger distance.

The helper returns the nearest lower and upper candidates. The main method compares absolute distance to the original number and chooses the lower one on ties.

## Edge Cases

- Single-digit inputs choose `0` over the next higher digit when tied.
- Powers of ten and all-nine-style boundaries need special handling when the half shrinks or grows.
- Inputs fit in `long` under the problem constraints.

## Complexity

Time: `O(d)`, where `d` is the number of digits.

Space: `O(d)` for string construction.
