# Explanation

Problem: [Reshape Data: Melt](https://leetcode.com/problems/reshape-data-melt/)

## Idea

- Use `pd.melt` to convert the wide report into long format.
- Keep `product` as the identifier column.
- Store former quarter column names in `quarter`.
- Store the corresponding numeric values in `sales`.

## Why It Works

- `id_vars=['product']` keeps each product attached to every generated row.
- Every non-id quarter column is unpivoted into the `quarter` column.
- The value from that product/quarter cell is placed in `sales`.
- Thus every original product-quarter cell becomes exactly one output row.

## Edge Cases

- Multiple products produce one output row per product per quarter.

## Complexity

- Time: $O(nq)$ for `n` products and `q` quarter columns.
- Space: $O(nq)$ for the returned long table.

## Notes

- This is a Pandas solution, not Java; the explanation matches `solution.py`.
