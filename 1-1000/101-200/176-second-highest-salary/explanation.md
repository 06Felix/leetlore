# Second Highest Salary

## Idea

- Use a scalar subquery to compute the answer as one value.
- Select distinct salaries, sort them descending, and skip the highest with `LIMIT 1, 1`.
- Alias the scalar result as `SecondHighestSalary`.

## Why It Works

- `DISTINCT` removes duplicate salary values, so rank is based on salary amount rather than employee count.
- Descending order puts the highest salary first and the second highest next.
- A scalar subquery returns `NULL` when the offset row does not exist, matching the required output.

## Edge Cases

- One employee or one distinct salary returns `NULL`.
- Duplicate highest salaries do not affect the second distinct salary.
- Negative or zero salaries would still sort correctly if present.

## Complexity

- Time: $O(n \log n)$ for sorting distinct salaries.
- Space: $O(n)$ for the distinct salary set used by the database.
