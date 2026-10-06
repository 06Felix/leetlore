# Explanation

## Idea
- Traverse the BST in order, then copy its sorted values into an array.
- Binary-search each query. Exact matches supply both answers; otherwise use the insertion position to select its predecessor and successor.

## Why It Works
- Inorder traversal of a BST produces nondecreasing values.
- A missing query's insertion position separates all smaller values from all larger values, making the adjacent entries its closest bounds.
- Returning the query value twice for an exact match satisfies both inclusive comparisons.

## Edge Cases
- Queries below the minimum have no lower bound; queries above the maximum have no upper bound, represented by `-1`.
- Duplicate tree values do not affect exact matches or the surrounding insertion bounds.

## Complexity
- Time: $O(n + q \log n)$ for `n` nodes and `q` queries.
- Auxiliary space: $O(n + h)$ for the value list, copied array, and height-`h` recursion stack, excluding output.

## Notes
- The stored inorder list is not cleared on later calls; concatenating another traversal can break array ordering and binary-search correctness.
- A highly skewed tree near the node limit can exhaust the Java recursion stack.
