# Explanation

Problem: [Create a New Column](https://leetcode.com/problems/create-a-new-column/)

## Idea

- Create a new `bonus` column.
- Assign each row `salary + salary`.
- Return the modified DataFrame.

## Why It Works

- Pandas performs the salary addition element-wise across the column.
- Each output `bonus` value is therefore exactly double the corresponding `salary`.
- Assigning to `employees['bonus']` adds the required column while preserving existing columns and rows.

## Edge Cases

- Empty DataFrames still receive an empty `bonus` column.

## Complexity

- Time: $O(n)$.
- Space: $O(n)$ for the new column.

## Notes

- The implementation mutates the input DataFrame before returning it.
