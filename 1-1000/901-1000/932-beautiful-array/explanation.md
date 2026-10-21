# Beautiful Array

## Idea

- Initialize a permutation of 1 through n. Recursively partition each segment by successive bit masks, placing set-bit values first and then recursing on both parts with the next higher bit.

## Why It Works

- At the first split, odd and even values are separated; endpoints from different groups have odd sum and cannot have an integer midpoint. Within a group, removing its shared low bit and dividing by two preserves the forbidden-progression condition. Repeating this argument for higher masks rules out every forbidden triple.

## Edge Cases

- n = 1 needs no partition. Unequal partition sizes and empty parts are harmless; distinct values eventually separate by some bit.

## Complexity

- O(n log n) time and O(log n) recursion space, plus the O(n) returned array. Each bit level scans at most n elements.

## Notes

- Partitions swap values inside the newly allocated result, not an input array. Actual Java verified permutation and no-midpoint invariants for every n from one through 100 and for n = 1000.
