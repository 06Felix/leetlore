# Explanation

Problem: [The Number of Employees Which Report to Each Employee](https://leetcode.com/problems/the-number-of-employees-which-report-to-each-employee/)

## Idea

Self-join employees as reports and managers, then group by manager to count direct reports and average their ages.

## Why It Works

The join condition `mgr.employee_id = emp.reports_to` pairs each employee with the manager they directly report to. Therefore every joined row is one direct report for `mgr`. Grouping by the manager id collects all direct reports for that manager. `COUNT(emp.reports_to)` gives the number of reports, and `ROUND(AVG(emp.age), 0)` gives the rounded average report age.

## Edge Cases

- Employees with no reports do not appear because the inner join has no matching `emp` rows for them.
- Managers with one report are included.

## Complexity

- Time: `O(n)` with indexing on manager ids, otherwise database-dependent.
- Space: `O(m)` for manager groups.
