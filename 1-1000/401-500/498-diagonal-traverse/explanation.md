## Idea

- Simulate the row and column position. Even row+column parity moves up-right; odd parity moves down-left. At an edge, step to the next diagonal.

## Why It Works

- Every diagonal has a constant row+column sum, so its parity determines its direction. The boundary rules move to the next diagonal without skipping or repeating a cell; writing exactly rows·columns values completes the traversal.

## Edge Cases

- Single-row and single-column matrices use the same edge rules. The position after the final write is never read.

## Complexity

- O(rows·columns) time and O(1) auxiliary space beyond the output array.
