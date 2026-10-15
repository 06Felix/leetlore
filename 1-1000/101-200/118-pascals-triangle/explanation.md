# Pascal's Triangle

## Idea

- Allocate each row filled with ones. Replace its internal entries by sums of the two neighboring entries in the preceding row, then append the row to the result.

## Why It Works

- Pascal’s boundary values are one, and its interior recurrence sums the two parents. Starting from the first row and applying both rules constructs every requested row correctly.

## Edge Cases

- The first two rows have no internal entries to update. A request for one row returns only [1].

## Complexity

- O(numRows^2) time and returned storage, with O(numRows) temporary row storage.

## Notes

- Rows are created with Arrays.asList and have fixed size, though their entries can be replaced. Values fit int through the allowed 30 rows.
