# Cells with Odd Values in a Matrix

## Idea

- Track row and column parity instead of building the whole matrix.
- Each operation toggles the parity of one row and one column.
- A cell is odd exactly when its row parity and column parity differ.

## Why It Works

- Incrementing a row flips the parity of every cell in that row.
- Incrementing a column flips the parity of every cell in that column.
- A cell receives one parity flip from its row and one from its column, so XOR tells whether the total number of flips is odd.

## Edge Cases

- Repeating the same row or column toggles it back to even parity.
- A cell touched by both an odd row and an odd column is even, so it is not counted.
- The implementation checks every cell after computing parities.

## Complexity

- Time: `O(k + mn)`, where `k` is `indices.length`.
- Space: `O(m + n)`.
