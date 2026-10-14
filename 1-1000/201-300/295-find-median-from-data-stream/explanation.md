## Idea

- Maintain a max-heap for the lower half and a min-heap for the upper half. Insert relative to the lower maximum and rebalance so the lower heap has equal size or one extra element.

## Why It Works

- All lower-half values stay no greater than all upper-half values, and moving a boundary value preserves that order. Balanced sizes place the middle value at the lower maximum or the two middle values at both heap tops.

## Edge Cases

- The statement guarantees nonempty median queries. Negative values and duplicates work naturally; the supplied numeric bound keeps comparator subtraction and the median numerator within int.

## Complexity

- O(log n) insertion, O(1) median lookup, and O(n) storage after n additions.
