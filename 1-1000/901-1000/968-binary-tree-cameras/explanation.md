## Idea
- Use postorder DFS with three states: -1 means uncovered, 0 means a camera is installed, and 1 means covered without a camera. Null children are treated as covered.
- If either child is uncovered, install a camera here. Otherwise, a child camera covers this node; with no child camera, leave the node uncovered for its parent.
- Add a final camera when the root remains uncovered.

## Why It Works
- An uncovered child still needs coverage from itself or its parent. Placing the camera at the parent also covers the sibling and the next ancestor, giving at least as much useful coverage.
- Processing bottom-up resolves each subtree before its parent; postponing cameras on already-covered nodes avoids unnecessary cameras. The final root check covers the only node without a parent.

## Edge Cases
- A leaf is returned uncovered, allowing its parent to cover it efficiently.
- A single-node tree needs the final root camera; null children do not force cameras.

## Complexity
- O(n) time because every node is processed once.
- O(h) auxiliary space for the recursive stack, where h is tree height.

## Notes
- The ans field is not reset in minCameraCover. Reusing one Solution instance across calls can overcount cameras; the implementation assumes a fresh instance for each test.
