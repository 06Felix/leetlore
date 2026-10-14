## Idea

- Copy the input list to an array, then test both k-length blocks for every starting index allowing 2k elements. Each check rejects any non-increasing adjacent pair.

## Why It Works

- Each feasible start is examined, and the two blocks are separated at exactly start+k. Both checks succeed exactly when all internal adjacent comparisons in both blocks are strict increases. The comparison across the blocks’ shared boundary is intentionally irrelevant.

## Edge Cases

- k=1 makes both singleton blocks increasing. Equal neighbors within a block fail.

## Complexity

- O(nk) time and O(n) array-copy space.
