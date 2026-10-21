# Longest Repeating Character Replacement

## Idea
- Expand a window while tracking its 26 letter counts and the largest frequency seen so far (`mxCt`).
- Shrink from the left while the window length exceeds `mxCt + k`, and retain the largest resulting length. `mxCt` deliberately never decreases.

## Why It Works
- For a window with true maximum frequency $f$, making all letters equal costs its length minus $f$ replacements.
- A stale `mxCt` can retain an invalid current window, but cannot create a larger false answer: while that bound stays fixed, length can grow only up to `mxCt + k`, a length justified by the earlier window that established the frequency and its following extensions.
- The algorithm does not discard a potentially better feasible window: the stored maximum is at least the actual maximum, so shrinking only happens when the current length is certainly infeasible. Together these facts preserve the optimum length.

## Edge Cases
- `k = 0` finds the longest existing equal-letter run; `k` large enough permits the entire string.
- Stale frequencies are intentional. The retained window need not itself be a valid answer substring, but the returned maximum length is valid.

## Complexity
- $O(n)$ time because each pointer advances at most $n$ times.
- $O(1)$ auxiliary space for the fixed 26-letter count array.
