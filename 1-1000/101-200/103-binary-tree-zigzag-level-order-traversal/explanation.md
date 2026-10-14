## Idea

- Collect each BFS level in left-to-right order, reverse its list on odd levels, and append it to the result.

## Why It Works

- BFS gives exactly the required depth grouping. Reversing alternate level lists changes only their output direction while leaving child discovery order intact, yielding the prescribed zigzag.

## Edge Cases

- Null root returns no levels. Reversing a singleton level is harmless.

## Complexity

- O(n) time including all reversals, O(w) auxiliary space, and O(n) output space.
