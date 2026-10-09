## Idea
- Enqueue every zero as a BFS source and replace all ones with Integer.MAX_VALUE.
- For each queued cell, relax neighboring distances to its distance plus one and enqueue any improved neighbor.
- Return the modified input matrix as the distance matrix.

## Why It Works
- Starting BFS from all zeros explores cells in order of their distance to the nearest zero.
- A neighbor is updated only when the candidate distance is smaller. Its first discovery is already shortest, so each cell needs at most one enqueue.

## Edge Cases
- An all-zero matrix stays unchanged. Single rows and columns work with the same boundary checks.
- The statement guarantees at least one zero; only finite-distance cells are enqueued, so adding one never uses the sentinel value.

## Complexity
- O(mn) time and O(mn) auxiliary space for the queue. Distances are stored in the input matrix.

## Notes
- This implementation mutates mat and returns the same matrix.
