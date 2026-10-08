# Explanation

## Idea
- Traverse each tree left subtree before right subtree, enqueueing only leaf nodes.
- Compare leaf values by polling the two queues together, then require both queues to be empty.

## Why It Works
- Left-first DFS records leaves in exactly the required left-to-right order, regardless of internal tree shape.
- Pairwise equality checks matching sequence entries, and simultaneous exhaustion also checks equal sequence lengths.

## Edge Cases
- A one-node tree contributes its root as its only leaf.
- Identical sets of leaf values in different orders fail; a matching prefix with extra leaves also fails.

## Complexity
- Time: $O(n_1 + n_2)$ to traverse both trees and compare their leaves.
- Space: $O(L_1 + L_2 + \max(h_1,h_2))$ for leaf queues and recursion heights.
