# Explanation

Problem: [Rename Columns](https://leetcode.com/problems/rename-columns/)

## Idea

- Call `rename` with the required old-to-new column-name mapping.
- Use `inplace=True` so the input DataFrame is updated directly.
- Return the renamed DataFrame.

## Why It Works

- The mapping contains every required rename: `id`, `first`, `last`, and `age`.
- Pandas applies those name changes to the DataFrame columns.
- Renaming columns does not change row data, so all original values are preserved under the new names.

## Edge Cases

- Column order is preserved because only labels are renamed.

## Complexity

- Time: $O(c)$ for `c` columns.
- Space: $O(1)$ extra because the rename is in-place.

## Notes

- This is a Pandas solution, not Java; the explanation matches `solution.py`.
