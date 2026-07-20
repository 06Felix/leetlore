# Explanation

Problem: [Product Sales Analysis I](https://leetcode.com/problems/product-sales-analysis-i/)

## Idea

Join each sale to its product row by `product_id`, then output the product name, sale year, and sale price.

## Why It Works

Every sale references a product through `Sales.product_id`. The inner join with `Product` attaches the corresponding `product_name` to each sale row. Selecting `P.product_name`, `S.year`, and `S.price` produces the exact columns requested for each sale.

## Edge Cases

- Product rows without sales are not returned because the result is per sale.
- Output order is unrestricted, so no ordering is required.

## Complexity

- Time: `O(s + p)` with normal join indexing, otherwise database-dependent.
- Space: `O(1)` auxiliary query state, excluding result rows.
