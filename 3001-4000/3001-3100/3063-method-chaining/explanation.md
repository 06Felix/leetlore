# Explanation

Problem: [Method Chaining](https://leetcode.com/problems/method-chaining/)

## Idea

- Filter rows to animals with `weight > 100`.
- Sort those rows by `weight` descending.
- Select only the `name` column.
- Return the resulting DataFrame.

## Why It Works

- The boolean filter keeps exactly animals heavier than `100`.
- `sort_values(['weight'], ascending=False)` orders retained rows from heaviest to lightest.
- Selecting `[['name']]` returns only the required output column while preserving that sorted order.

## Edge Cases

- If no animals are heavier than `100`, the result is an empty one-column DataFrame.
- Animals with weight exactly `100` are excluded because the condition is strict.

## Complexity

- Time: $O(n \log n)$ due to sorting.
- Space: $O(n)$ for the filtered/sorted result.

## Notes

- This is a one-line Pandas method-chain solution, matching the imported `solution.py`.
