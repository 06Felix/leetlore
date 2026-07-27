# Explanation

Problem: [Drop Missing Data](https://leetcode.com/problems/drop-missing-data/)

## Idea

- Use Pandas `dropna`.
- Limit the missing-value check to the `name` column with `subset=['name']`.
- Return the filtered DataFrame.

## Why It Works

- The problem removes only rows where `name` is missing.
- `dropna(subset=['name'])` keeps rows whose `name` value is present and drops rows whose `name` is null.
- Other columns are preserved for every retained row, matching the requested result.

## Edge Cases

- If no names are missing, the original rows are all retained.
- If every name is missing, the result has the same columns and no rows.

## Complexity

- Time: $O(n)$ for `n` rows.
- Space: $O(n)$ for the returned DataFrame.

## Notes

- This is a Pandas solution, not Java; the explanation matches `solution.py`.
