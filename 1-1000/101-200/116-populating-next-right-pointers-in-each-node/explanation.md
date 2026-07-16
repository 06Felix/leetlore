# Populating Next Right Pointers in Each Node

## Idea

- The solution uses DFS on the perfect binary tree.
- For each node, it connects `root.left.next` to `root.right`.
- If the current node already has a `next`, it connects `root.right.next` to `root.next.left`.
- It then recurses into the left and right subtrees.

## Why It Works

- In a perfect binary tree, a node's left child is always immediately followed by its right child.
- A node's right child is followed by the left child of the node's next neighbor, when such a neighbor exists.
- Processing a node before its children provides the cross-parent links needed by lower levels.
- Null checks handle the empty tree and leaf children.

## Edge Cases

- An empty root returns `null`.
- Leaf nodes have no children and therefore create no links.
- The rightmost node on each level has no `next`, so its right child's `next` remains `null`.

## Complexity

- Time: $O(n)$.
- Space: $O(h)$ recursion stack.
