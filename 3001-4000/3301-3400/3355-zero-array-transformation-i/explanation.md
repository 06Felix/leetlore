# Zero Array Transformation I

## Idea
- Encode every query's decrement capacity with a difference array, then prefix-sum it across the input.
- Subtract the total covering-query count from each value and reject any positive residual.

## Why It Works
- An index can be decremented once by each query covering it, independently of other indices.
- Therefore sufficient coverage at every index is necessary and sufficient; surplus coverage can be skipped to stop at zero.
- Difference-array endpoint updates compute that coverage in linear time without visiting every queried index.

## Edge Cases
- Already-zero entries need no chosen decrements; queries ending at the final index use the extra difference-array slot.
- A single insufficiently covered index returns false immediately, leaving later input entries unprocessed.

## Complexity
- Time: $O(n+q)$ for $q$ queries and $n$ values.
- Space: $O(n)$ for the difference array.

## Notes
- The code mutates `nums` into demand-minus-capacity residuals, which may be negative. These are feasibility calculations, not a literal valid sequence of decrements to a zero array.
- Early failure leaves the input partially modified.
