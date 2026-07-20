# Explanation

Problem: [Managers with at Least 5 Direct Reports](https://leetcode.com/problems/managers-with-at-least-5-direct-reports/)

## Idea

Group employees by `managerId` to find manager ids with at least five direct reports, then return the names of employees whose `id` is in that set.

## Why It Works

Each employee row contributes one direct report to the row's `managerId`. The subquery groups by `managerId` and keeps only groups where `COUNT(managerId) > 4`, which means at least five non-null direct reports. The outer query selects the employee row whose `id` matches one of those manager ids and returns that manager's name.

## Edge Cases

- Employees with `managerId IS NULL` do not affect any manager because `COUNT(managerId)` ignores nulls.
- Managers with exactly five direct reports are included.

## Complexity

- Time: `O(n)` grouping work in a typical indexed execution plan.
- Space: `O(m)` for grouped manager ids.
