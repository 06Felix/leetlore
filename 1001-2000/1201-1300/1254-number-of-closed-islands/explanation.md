## Idea
- Here zero denotes land. Flood-fill boundary-connected zeros into ones first.
- Scan again; for each remaining zero, count one closed island and erase its whole component with DFS.

## Why It Works
- An island is closed exactly when it has no four-directional land connection to the boundary.
- The first phase removes every nonclosed component. The second phase visits and counts each surviving component exactly once.

## Edge Cases
- Single rows or columns cannot contain a closed island.
- Diagonal contact does not connect islands; all-water or all-land grids produce zero.

## Complexity
- O(mn) time because every land cell is erased once.
- O(mn) worst-case auxiliary space for recursion.

## Notes
- The input grid is modified, replacing visited land with water.
- A long connected component can produce up to 10,000 recursive calls and may overflow the Java stack.
