# Explanation

## Idea
- Enumerate every starting index and extend its running sum through at most `r` elements.
- For lengths at least `l`, keep the smallest strictly positive sum.
- Return `-1` if the initial sentinel remains unchanged.

## Why It Works
- Every subarray of an allowed length is reached exactly once by its start and endpoint.
- The running sum is the exact sum of the currently extended interval, including negative values.
- Filtering by minimum length and positivity leaves precisely the eligible intervals, and taking their minimum gives the answer.

## Edge Cases
- Zero and negative sums are excluded, even when their lengths qualify.
- `l = r` restricts candidates to one length; a start near the end stops at the array boundary.

## Complexity
- Time: $O(nr)$, bounded by $O(n^2)$.
- Auxiliary space: $O(1)$.

## Notes
- The sentinel 100001 exceeds every possible positive subarray sum under the stated limits of 100 elements and absolute values at most 1000.
