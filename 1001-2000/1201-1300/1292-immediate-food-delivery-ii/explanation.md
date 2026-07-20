# Explanation

Problem: [Immediate Food Delivery II](https://leetcode.com/problems/immediate-food-delivery-ii/)

## Idea

Filter `Delivery` to each customer's first order, then compute the percentage of those first orders whose preferred delivery date equals the order date.

## Why It Works

The subquery returns `(customer_id, MIN(order_date))`, which identifies the guaranteed unique first order for every customer. The outer query keeps only those first-order rows. The `CASE` expression counts immediate orders among them, and dividing by the number of distinct customers gives the first-order immediate rate. Multiplying by `100` and rounding to two decimals matches the requested percentage.

## Edge Cases

- Scheduled first orders contribute `0` to the numerator.
- The problem guarantees one first order per customer, so the tuple filter does not duplicate a customer.

## Complexity

- Time: `O(n)` grouping/filtering with indexing, otherwise database-dependent.
- Space: `O(c)` for first-order rows by customer.
