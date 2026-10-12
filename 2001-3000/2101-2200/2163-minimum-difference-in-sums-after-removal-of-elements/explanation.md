## Idea

- For each possible split, find the minimum sum of n retained values on the left and the maximum sum of n retained values on the right. A max-heap maintains the left n smallest values, while a min-heap maintains the right n largest. Minimize leftSum−rightSum over all splits.

## Why It Works

- Every valid retained sequence has a split between its first and second n values. For a fixed split, minimizing the first sum and maximizing the second sum are independent choices from disjoint ranges. The heaps maintain precisely those extremes, and scanning every feasible split finds the global minimum.

## Edge Cases

- n=1 still uses the same split logic. Negative differences are valid and preferred when smaller; long sums avoid overflow.

## Complexity

- O(n log n) time and O(n) auxiliary space, where the input contains 3n values.
