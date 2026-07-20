# Explanation

Problem: [Average Selling Price](https://leetcode.com/problems/average-selling-price/)

## Idea

Left join each price period to sales of the same product whose purchase date falls inside that period. Compute total revenue divided by total units per product.

## Why It Works

The date-range join attaches every sale to the price that was active for that product on the purchase date. For each product, `SUM(units * price)` gives total revenue and `SUM(units)` gives total units sold. Their quotient is the weighted average selling price. The left join keeps products that have price rows but no sales, and `IFNULL(..., 0)` returns `0` for those products.

## Edge Cases

- Products with no sold units return `0`.
- Non-overlapping price periods guarantee each sale matches at most one price row.

## Complexity

- Time: `O(p * u)` without date-range indexing, otherwise database-dependent.
- Space: `O(g)` for product groups.
