# Explanation

## Idea

- Every operation increments a rectangle from `(0, 0)` to `(ai - 1, bi - 1)`.
- The cells with the maximum value are exactly the cells covered by every operation.
- Track the minimum `ai` and minimum `bi`; return their product.

## Why It Works

- A cell gets the maximum count only if every operation includes it.
- The intersection of all operation rectangles has height `min(ai)` and width `min(bi)`.
- If there are no operations, the whole matrix remains tied at maximum value `0`.

## Edge Cases

- Empty `ops` leaves `xm = m` and `ym = n`, returning all cells.
- Single operation returns that operation's rectangle area.
- Large dimensions are handled without building the matrix.

## Complexity

- Time: $O(k)$ for `k` operations.
- Space: $O(1)$.
