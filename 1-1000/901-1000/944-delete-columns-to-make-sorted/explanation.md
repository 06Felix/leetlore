# Delete Columns to Make Sorted

## Idea

- Inspect each column from top to bottom. On the first adjacent descent, count that column once and stop checking it.

## Why It Works

- A column is nondecreasing exactly when no adjacent pair decreases. Every detected bad column must be deleted, while all other columns already satisfy the requirement independently.

## Edge Cases

- A single row requires no deletions. Equal adjacent letters are allowed.

## Complexity

- O(rows * cols) time and O(1) auxiliary space.

## Notes

- This version checks columns independently, without requiring the resulting row strings to be ordered.
