# Explanation

Problem: [Queries Quality and Percentage](https://leetcode.com/problems/queries-quality-and-percentage/)

## Idea

Group rows by `query_name`. For each group, average `rating / position` for quality and average the boolean expression `rating < 3` for poor-query percentage.

## Why It Works

The quality definition is the average of `rating / position`, which `AVG(rating / position)` computes per query. In MySQL, the comparison `rating < 3` evaluates to `1` for poor queries and `0` otherwise, so its average is the fraction of poor rows. Multiplying by `100` converts that fraction to a percentage, and both values are rounded to two decimals.

## Edge Cases

- Duplicate rows are counted independently, as the table permits duplicates.
- Rows with `query_name IS NULL` are filtered out by the implementation.

## Complexity

- Time: `O(n)` grouping work in a typical execution plan.
- Space: `O(q)` for query-name groups.
