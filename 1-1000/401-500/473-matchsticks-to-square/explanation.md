# Explanation

## Idea
- Reject fewer than four sticks or a total length not divisible by four.
- Initialize four remaining side capacities to one quarter of the total, sort the sticks, and assign them largest first by backtracking.
- Try every side with enough remaining capacity, restoring that capacity after an unsuccessful branch.

## Why It Works
- Every square must use four sides of equal total length. A complete assignment within those capacities uses every stick exactly once without breaking it.
- Exploring all fitting choices covers every possible assignment; capacity pruning removes only choices that cannot form a side.

## Edge Cases
- A stick larger than a side target cannot be assigned, causing failure.
- Equal sticks still represent separate sticks; the final check confirms all capacities are exhausted.

## Complexity
- Time: $O(n\log n + 4^n)$ as a worst-case upper bound; descending order helps practical pruning.
- Auxiliary space: $O(n)$ for recursion and sorting, plus four capacities.

## Notes
- The input array is sorted in place. The maximum allowed total, $15\cdot10^8$, fits in `int`.
- Equivalent side capacities are not deduplicated, so some symmetric search branches are repeated.
