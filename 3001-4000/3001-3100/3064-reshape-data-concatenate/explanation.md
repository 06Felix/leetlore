# Explanation

Problem: [Reshape Data: Concatenate](https://leetcode.com/problems/reshape-data-concatenate/)

## Idea

- Use `pd.concat`.
- Pass `[df1, df2]` in that order.
- Concatenate along `axis=0` to stack rows vertically.

## Why It Works

- Vertical concatenation appends the rows of `df2` after the rows of `df1`.
- Both DataFrames have the same schema, so columns align by name.
- Passing the DataFrames in input order preserves the expected row order.

## Edge Cases

- If one DataFrame is empty, concatenation returns the rows of the other.

## Complexity

- Time: $O(n + m)$.
- Space: $O(n + m)$ for the returned DataFrame.

## Notes

- This is a Pandas solution, not Java; the explanation matches `solution.py`.
