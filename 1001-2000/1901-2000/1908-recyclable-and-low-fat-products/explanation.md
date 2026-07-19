# Explanation

Problem: [Recyclable and Low Fat Products](https://leetcode.com/problems/recyclable-and-low-fat-products/)

## Idea

Select only `product_id` from rows where both flags are set to `'Y'`.

## Why It Works

The problem asks for products that are simultaneously low fat and recyclable. The `WHERE` clause uses `low_fats = 'Y' AND recyclable = 'Y'`, so a row is returned only when both required conditions are true. Rows with either flag equal to `'N'` are filtered out.

## Edge Cases

- If no products satisfy both conditions, the query returns an empty result.
- The output order is unrestricted, so no `ORDER BY` is needed.

## Complexity

- Time: `O(n)` rows scanned, absent an index-specific execution plan.
- Space: `O(1)` auxiliary query state, excluding the result set.
