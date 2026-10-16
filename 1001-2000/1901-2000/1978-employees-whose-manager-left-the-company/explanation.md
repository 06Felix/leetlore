# Employees Whose Manager Left the Company

## Idea

- Select employee IDs with salary below 30000 whose manager_id is absent from the subquery of all current employee IDs. Order the result by employee_id ascending.

## Why It Works

- The subquery represents managers still employed. NOT IN therefore identifies a recorded manager ID whose row has disappeared, and the salary filter restricts the result to the required employees.

## Edge Cases

- A NULL manager_id does not pass NOT IN, correctly excluding employees who never had a recorded manager. Salary equal to 30000 is excluded.

## Complexity

- Plan-dependent: materializing membership and sorting can take O(E + R log R) expected work, while repeated unoptimized scans may take O(E^2), for E employees and R results.

## Notes

- The employee_id primary key is non-NULL, so the subquery cannot introduce NULL values that would invalidate NOT IN membership tests. Fixture semantics were checked with SQLite; MySQL execution was not tested.
