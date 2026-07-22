# Explanation

Problem: [Drop Duplicate Rows](https://leetcode.com/problems/drop-duplicate-rows/)

## Idea

- Call `drop_duplicates` with `email` as the subset column.
- Return the resulting DataFrame.

## Why It Works

- Pandas compares rows by the specified `email` column only.
- By default, `drop_duplicates` keeps the first occurrence and removes later duplicates.
- Other columns from the retained rows are preserved, matching the required output.

## Edge Cases

- If all emails are unique, the DataFrame is unchanged.
- If many rows share one email, only the first is kept.

## Complexity

- Time: $O(n)$ average for hashing email values.
- Space: $O(n)$ for duplicate tracking and the returned DataFrame.

## Notes

- This is a Pandas solution, not Java; the explanation matches `solution.py`.
