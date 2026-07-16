# Transpose File

## Idea

- The `awk` script builds one output string per input column.
- For the first row, `arr[i]` starts with field `i`.
- For later rows, field `i` is appended to `arr[i]` with a space.
- In the `END` block, each accumulated column string is printed as one transposed row.

## Why It Works

- Transposing means output row `i` contains field `i` from every input row.
- The array index `i` directly represents the original column number.
- Appending fields while reading rows preserves top-to-bottom order within each output row.
- The problem guarantees all rows have the same number of columns.

## Edge Cases

- A single input row prints each original field on its own line.
- A single-column file prints one line containing all original rows.
- Fields are separated by one space as required by the prompt.

## Complexity

- Time: $O(rc)$ for `r` rows and `c` columns.
- Space: $O(rc)$ for the accumulated transposed rows.
