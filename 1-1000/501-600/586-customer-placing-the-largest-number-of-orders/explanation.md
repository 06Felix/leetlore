# Customer Placing the Largest Number of Orders

## Idea

- Group Orders by customer_number, sort groups by COUNT(*) descending, and return the first customer with LIMIT 1.

## Why It Works

- Each group contains exactly one customer’s orders, so its row count is that customer’s order total. The descending first group is the required unique maximum.

## Edge Cases

- The statement guarantees one strictly largest customer. The optional tied-winners follow-up is not handled by LIMIT 1.

## Complexity

- Plan-dependent: an aggregation scan plus sorting costs roughly O(O + C log C) expected time and O(C) grouping workspace for O orders and C customers.

## Notes

- GROUP BY 1 refers to the first selected expression. The original query passed a SQLite fixture; MySQL was not executed.
