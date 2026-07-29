# Explanation

## Idea

- Build the undirected adjacency list.
- Pick a node with minimum degree; in a valid grid, this is a corner or an endpoint for a one-row grid.
- Walk along the first row using degrees: corners/endpoints have degree `cDeg`, border interior nodes have degree `cDeg + 1`.
- Once the first row is known, fill each lower row by choosing the unvisited neighbor below each cell from the previous row.

## Why It Works

- In a valid grid graph, a minimum-degree node lies on a corner of a 2D grid or an endpoint of a 1D row.
- Along the boundary row, nodes continue until the next minimum-degree corner/end is reached.
- Sorting neighbors by degree biases the walk toward boundary nodes before interior nodes.
- After the first row is fixed, every next-row cell is the unique unvisited neighbor connected vertically to the cell above it.
- The problem guarantees a valid grid exists, so this reconstruction reaches all nodes exactly once.

## Edge Cases

- A single-row grid has endpoint degree `1`; the row walk continues through degree-`2` nodes until the other endpoint.
- A normal 2D grid starts from degree `2` corners and walks through degree-`3` border nodes.
- Visited marking prevents moving backward along the row or reusing nodes below.

## Complexity

- Time: `O(n + e + s log s)` from graph building and repeated neighbor sorting, where `s` is the total sorted neighbor-list size.
- Space: `O(n + e)`.
