# Increment Submatrices by One

## Idea

- For every queried row, add +1 at col1 and -1 at col2 + 1 in a row difference array. Prefix-sum each row to build the result.

## Why It Works

- A row prefix includes the +1 precisely from col1 through col2; the cancellation after col2 stops the contribution. Adding the boundary changes for all queries therefore reconstructs every rectangle increment.

## Edge Cases

- The extra difference column permits queries ending at n - 1. Overlapping queries accumulate naturally.

## Complexity

- O(q * n + n^2) worst-case time and O(n^2) auxiliary space, plus the returned matrix.

## Notes

- This implementation loops through rectangle rows; it is not a constant-time four-corner update per query. Queries remain unchanged.
