# Explanation

Problem: [Minimum Cost to Hire K Workers](https://leetcode.com/problems/minimum-cost-to-hire-k-workers/)

## Idea

Sort workers by their minimum wage-to-quality ratio. Sweep ratios from low to high while keeping the `k` smallest qualities among workers seen so far.

## Why It Works

For any chosen group, the pay rate per quality must be at least every worker's `wage / quality` ratio. If the current worker has the largest ratio in a candidate group, then the group cost is `sum(quality) * currentRatio`. While sweeping in increasing ratio order, all previously seen workers can be paid at the current ratio. To minimize cost for that fixed ratio, the implementation keeps the smallest possible total quality using a max-heap that discards the largest quality whenever more than `k` workers are available.

## Edge Cases

- `k = 1` works by considering each worker alone.
- Ratios are stored as `double`, which is appropriate because the accepted answer allows small floating-point error.

## Complexity

- Time: `O(n log n)`.
- Space: `O(n)` for the worker array and heap.
