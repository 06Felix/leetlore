## Idea

- Replace each one cell with the largest all-one square side length ending there, using one plus the minimum of its upper, left, and upper-left neighbors. Sum the transformed matrix.

## Why It Works

- A square extends only as far as all three neighboring squares permit. A cell with maximum side s is the bottom-right corner of exactly s squares, one for each size from one through s.

## Edge Cases

- The first row and column keep their original zero/one sizes. Zero cells remain zero.

## Complexity

- O(rows·columns) time and O(1) auxiliary space.

## Notes

- The input matrix is modified in place to store DP values.
