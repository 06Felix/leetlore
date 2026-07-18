# Explanation

## Idea

- If `depth == 1`, create a new root and attach the original tree as its left child.
- Otherwise, recursively walk down the tree while tracking current depth.
- At depth `depth - 1`, insert two new nodes between the current node and its old children.

## Why It Works

- The required row is attached below every node at depth `depth - 1`.
- The old left subtree becomes the left child of the new left node.
- The old right subtree becomes the right child of the new right node.
- Recursion reaches exactly the parent level where those rewires must happen.

## Edge Cases

- Adding at depth `1` changes the root.
- Adding below leaves works because old child references may be null.
- Depth can be one past the tree depth, creating new leaf nodes.

## Complexity

- Time: $O(n)$ in the worst case.
- Space: $O(h)$ recursion stack.
