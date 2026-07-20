# Group Sold Products By The Date

## Idea

- Group sales rows by `sell_date`.
- Count unique products with `COUNT(DISTINCT product)`.
- Build the comma-separated product list with `GROUP_CONCAT(DISTINCT product ORDER BY product ASC SEPARATOR ',')`.

## Why It Works

- Grouping by date creates one output row per sale date.
- `DISTINCT` removes duplicate sales of the same product on the same date.
- The `ORDER BY product ASC` inside `GROUP_CONCAT` gives the required lexicographic product order.

## Edge Cases

- Duplicate product rows on the same date are counted and listed once.
- Dates with one product return that product without extra separators.
- Multiple dates are aggregated independently.

## Complexity

- Time: database-dependent, typically $O(n \log n)$ from grouping and per-group product ordering.
- Space: $O(n)$ for grouped aggregate state.

## Notes

- The submitted query does not include an outer `ORDER BY sell_date`, even though the problem asks for output ordered by date. Some MySQL plans may emit grouped dates in order, but that is not guaranteed by SQL.
