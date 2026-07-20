# Explanation

Problem: [Department Top Three Salaries](https://leetcode.com/problems/department-top-three-salaries/)

## Idea

Join employees to departments, rank salaries within each department using `DENSE_RANK`, and keep ranks at most `3`.

## Why It Works

The problem asks for employees whose salary is in the top three unique salaries of their department. `DENSE_RANK() OVER (PARTITION BY departmentId ORDER BY salary DESC)` assigns the same rank to equal salaries and does not skip ranks after ties. Therefore ranks `1`, `2`, and `3` are exactly the top three unique salary levels. Filtering `Rnk <= 3` returns every employee at those salary levels with the department name.

## Edge Cases

- Tied salaries are all included because `DENSE_RANK` gives them the same rank.
- Departments with fewer than three unique salaries return all employees in those ranks.

## Complexity

- Time: `O(n log n)` for window ordering within departments.
- Space: `O(n)` for the ranked intermediate result.
