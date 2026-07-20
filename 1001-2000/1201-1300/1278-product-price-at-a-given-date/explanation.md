# Explanation

Problem: [Product Price at a Given Date](https://leetcode.com/problems/product-price-at-a-given-date/)

## Idea

Use a CTE to rank each product's price changes on or before `2019-08-16` by latest date. Return the latest such price, and union products that had no qualifying change with the default price `10`.

## Why It Works

For products changed on or before the target date, the active price is the most recent change not after that date. The CTE filters to those changes and ranks them descending by `change_date`; `day_rank = 1` selects the active price. Products absent from the CTE had no change by the target date, so their price is still the initial `10`. The union combines both categories.

## Edge Cases

- Products with only future changes return `10`.
- Products with a change exactly on `2019-08-16` use that new price.

## Complexity

- Time: `O(n log n)` for window ranking in the general case.
- Space: `O(n)` for the CTE/window state.
