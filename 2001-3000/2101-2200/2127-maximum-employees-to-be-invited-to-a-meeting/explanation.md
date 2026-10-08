# Explanation

## Idea
- Remove indegree-zero employees using a FIFO queue, propagating incoming chain lengths toward their favorites.
- Traverse the remaining cycles. Sum two-cycles with their incoming chains, and separately track the largest other cycle.
- Return the larger of these two seating possibilities.

## Why It Works
- A cycle of length at least three fills both neighboring seats for every cycle member, so it stands alone without attached chains.
- A mutual-favorite pair leaves one outward seat on each endpoint. Its longest incoming chains can attach there, and different pair blocks can join around one table.
- FIFO leaf removal processes incoming chains in nondecreasing depth; the final predecessor update is the deepest one. Thus the implementation's direct assignment, rather than a maximum, retains the required longest chain.

## Edge Cases
- Several disjoint mutual pairs can all contribute.
- Branching incoming trees contribute only one longest chain per pair endpoint; longer cycles compete against the total pair-block size.

## Complexity
- Time: $O(n)$ for indegrees, leaf removal, and cycle traversal.
- Auxiliary space: $O(n)$ for indegrees, chain lengths, and the array queue.

## Notes
- `cyLen` is an object field and is not reset at method entry. Reusing one `Solution` instance can return a stale larger cycle result on a later call. The imported solution is preserved.
