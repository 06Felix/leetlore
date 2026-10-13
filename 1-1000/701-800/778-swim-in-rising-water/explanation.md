## Idea

- Binary-search the water level. For each level, use DFS to test whether the start and destination connect through cells with elevations no larger than that level.

## Why It Works

- Raising the level only adds reachable cells, making feasibility monotone. The DFS checks that predicate exactly, and binary search returns the first feasible level. The maximum grid elevation is guaranteed to make the whole grid traversable.

## Edge Cases

- The start must also be submerged. A one-cell grid returns its own elevation.

## Complexity

- O(n² log(n²+1)) time and O(n²) space for visited cells and recursive search.

## Notes

- Recursive DFS can use O(n²) stack depth; stack capacity depends on the Java runtime.
