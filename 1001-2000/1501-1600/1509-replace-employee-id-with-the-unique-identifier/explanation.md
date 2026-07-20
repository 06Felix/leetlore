# Explanation

Problem: [Replace Employee ID With The Unique Identifier](https://leetcode.com/problems/replace-employee-id-with-the-unique-identifier/)

## Idea

Left join `Employees` with `EmployeeUNI` on `id`, then select the unique id and employee name.

## Why It Works

The result must include every employee, even when there is no matching unique id. A left join preserves all rows from `Employees`; when no row exists in `EmployeeUNI`, the selected `unique_id` becomes `NULL`. When a match exists, the join supplies the corresponding unique id.

## Edge Cases

- Employees without a unique id are returned with `NULL`.
- Output order is unrestricted, so no `ORDER BY` is needed.

## Complexity

- Time: `O(e + u)` with normal join indexing, otherwise database-dependent.
- Space: `O(1)` auxiliary query state, excluding result rows.
