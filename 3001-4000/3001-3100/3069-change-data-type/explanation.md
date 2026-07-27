# Explanation

Problem: [Change Data Type](https://leetcode.com/problems/change-data-type/)

## Idea

- Convert the `grade` column with `astype(int)`.
- Assign the converted column back into the DataFrame.
- Return the modified DataFrame.

## Why It Works

- `astype(int)` converts every value in the `grade` column from float representation to integer representation.
- Assigning it back replaces the column with the corrected type.
- Other columns are untouched, so only the required data type changes.

## Edge Cases

- Values like `73.0` convert cleanly to `73` as required by the examples.

## Complexity

- Time: $O(n)$.
- Space: $O(n)$ for the converted column.

## Notes

- This is a Pandas solution, not Java; the explanation matches `solution.py`.
