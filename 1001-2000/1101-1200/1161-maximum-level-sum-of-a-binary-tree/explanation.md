# Maximum Level Sum of a Binary Tree

## Idea

- Use BFS to process exactly the current queue size as one level, sum that level, and record its one-based index only when the sum strictly exceeds the previous maximum.

## Why It Works

- The queue batches nodes by depth, so each computed sum contains exactly one level. Scanning levels in increasing order and accepting only strict improvement selects the smallest level among tied maxima.

## Edge Cases

- Integer.MIN_VALUE initialization handles trees whose level sums are all negative. A single-node tree returns level one.

## Complexity

- O(N) time and O(W) queue space for N nodes and maximum width W.

## Notes

- The tree is unchanged. The maximum absolute level sum is bounded by 10000 * 100000, within int range.
