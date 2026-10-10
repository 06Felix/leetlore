## Idea
- DFS left before right, assigning complete-tree indices: root zero, left child 2i + 1, and right child 2i + 2.
- Record the first and most recently visited index at each depth, then maximize last - first + 1.

## Why It Works
- In left-first DFS, nodes at a depth are encountered left to right.
- Complete-tree indices preserve missing positions between present nodes, so their endpoint difference gives the requested width when the indexing and first-position bookkeeping remain valid.

## Edge Cases
- A singleton or an ordinary one-branch tree has width one.
- Sparse levels include null gaps in the endpoint difference, even though DFS visits only real nodes.

## Complexity
- O(n) time, visiting each node once.
- Two fixed arrays of 3001 entries plus O(h) recursive stack space, where h is tree height.

## Notes
- Correctness risk: unnormalized int indices overflow on deep trees even when the true width fits int. Zero can then be a legitimate first index but is also used as the unset sentinel, allowing a later node to overwrite the first endpoint and undercount width.
- ans and depth arrays are not reset between calls on one Solution instance, so repeated calls can retain incorrect state. Deep recursion also depends on Java stack capacity.
