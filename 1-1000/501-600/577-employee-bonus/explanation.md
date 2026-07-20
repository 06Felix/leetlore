# Explanation

Problem: [Employee Bonus](https://leetcode.com/problems/employee-bonus/)

## Idea

Left join every employee to their bonus row, then keep employees whose bonus is missing or below `1000`.

## Why It Works

The left join preserves all employees, including those without a row in `Bonus`. For employees with no bonus, `Bonus.bonus` is `NULL`; `IFNULL(Bonus.bonus, 0)` treats that case as `0`, which is below `1000`. Employees with an actual bonus are kept only when that bonus is less than `1000`.

## Edge Cases

- Employees without bonuses are returned with `NULL` bonus values.
- Employees with bonus exactly `1000` are excluded because the condition is strict.

## Complexity

- Time: `O(e + b)` with normal join indexing, otherwise database-dependent.
- Space: `O(1)` auxiliary query state, excluding result rows.
