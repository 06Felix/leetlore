## Idea

- Group cells by row−column into priority queues. Use max-heaps for the main and lower-left diagonals and min-heaps for upper-right diagonals, then refill cells in row-major order.

## Why It Works

- Row−column is constant on each diagonal. Row-major traversal visits each diagonal from top-left toward bottom-right; polling the corresponding heap writes its values in exactly the requested order.

## Edge Cases

- Length-one diagonals require no change. Duplicate and negative values are handled by the heaps.

## Complexity

- O(n² log n) time and O(n²) auxiliary space.

## Notes

- The input grid is modified in place.
