# Explanation

Problem: [Customers Who Never Order](https://leetcode.com/problems/customers-who-never-order/)

## Idea

- Start from `Customers` and `LEFT JOIN` matching `Orders` by customer id.
- Customers without orders have no matching row on the right side of the join.
- Keep only rows where `Orders.id IS NULL` and output the customer name as `Customers`.

## Why It Works

- A left join preserves every customer, even when no order exists.
- For customers with at least one order, the joined `Orders.id` is non-null.
- Therefore filtering for `Orders.id IS NULL` leaves exactly customers who never placed an order.

## Edge Cases

- Customers table entries with multiple orders are excluded because at least one joined order row exists.
- Customers with no matching `Orders.customerId` remain after the left join and are returned.

## Complexity

- Time: depends on the database execution plan; with an index on `Orders.customerId`, this is typically near linear in table sizes.
- Space: depends on the join strategy chosen by the database.

## Notes

- `Orders.id IS NULL` is safe here because `Orders.id` is the primary key and cannot be null on real order rows.
