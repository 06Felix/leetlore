# Find Mode in Binary Search Tree

## Idea

- The submitted solution traverses every node.
- For each node value, `count` recursively counts occurrences of that value in the subtree rooted at that node.
- If the count is greater than the current mode frequency, the answer list is reset.
- If the count equals the current mode frequency, the value is appended.

## Why It Works

- A mode is any value with maximum frequency.
- The traversal considers each node value as a candidate.
- When a larger frequency is found, previous candidates are no longer modes.
- Equal frequencies are collected as additional modes.

## Edge Cases

- A single-node tree returns that node value.
- Duplicate values can be added when their counted frequency matches the maximum.
- The implementation does not use the BST inorder property.

## Complexity

- Time: $O(n^2)$ in the worst case because each candidate count may scan a subtree.
- Space: $O(h)$ recursion stack for traversal and counting, plus the answer list.

## Notes

- Because the traversal may evaluate the same value at multiple duplicate nodes, this implementation can append duplicate mode values in some tree shapes. The standard BST inorder counting approach avoids that risk.
