## Idea

- Run reverse DFS from each ocean’s boundary, moving only to equal or higher neighbors. Return cells marked by both ocean searches.

## Why It Works

- Reversing a legal downhill water edge gives a legal uphill search edge. Thus each visited set is exactly the cells that can reach that ocean in the original direction. Intersecting the two sets satisfies both requirements.

## Edge Cases

- Equal heights permit traversal. Boundary searches share a visited array per ocean, preventing repeated exploration.

## Complexity

- O(rows·columns) time and space, including recursion stack and output.

## Notes

- Runtime risk: recursive DFS can reach O(rows·columns) depth on a large plateau or long path, potentially overflowing the Java stack. The stored solution is unchanged.
