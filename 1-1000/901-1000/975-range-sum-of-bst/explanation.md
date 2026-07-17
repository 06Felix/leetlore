# Explanation

## Idea

- Do an inorder traversal of the BST.
- For every visited node, add its value when it lies inside `[low, high]`.
- Store the running total in `ans`.

## Why It Works

- Every node must be considered for inclusion in the range sum.
- The check `low <= value <= high` matches the problem's inclusive range.
- Adding each qualifying node exactly once gives the required total.

## Edge Cases

- Null children return immediately.
- If no node is in range, `ans` remains `0`.
- The implementation does not use BST pruning, but still visits all nodes correctly.

## Complexity

- Time: $O(n)$.
- Space: $O(h)$ recursion stack, where `h` is tree height.
