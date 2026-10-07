# Explanation

## Idea
- Traverse mirror-positioned node pairs, starting with the root's two children.
- Swap each pair's values on odd levels and recurse into outer and inner mirrored child pairs with the parity toggled.

## Why It Works
- Mirror pairs occupy opposite positions in each level's left-to-right order, so swapping every pair reverses that level.
- The recursive pairings cover each non-root node once. Toggling parity swaps only odd levels while leaving the tree structure intact.

## Edge Cases
- A single-node tree ends immediately when the left child is null.
- Equal paired values need no special treatment; swapping them leaves the same values.

## Complexity
- Time: $O(n)$ for `n` nodes.
- Auxiliary space: $O(h)$ for tree height `h`, which is $O(\log n)$ for a perfect tree.

## Notes
- Checking only the left node for null is safe because the stated perfect-tree restriction guarantees the paired right node has matching existence.
- Values are changed in place and the original root is returned.
