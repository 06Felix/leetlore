## Idea

- Scan to the first target occurrence, then advance through its equal-value run and return both endpoints.

## Why It Works

- Sorted order makes every occurrence of target contiguous. The first matching scan index is its first occurrence, and the run’s final index is its last. No match leaves both endpoints −1.

## Edge Cases

- Empty input and absent targets return [−1,−1]. A singleton match returns the same index twice.

## Complexity

- O(n) worst-case time and O(1) auxiliary space.

## Notes

- Restriction violation: the statement explicitly requires O(log n) runtime, but this implementation scans linearly. The source is unchanged.
