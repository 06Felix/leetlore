# Lowest Common Ancestor of Deepest Leaves

## Idea
- A postorder DFS returns both a subtree's height and the LCA of its deepest leaves.
- Keep the deeper child's LCA when heights differ; choose the current node when heights match.

## Why It Works
- If one subtree is taller, every deepest leaf lies there, so its returned LCA remains the answer.
- If both nonempty subtrees have equal height, deepest leaves occur on both sides and their lowest common ancestor is the current node.
- Equal zero child heights identify a leaf, whose deepest-leaf LCA is itself. Null subtrees return height zero.

## Edge Cases
- A single-node tree returns the root; a chain returns its sole deepest leaf.
- The returned `depth` is subtree height, not absolute depth from the original root.

## Complexity
- Time: $O(n)$, visiting each node once.
- Auxiliary space: $O(h)$ for recursive frames and live DFS results, where $h$ is the tree height.

## Notes
- Recursion depth follows tree height; a maximally skewed tree requires up to 1,000 nested calls under the stated constraints.
- The implementation uses a Java record for the returned pair and requires a Java version supporting records.
