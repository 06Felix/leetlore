# Explanation

## Idea

- Join `Orders` to `Company`, keeping only orders where the company name is `RED`.
- Right join that filtered order set to all salespeople.
- Return salespeople whose joined RED order is missing.

## Why It Works

- The inner join identifies exactly orders made to company `RED`.
- The right join keeps every salesperson, even if they have no RED order.
- `WHERE Orders.sales_id IS NULL` filters to salespeople with no matching RED order.

## Edge Cases

- Salespeople with no orders are included.
- Salespeople with orders only to non-RED companies are included.
- Salespeople with at least one RED order are excluded.

## Complexity

- Time: database-dependent, logically proportional to joining `Orders`, `Company`, and `SalesPerson`.
- Space: database-dependent for join execution.
