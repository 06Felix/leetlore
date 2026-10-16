# Product Sales Analysis III

## Idea

- Group Sales by product to find each minimum year. Return original sales rows whose (product_id, year) pair belongs to that grouped result.

## Why It Works

- The paired membership condition matches both the product and its own earliest year. Filtering the original rows, rather than grouping them again, retains every sale entry from that first year with its quantity and price.

## Edge Cases

- Multiple sales in a product’s first year all survive. Later-year rows are excluded even if their quantities or prices match earlier sales.

## Complexity

- Plan-dependent: roughly O(S) expected grouping/membership work with materialization, or O(S log S) sorting/index work, with up to O(S) workspace for S sales.

## Notes

- The query does not aggregate first-year quantities together. It passed a SQLite fixture with multiple earliest-year sales; MySQL was not executed.
