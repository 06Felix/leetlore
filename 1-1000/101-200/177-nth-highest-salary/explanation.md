# Explanation

## Idea

- Define the required SQL function `getNthHighestSalary`.
- Use `DENSE_RANK()` over salaries ordered descending to rank distinct salary values.
- Return the maximum salary whose dense rank equals `N`.

## Why It Works

- `DENSE_RANK()` gives equal salaries the same rank and does not leave gaps, matching the requirement for distinct salaries.
- Ordering by `salary DESC` makes rank `1` the highest salary, rank `2` the second highest, and so on.
- Filtering on rank `N` selects exactly the requested distinct salary level.
- `MAX(salary)` collapses all employees at that salary into one scalar return value.

## Edge Cases

- If there are fewer than `N` distinct salaries, the filtered query returns no rows and `MAX` returns `NULL`.
- Duplicate salaries do not shift the rank of lower distinct salaries.

## Complexity

- Time: dominated by ranking the `Employee` rows, typically $O(n \log n)$ because of the descending salary order.
- Space: database-dependent working space for the window function.
