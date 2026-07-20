# Explanation

Problem: [Primary Department for Each Employee](https://leetcode.com/problems/primary-department-for-each-employee/)

## Idea

Return departments explicitly marked primary, plus the only department for employees who belong to exactly one department.

## Why It Works

For employees in multiple departments, the primary row is the one with `primary_flag = 'Y'`, so the first query returns it. For employees in exactly one department, that row may have `primary_flag = 'N'`, so the grouped second query keeps employees with `COUNT(*) = 1`. `UNION DISTINCT` combines these two valid categories into the required result.

## Edge Cases

- Single-department employees are included even when their flag is `N`.
- Multi-department employees contribute only their `Y` row.

## Complexity

- Time: `O(n)` grouping/filtering in a typical execution plan.
- Space: `O(e)` for grouped employee ids.
