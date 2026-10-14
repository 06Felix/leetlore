## Idea

- Recursively count one for the current node plus both subtree counts, returning zero for null.

## Why It Works

- Every node belongs either to the root, its left subtree, or its right subtree. Adding these disjoint counts includes every node exactly once.

## Edge Cases

- An empty tree returns zero; a leaf returns one.

## Complexity

- O(n) time and O(log n) recursion space because the tree is complete.

## Notes

- Restriction violation: the problem explicitly requires less than O(n) time. This implementation visits every node and does not exploit completeness to achieve that bound.
