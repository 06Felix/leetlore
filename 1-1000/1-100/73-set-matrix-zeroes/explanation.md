## Idea

- First mark every row and column containing an original zero, then zero any cell in a marked row or column.

## Why It Works

- The first pass records exactly the rows and columns affected by original zeros. Deferring writes to the second pass prevents newly created zeros from incorrectly triggering additional rows or columns.

## Edge Cases

- Zeros in the first row or column need no special treatment; an all-zero matrix stays zero.

## Complexity

- O(rows·columns) time and O(rows+columns) auxiliary space.

## Notes

- The matrix is modified in place, but the implementation does not meet the optional constant-extra-space follow-up.
