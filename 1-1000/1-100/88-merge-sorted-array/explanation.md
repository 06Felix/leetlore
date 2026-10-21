# Merge Sorted Array

## Idea
- Start at the last real element of each input and the final slot of `nums1`.
- Write the larger remaining element into that slot and move its pointer backward. Continue until `nums2` is exhausted.

## Why It Works
- The largest unmerged value must be one of the two input tails, so every chosen value belongs at the end of the remaining output.
- Writing backward preserves unread values in `nums1`. Once `nums2` is empty, the remaining prefix of `nums1` is already correct.

## Edge Cases
- `m = 0` copies all of `nums2`; `n = 0` leaves `nums1` unchanged.
- Equal values and negative values use the same comparisons; trailing capacity zeros are never treated as input.

## Complexity
- $O(m+n)$ time and $O(1)$ auxiliary space.
- The result is stored in `nums1`; `nums2` is unchanged.
