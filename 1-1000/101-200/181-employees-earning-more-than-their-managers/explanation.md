# Employees Earning More Than Their Managers

## Idea

- For each Employee row e, use a correlated scalar subquery to retrieve its manager’s salary. Return e.name under the Employee alias when e.salary is strictly greater.

## Why It Works

- The manager ID references the primary-key employee ID, so the subquery returns at most one salary. The strict comparison therefore selects exactly employees earning more than their recorded managers.

## Edge Cases

- A NULL or missing manager yields a NULL scalar result, making the WHERE comparison unknown and excluding that employee. Equal salaries are excluded.

## Complexity

- Plan-dependent: an indexed manager lookup typically gives O(E log E) work; repeated full scans without optimization could take O(E^2). Output size is O(E).

## Notes

- The existing solution uses a correlated subquery rather than a self-join. Fixture semantics were checked with SQLite; MySQL execution was not tested.
