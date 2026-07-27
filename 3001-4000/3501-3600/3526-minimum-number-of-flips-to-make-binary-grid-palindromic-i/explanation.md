# Explanation

Problem: [Minimum Number of Flips to Make Binary Grid Palindromic I](https://leetcode.com/problems/minimum-number-of-flips-to-make-binary-grid-palindromic-i/)

## Idea

- Define a helper that counts mismatched mirrored pairs in one row or column.
- Sum that helper over all rows to get the flips needed for all rows to be palindromic.
- Build each column as a list and sum the same helper over columns.
- Return the smaller of the row-flip and column-flip totals.

## Why It Works

- For one line, each mirrored pair must be equal in a palindrome.
- A mismatched pair can always be fixed with exactly one flip, and matched pairs need none.
- Rows are independent when making all rows palindromic, so summing row costs gives the exact row option.
- Columns are independent for the column option by the same reasoning.
- The problem allows either all rows or all columns to be palindromic, so the minimum of the two exact costs is optimal.

## Edge Cases

- Length-one rows or columns need zero flips.
- Rectangular grids work because rows and columns are evaluated separately.

## Complexity

- Time: $O(mn)$.
- Space: $O(m)$ temporary space per constructed column.

## Notes

- This is a Python solution, not Java; the explanation matches `solution.py`.
