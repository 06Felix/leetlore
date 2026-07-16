# Explanation

Problem: [Convert Sorted List to Binary Search Tree](https://leetcode.com/problems/convert-sorted-list-to-binary-search-tree/)

## Idea

- Build the BST recursively over half-open list ranges `[head, tail)`.
- Use slow and fast pointers to find the middle node of the current range.
- Make the middle node the root, then recursively build the left range `[head, slow)` and right range `[slow.next, tail)`.
- Return null when the range is empty.

## Why It Works

- The input list is sorted, so choosing a middle value as root preserves BST ordering.
- Values before the middle belong in the left subtree and values after it belong in the right subtree.
- Splitting near the middle at every step keeps subtree sizes balanced.
- The `tail` boundary lets recursion describe sublists without modifying list links.

## Edge Cases

- An empty input list returns null.
- A single-node range becomes one tree node with null children.
- Even-length ranges choose the upper middle reached by the slow/fast pointer loop, which still yields a height-balanced tree.

## Complexity

- Time: $O(n \log n)$ because each recursive level scans sublists to find middles.
- Space: $O(\log n)$ recursion stack for the balanced tree.
