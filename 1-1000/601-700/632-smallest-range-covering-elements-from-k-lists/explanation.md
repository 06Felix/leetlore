# Explanation

## Idea
- Keep one active value from each sorted list in a min-heap, together with its list and position.
- Track the largest active value. Advance the list supplying the smallest value and retain the narrowest range.

## Why It Works
- The active minimum and maximum cover every list while the heap contains one entry per list.
- Advancing any other list cannot raise the minimum or shorten the range; advancing the minimum explores the next useful candidate.
- Stop when a list is exhausted. Minima never decrease, so updating only for strictly smaller widths preserves the smallest left endpoint on ties.

## Edge Cases
- A single list or a shared value across all lists produces a zero-width range.
- Duplicate and negative values work with the same heap ordering; the final removal does not introduce a new candidate.

## Complexity
- Time: $O(N \log(k + 1))$, where $N$ is the total number of values and $k$ is the number of lists.
- Auxiliary space: $O(k)$ for the heap.
