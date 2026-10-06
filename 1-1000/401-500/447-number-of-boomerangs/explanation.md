# Explanation

## Idea
- Treat each point as the boomerang's center and count other points by squared distance in a fresh map.
- A distance bucket containing `count` points contributes `count * (count - 1)` ordered choices for the other two positions.

## Why It Works
- Equal squared distances are equivalent to equal distances, so square roots are unnecessary.
- Choosing two different points in order gives exactly the bucket's contribution.
- Each boomerang has one center and one distance bucket, so summing across centers counts each tuple once.

## Edge Cases
- One point produces zero; the center itself enters a distance-zero bucket of size one and contributes nothing.
- Equal-distance points and negative coordinates need no special handling.

## Complexity
- Expected time: $O(n^2)$ with hash-map operations.
- Auxiliary space: $O(n)$ for one center's distance map.

## Notes
- The existing helper uses `Math.pow` and returns `double`, then casts the squared distance to `int`. The stated coordinate bounds keep squared distances at most $8 \cdot 10^8$, within the integer range.
