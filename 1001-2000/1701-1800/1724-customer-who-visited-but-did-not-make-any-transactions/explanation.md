# Explanation

Problem: [Customer Who Visited but Did Not Make Any Transactions](https://leetcode.com/problems/customer-who-visited-but-did-not-make-any-transactions/)

## Idea

Keep visits whose `visit_id` does not appear in `Transactions`, then group those visits by customer and count them.

## Why It Works

A visit made no transaction exactly when there is no transaction row with the same `visit_id`. The `NOT IN` subquery filters to those no-transaction visits. Grouping by `customer_id` collects all such visits for each customer, and `COUNT(*)` returns the number of no-transaction visits.

## Edge Cases

- Customers with only transaction visits are filtered out.
- Multiple no-transaction visits by the same customer are counted together.

## Complexity

- Time: `O(v + t)` with an efficient anti-join plan, otherwise database-dependent.
- Space: `O(c)` for grouped customer counts.

## Notes

This query is fine for the LeetCode schema because `Transactions.visit_id` is not nullable. In general SQL, `NOT IN` behaves poorly if the subquery can return `NULL`.
