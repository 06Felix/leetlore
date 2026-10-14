## Idea

- Map values to inorder indices. For each subtree, take its first preorder value as root and use its inorder position to split left and right ranges before recurring.

## Why It Works

- Preorder fixes the root; inorder partitions all remaining nodes into the left and right subtrees. Their sizes determine the corresponding preorder ranges. Unique values make every lookup and recursive partition unambiguous.

## Edge Cases

- An empty range returns null. A one-node range creates a leaf.

## Complexity

- Expected O(n) time and O(n) map plus O(h) recursion space, excluding the returned tree.

## Notes

- A skewed tree causes linear recursive depth and may exceed the runtime stack limit.
