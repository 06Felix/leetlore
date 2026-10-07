# Explanation

## Idea
- Keep the earliest valid start `l` and an interval `[lt, rt]` of values compatible with every element in the current window.
- If the next value fits, intersect its allowed interval with the current one. Otherwise rebuild the longest compatible suffix by scanning backward from that value.
- Add `r - l + 1` for every right endpoint, starting with the first singleton.

## Why It Works
- Intersecting each element's interval `[value - 2, value + 2]` identifies exactly which new values preserve the pairwise-difference bound.
- During rebuilding, the old window was already valid, so its suffix needs only to be compatible with the new value. The first incompatible element determines the new start.
- Every suffix of a valid window is valid, giving exactly `r - l + 1` subarrays ending at `r`.

## Edge Cases
- A singleton is always valid; duplicates and differences of exactly two are accepted.
- Rebuilding has no explicit lower-bound check, but an incompatible element in the previous window guarantees the backward scan stops before passing index zero.

## Complexity
- Time: $O(n)$ amortized. Rebuilt windows contain at most three distinct integer values; successive incompatible arrivals discard extrema, bounding how often a retained suffix is rescanned.
- Auxiliary space: $O(1)$; the subarray count uses `long`.
