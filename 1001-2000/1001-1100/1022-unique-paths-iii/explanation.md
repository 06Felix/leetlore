# Explanation

## Idea

- Count all non-obstacle squares that must be visited, including the start.
- Start DFS from the start cell.
- Mark cells as visited during a path, explore four directions, then unmark on backtrack.

## Why It Works

- A valid path must visit every non-obstacle square exactly once before reaching the end.
- `empty` tracks how many required squares remain before stepping into the end.
- When DFS reaches the end with `empty == 0`, the path has visited all required squares.
- Marking a cell as `-2` prevents revisiting it in the current path.

## Edge Cases

- Obstacles and already visited cells are skipped because their value is negative.
- Paths that reach the end too early are not counted.
- Backtracking restores cells so other routes can reuse them.

## Complexity

- Time: $O(4^z)$ in the number of walkable squares `z`.
- Space: $O(z)$ recursion stack.
