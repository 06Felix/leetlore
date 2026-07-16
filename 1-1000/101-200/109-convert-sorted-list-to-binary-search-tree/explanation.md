# Convert Sorted List to Binary Search Tree

## Idea

- The solution recursively builds a BST from a half-open list range `[head, tail)`.
- It uses slow and fast pointers to find the middle node of the current range.
- That middle node becomes the root.
- The left and right list ranges recursively become the left and right subtrees.

## Why It Works

- A sorted list's middle element is a valid BST root because all earlier values are smaller and all later values are larger.
- Splitting around the middle keeps subtree sizes balanced.
- The half-open `tail` boundary lets recursion split the singly linked list without modifying links.
- The base case `head == tail` represents an empty range.

## Edge Cases

- An empty list returns `null`.
- A single-node range creates one tree node with two empty children.
- Even-length ranges choose the upper middle based on the slow/fast pointer loop.

## Complexity

- Time: $O(n \log n)$ in this implementation because each recursive level rescans ranges to find middles.
- Space: $O(\log n)$ recursion stack for a balanced tree.
