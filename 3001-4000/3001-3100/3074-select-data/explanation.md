# Explanation

Problem: [Select Data](https://leetcode.com/problems/select-data/)

## Idea

- Filter rows where `student_id` equals `101`.
- Select the columns from `name` onward.
- Return the resulting DataFrame.

## Why It Works

- The row condition `students["student_id"] == 101` keeps only the required student.
- The column slice `"name" :` selects `name` and `age` for this schema.
- Pandas preserves matching row values and column order in the returned frame.

## Edge Cases

- If no row matched, Pandas would return an empty DataFrame with the selected columns.

## Complexity

- Time: $O(n)$ for scanning rows.
- Space: $O(k)$ for the returned matching rows.

## Notes

- This is a Pandas solution, not Java; the explanation matches `solution.py`.
