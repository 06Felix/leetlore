# Nth Highest Salary

## Idea

- The SQL function ranks employees by salary descending with `DENSE_RANK`.
- Equal salaries receive the same rank, so ranks are based on distinct salary values.
- The outer query selects salaries whose rank equals `N`.
- `MAX(salary)` returns that distinct salary, or `NULL` when no row has the requested rank.

## Why It Works

- `DENSE_RANK()` advances only when the salary value changes.
- Therefore rank `1` is the highest distinct salary, rank `2` is the second highest distinct salary, and so on.
- Filtering by `rank = N` isolates the requested distinct salary group.
- Aggregating with `MAX` returns a single scalar value required by the function.

## Edge Cases

- Duplicate salaries do not consume extra ranks.
- If there are fewer than `N` distinct salaries, the filtered set is empty and `MAX` returns `NULL`.
- `N = 1` returns the highest salary.

## Complexity

- Time: dominated by sorting/ranking the `Employee` salaries.
- Space: depends on the database execution plan for the window function.
