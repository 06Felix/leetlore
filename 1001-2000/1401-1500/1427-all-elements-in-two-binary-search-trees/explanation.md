# All Elements in Two Binary Search Trees

## Idea

- Traverse both trees and collect every node value into one list.
- Sort the combined list.
- Return the sorted values.

## Why It Works

- The answer must contain every value from both trees exactly once per node.
- DFS visits every node in each tree.
- Sorting the collected values produces ascending order regardless of traversal order.

## Edge Cases

- Either tree may be empty.
- Duplicate values are preserved because every node value is appended.
- Negative values sort naturally with integers.

## Complexity

- Time: `O(n log n)`, where `n` is the total number of nodes.
- Space: `O(n)` for the collected values and recursion stack.
