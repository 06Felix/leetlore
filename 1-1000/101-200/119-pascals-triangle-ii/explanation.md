# Explanation

## Idea

- Store the requested row in one array initialized to `1`.
- For each row length from `3` through `rowIndex + 1`, update entries from right to left.
- Each update adds the two values that would be adjacent in the previous row.

## Why It Works

- Pascal's rule is `C(i, j) = C(i - 1, j - 1) + C(i - 1, j)`.
- Updating from right to left keeps `arr[i - j - 1]` from the previous row while `arr[i - j]` receives the new value.
- The first and last entries remain `1`, so the final array is exactly the requested row.

## Edge Cases

- `rowIndex == 0` returns the one-element row `[1]`.
- The loops are skipped for the first two row sizes, which are already initialized correctly.

## Complexity

- Time: `O(rowIndex^2)`.
- Space: `O(rowIndex)`.
