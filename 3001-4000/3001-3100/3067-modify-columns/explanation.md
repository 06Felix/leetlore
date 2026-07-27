# Explanation

Problem: [Modify Columns](https://leetcode.com/problems/modify-columns/)

## Idea

- Assign `employees['salary'] * 2` back into the `salary` column.
- Return the modified DataFrame.

## Why It Works

- Pandas multiplies the entire `salary` column element-wise by `2`.
- Assigning the result back to `salary` replaces every original salary with its doubled value.
- Existing rows and other columns remain unchanged.

## Edge Cases

- Empty DataFrames remain empty with the same columns.

## Complexity

- Time: $O(n)$.
- Space: $O(1)$ extra beyond Pandas column assignment internals.

## Notes

- The implementation mutates the input DataFrame before returning it.
