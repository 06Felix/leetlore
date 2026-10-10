# Apply Operations to Maximize Score

## Idea
- Compute each value's number of distinct prime factors using trial division.
- Use monotonic stacks to find the nearest left index with prime score at least as large, and the nearest right index with a strictly larger prime score.
- An index can win $(i-left[i])(right[i]-i)$ subarrays. Consume these counts in descending numeric-value order, multiplying powers modulo $10^9 + 7$.

## Why It Works
- An equal prime score on the left defeats the current index by the smallest-index tie rule; an equal score on the right does not. The asymmetric stack comparisons encode this rule.
- Choosing either endpoint inside the two boundaries gives exactly the subarrays won by this index; each subarray has one winner.
- These subarrays can be chosen independently. Taking the largest available multipliers first maximizes the actual product before the modulo operation.

## Edge Cases
- Value 1 has prime score zero; repeated prime factors are counted only once.
- Equal prime scores preserve the earlier index's priority. Subarray counts use `long`, and consumed exponents fit `int` because they are capped by `k`.

## Complexity
- Time: $O(n\sqrt V + n\log n + n\log(k + 1))$ as a worst-case bound, where $V$ is the largest value; trial division is done separately for each element.
- Space: $O(n)$ for scores, boundaries, stacks, and the max-heap.
