# Explanation

## Idea
- Divide the input into maximal contiguous blocks whose values have the same number of set bits.
- Compute each block's minimum and maximum. Reject if its minimum is smaller than the previous block's maximum.

## Why It Works
- Allowed adjacent swaps preserve the set-bit-count sequence, so elements cannot cross a boundary between different counts.
- Within a block, all adjacent swaps are allowed, making any internal ordering achievable.
- Sorting each block independently produces a globally sorted array exactly when every preceding block's maximum is at most the next block's minimum.

## Edge Cases
- One block can always be sorted; single-element blocks simply test the ordering between their values.
- Separate blocks with the same bit count still cannot pass through an intervening block of a different count.

## Complexity
- Time: $O(n)$ with constant-time integer bit counting.
- Auxiliary space: $O(1)$; the input is not modified.
