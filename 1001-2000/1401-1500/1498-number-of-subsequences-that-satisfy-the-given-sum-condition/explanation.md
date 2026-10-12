## Idea

- Sort, precompute powers of two modulo 10⁹+7, and use left/right pointers. If the endpoint sum fits, add 2^(right−left) and advance left; otherwise decrease right.

## Why It Works

- Fixing the leftmost selected sorted index leaves each intervening index optional. All those choices satisfy the bound when the largest available value fits. An oversized right endpoint cannot pair with any remaining minimum. These disjoint cases count each selection once.

## Edge Cases

- Duplicates represent distinct index choices. A singleton is counted only when twice its value fits.

## Complexity

- O(n log n) time and O(n) auxiliary space.

## Notes

- Sorting mutates nums; sorting preserves the number of index selections satisfying the value-based condition.
