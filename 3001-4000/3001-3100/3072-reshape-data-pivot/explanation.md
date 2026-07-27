# Explanation

Problem: [Reshape Data: Pivot](https://leetcode.com/problems/reshape-data-pivot/)

## Idea

- Call `pivot` on the weather DataFrame.
- Use `month` as the output index.
- Use `city` values as output columns.
- Fill cells with `temperature` values.

## Why It Works

- The target table has one row per month, so `index='month'` creates those rows.
- The target table has one column per city, so `columns='city'` creates those columns.
- The cell for a month/city pair must contain its temperature, which `values='temperature'` supplies.

## Edge Cases

- Missing month/city combinations would appear as missing values in the pivot output.

## Complexity

- Time: $O(n)$.
- Space: $O(n)$ for the reshaped table.

## Notes

- This is a Pandas solution, not Java; the explanation matches `solution.py`.
