# Explanation

Problem: [Lucky Numbers in a Matrix](https://leetcode.com/problems/lucky-numbers-in-a-matrix/)

## Idea

- Compute the minimum value in each row.
- Compute the maximum value in each column.
- Put all row minima in a set, then scan the column maxima.
- If a column maximum is already in the set, it is both a row minimum and a column maximum, so add it to the answer.

## Why It Works

- A lucky number must be the minimum in its row, so every candidate must appear in the row-minimum set.
- It must also be the maximum in its column, so checking each column maximum against that set finds exactly the valid values.
- The problem states all matrix values are distinct, so duplicate detection in the set corresponds to the same matrix value, not ambiguity between equal cells.

## Complexity

- Time: $O(mn)$ for an $m \times n$ matrix.
- Space: $O(m + n)$ for row minima, column maxima, and the set.

## Notes

- The implementation returns a list because there can be multiple lucky numbers in general.
