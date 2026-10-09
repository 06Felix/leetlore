## Idea
- Put every matrix value and its row index into a max heap.
- Poll descending values, skipping rows whose quota is exhausted. Accept other values, decrement their row limit and k, and accumulate a long sum until k selections are made.

## Why It Works
- An optimal selection can replace a smaller selected value by a larger eligible value without violating row quotas: if that row is full, exchange within the same row; otherwise exchange any smaller selected value.
- Repeating these exchanges justifies descending greedy selection. Nonnegative values mean taking exactly k is optimal among selections of at most k.

## Edge Cases
- k = 0 returns zero, though the heap is still built.
- Zero row limits cause skips. The guarantee k <= sum(limits) ensures enough eligible entries remain; long handles large sums.

## Complexity
- O(nm log(nm + 1)) time for heap construction by individual insertions and potentially polling every cell.
- O(nm) auxiliary space for heap entries.

## Notes
- Accepted selections decrement the supplied limits array in place; grid is unchanged.
