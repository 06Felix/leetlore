# Grid Illumination

## Idea

- Count active lamps by row, column, main diagonal `i + j`, and anti-diagonal `i - j`.
- Store active lamp coordinates in a set to ignore duplicate lamp inputs and support deletion.
- A query is illuminated if any of the four counters for its cell is positive.
- After answering, remove any active lamp in the query cell and its eight neighbors.

## Why It Works

- A lamp illuminates exactly its row, column, and two diagonals.
- The four maps summarize whether at least one active lamp illuminates a queried cell.
- Removing a lamp decrements exactly the counters it contributed to.
- The coordinate set ensures each physical lamp is counted and removed once.

## Edge Cases

- Duplicate lamp entries are ignored by `lampsSet.add`.
- Boundary queries clamp the neighbor loops to valid grid coordinates.
- Huge `n` is fine because no full grid is allocated.

## Complexity

- Time: $O(L + Q)$ because each query checks at most nine cells.
- Space: $O(L)$ for active lamp state.
