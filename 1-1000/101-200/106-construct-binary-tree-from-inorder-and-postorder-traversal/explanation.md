# Construct Binary Tree from Inorder and Postorder Traversal

## Idea
- Map each value to its inorder index. Recursively track matching inorder and postorder ranges.
- The final postorder value is the root. Its inorder position determines the left subtree size and both children's traversal ranges.

## Why It Works
- Inorder places every left-subtree value before the root and every right-subtree value after it; unique values make the split unambiguous.
- Postorder lists the left subtree, then the right subtree, then the root. Splitting by the same left size preserves matching ranges at every recursive call.

## Edge Cases
- An empty postorder range returns `null`; a single value produces a leaf.
- Fully skewed trees are valid and produce recursion depth equal to the number of nodes.

## Complexity
- Expected $O(n)$ time for map construction and one visit per node.
- $O(n)$ map space and $O(h)$ recursion space, plus $O(n)$ output nodes.

## Notes
- A skewed tree can require 3,000 recursive calls, so Java stack capacity is a practical limit.
- The instance map is not cleared between calls. Current values are overwritten, so valid later calls still work, but old entries remain stored.
