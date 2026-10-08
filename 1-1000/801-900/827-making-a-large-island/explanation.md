# Explanation

## Idea
- Flood-fill each original island with a unique identifier and store its area.
- For every zero, collect the distinct neighboring island identifiers and evaluate one plus their total area.
- If no zero exists, return the entire grid area.

## Why It Works
- Flipping a cell connects exactly the islands touching it in the four allowed directions.
- Deduplicating identifiers prevents counting the same island twice when it touches several sides. Enumerating every zero covers every possible flip.

## Edge Cases
- An all-zero grid returns one; an all-one grid returns its full area.
- Border neighbors map to identifier zero, whose recorded area is zero.

## Complexity
- Time: $O(n^2)$ for an `n` by `n` grid, since every cell is painted once and each candidate examines four neighbors.
- Auxiliary space: $O(n^2)$ for island sizes and worst-case recursive depth; each neighbor set is constant-sized.

## Notes
- The grid is modified by replacing ones with island identifiers.
- A large connected island can cause recursion depth approaching 250000 cells, risking Java stack overflow. The solution remains unchanged.
