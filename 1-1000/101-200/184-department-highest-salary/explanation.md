# Department Highest Salary

## Idea

- Compute the maximum salary for each department in a CTE. Join departments to employees and their department maximum, keeping equality with that maximum.

## Why It Works

- The grouped maximum identifies the required salary level, while joining back to employees retains every employee attaining it. The department join supplies the requested name.

## Edge Cases

- All tied highest earners are returned. Departments without employees produce no result rows.

## Complexity

- Plan-dependent: roughly O(E + D) expected aggregation/join work with suitable access paths, or additional sorting/index lookup costs, for E employees and D departments.

## Notes

- The original query passed a SQLite fixture with tied maxima. MySQL execution was not tested.
