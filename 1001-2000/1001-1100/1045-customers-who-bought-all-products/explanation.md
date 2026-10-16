# Customers Who Bought All Products

## Idea

- Count distinct product keys in Product in a CTE. Group Customer purchases by customer ID and retain those whose distinct purchased-product count equals that total.

## Why It Works

- The foreign key ensures every non-NULL purchased key belongs to Product. Matching the number of distinct available products therefore means every available product was purchased; duplicate purchase rows cannot increase the count.

## Edge Cases

- Repeated purchases of one product do not substitute for another. COUNT(DISTINCT product_key) ignores any NULL purchase keys.

## Complexity

- Plan-dependent: roughly O(P + C) expected aggregation work with hash distinct sets, using up to O(P + C) distinct storage; sort-based distinct aggregation may add logarithmic factors.

## Notes

- The foreign-key guarantee is essential to the count-equality argument. The original query passed a SQLite fixture with duplicate purchases; MySQL was not executed.
