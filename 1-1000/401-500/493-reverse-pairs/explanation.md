# Reverse Pairs

## Idea
- Coordinate-compress all original values and their doubles using `long` keys.
- Scan right to left. A Fenwick tree stores the doubled values of already visited elements; query ranks strictly below the current value, then insert its double.

## Why It Works
- Before processing index $i$, the tree contains exactly $2\cdot nums[j]$ for $j>i$.
- Querying the prefix ending one rank below $nums[i]$ counts exactly those later indices satisfying $nums[i]>2\cdot nums[j]$.
- Each pair is counted only when its left index is processed; repeated values contribute separate frequencies.

## Edge Cases
- Strict rank exclusion handles equality correctly, including negative values and zero.
- Doubling in `long` avoids overflow at either `int` extreme. The maximum pair count for 50,000 elements fits in `int`.

## Complexity
- $O(n\log n)$ time for ordered compression and Fenwick operations.
- $O(n)$ auxiliary space; the input array is unchanged.
