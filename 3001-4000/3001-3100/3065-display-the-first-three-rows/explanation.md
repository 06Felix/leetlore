# Explanation

Problem: [Display the First Three Rows](https://leetcode.com/problems/display-the-first-three-rows/)

## Idea

- Call `employees.head(3)`.
- Return the resulting DataFrame slice.

## Why It Works

- Pandas `head(3)` returns the first three rows in their original order.
- It preserves the original columns and values.
- This matches the problem requirement to display only the first three rows.

## Edge Cases

- If fewer than three rows existed, `head(3)` would return all available rows.

## Complexity

- Time: $O(1)$ for the fixed first-three-row selection.
- Space: $O(1)$ beyond the returned view/copy object.

## Notes

- This is a Pandas solution, not Java; the explanation matches the imported `solution.py`.
