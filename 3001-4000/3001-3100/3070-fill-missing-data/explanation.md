# Explanation

Problem: [Fill Missing Data](https://leetcode.com/problems/fill-missing-data/)

## Idea

- Apply `fillna(0)` to the `quantity` column.
- Assign the filled column back into the DataFrame.
- Return the modified DataFrame.

## Why It Works

- The problem only asks to fill missing values in `quantity`.
- `fillna(0)` replaces null entries in that column with `0`.
- Non-missing quantity values and all other columns remain unchanged.

## Edge Cases

- If no quantity is missing, the column stays the same.
- Multiple missing quantities are all filled in one vectorized operation.

## Complexity

- Time: $O(n)$.
- Space: $O(n)$ for the filled column.

## Notes

- This is a Pandas solution, not Java; the explanation matches `solution.py`.
