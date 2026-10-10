## Idea
- Perform Morris traversal: when a node has a left subtree, temporarily link that subtree's rightmost node back to the current node.
- Follow the left subtree on the first encounter. On returning through the link, remove it, record the current value, and move right. Nodes without a left child are recorded immediately.

## Why It Works
- The temporary predecessor link replaces the return address normally stored in recursion or a stack.
- Each node is recorded after its left subtree and before its right subtree, exactly inorder, and every temporary link is removed on its second encounter.

## Edge Cases
- A null root returns an empty list.
- Skewed trees work without recursion; predecessor searches stop at either a null right pointer or the installed return link.

## Complexity
- O(n) time because predecessor edges are traversed only a constant number of times.
- O(1) auxiliary traversal space, excluding O(n) output.

## Notes
- Tree pointers are temporarily changed during traversal and restored before normal completion.
