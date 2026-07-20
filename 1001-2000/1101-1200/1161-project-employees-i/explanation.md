# Explanation

Problem: [Project Employees I](https://leetcode.com/problems/project-employees-i/)

## Idea

Join each project assignment to the corresponding employee row, group by project, and average the employees' experience years.

## Why It Works

`Project.employee_id` identifies the employee assigned to each project row. Joining with `Employee` makes `experience_years` available for every assignment. Grouping by `project_id` collects all employees on the same project, and `AVG(Employee.experience_years)` computes that project's average experience. `ROUND(..., 2)` formats the result to the requested precision.

## Edge Cases

- Projects with one employee return that employee's experience as the average.
- `experience_years` is guaranteed non-null, so no null filtering is needed.

## Complexity

- Time: `O(p + e)` with normal join indexing, otherwise database-dependent.
- Space: `O(g)` for project groups.
