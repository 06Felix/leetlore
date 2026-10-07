# Explanation

## Idea
- Serialize the six tiles in row-major order and breadth-first search puzzle states toward `123450`.
- For each state, locate zero and swap it with each in-bounds side-sharing tile to generate neighbors.
- Store seen states and process the queue in layers, returning the layer count when the goal is generated.

## Why It Works
- Every generated neighbor represents exactly one legal move, and all legal moves are generated.
- Breadth-first layers explore states in increasing move count, so the first goal occurrence has minimum distance.
- Marking states when queued prevents cycles; exhausting the reachable states proves the goal is unreachable.

## Edge Cases
- An initially solved board returns zero before the search.
- Edge and corner moves are filtered by row and column bounds, and unsolvable arrangements return `-1`.

## Complexity
- Time and space: $O(6!)$ as a bound on the number of states; processing a state has fixed cost for this 2-by-3 board.
- With the fixed board size, both are constant with respect to input dimensions.
