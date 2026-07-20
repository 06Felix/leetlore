# Explanation

Problem: [Triangle Judgement](https://leetcode.com/problems/triangle-judgement/)

## Idea

Return every row and compute a derived `triangle` column with the three triangle-inequality checks.

## Why It Works

Three positive side lengths form a triangle exactly when every pair of sides sums to more than the third side. The `IF` expression checks `x + y > z`, `y + z > x`, and `x + z > y`. Rows satisfying all three checks get `"Yes"`; all others get `"No"`.

## Edge Cases

- Degenerate cases where two sides sum exactly to the third return `"No"`.
- The query preserves the original side columns with `SELECT *`.

## Complexity

- Time: `O(n)` rows scanned.
- Space: `O(1)` auxiliary query state, excluding result rows.
