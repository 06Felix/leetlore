# Explanation

Problem: [Count Salary Categories](https://leetcode.com/problems/count-salary-categories/)

## Idea

Run three aggregate queries, one for each required salary category, and combine them with `UNION ALL`.

## Why It Works

In MySQL, boolean expressions evaluate to `1` when true and `0` when false. Therefore `SUM(income < 20000)` counts low-salary accounts, `SUM(income >= 20000 AND income <= 50000)` counts average-salary accounts, and `SUM(income > 50000)` counts high-salary accounts. Using three fixed `SELECT`s guarantees all three category rows appear.

## Edge Cases

- Boundaries are handled explicitly: `20000` and `50000` are average salary.
- Categories with no matching accounts return `0` as long as the table has at least one row.

## Complexity

- Time: `O(n)` per aggregate scan; the implementation scans the table three times.
- Space: `O(1)` auxiliary query state.
