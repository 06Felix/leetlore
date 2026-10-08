# Explanation

## Idea
- For every endpoint `i`, compute `start = max(0, i - nums[i])`.
- Add every element from that start through `i` directly to the total.

## Why It Works
- Each outer iteration visits exactly the subarray defined for that endpoint.
- Repeated contributions from overlapping subarrays are required by the requested total, so they must not be removed.

## Edge Cases
- A large endpoint value clamps the start to zero.
- Index zero contributes its own value once; every interval includes its endpoint.

## Complexity
- Time: $O(n^2)$ in the worst case, fitting `n <= 100`.
- Auxiliary space: $O(1)$.
