## Idea

- DFS right child before left child. Record a node only when its depth is the next depth not yet represented in the result.

## Why It Works

- Right-first traversal encounters the rightmost available node at every depth before any node to its left. Recording the first node at each new depth therefore yields the right-side view.

## Edge Cases

- A deeper left subtree still contributes nodes below the right subtree. Empty input returns an empty list on a fresh object.

## Complexity

- O(n) time, O(h) recursion space, and O(h) output space.

## Notes

- State reuse risk: ans and level are instance fields not reset in rightSideView. Repeated calls on the same Solution object can retain previous results.
