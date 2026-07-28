# Explanation

## Idea

Use DFS with colors:

- `0`: unvisited
- `1`: currently in the recursion path
- `2`: fully processed

For each unvisited index, follow its jump. A valid cycle is found if the traversal reaches an index already in the current path.

## Why It Works

The next index is computed modulo the array length, handling both positive and negative jumps.

The code rejects single-index loops and rejects moves that switch direction. Therefore any back edge to a `color == 1` node represents a cycle of length greater than one with a consistent direction.

Once a path is fully checked, its nodes are marked processed so later starts do not redo the same work.

## Edge Cases

- Self-loops are invalid and return false for that path.
- Direction changes are invalid even if they form a cycle.
- Negative jumps are normalized with a positive modulo expression.

## Complexity

Time: `O(n)`.

Space: `O(n)` for colors and recursion stack.
