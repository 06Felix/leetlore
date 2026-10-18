# How Many Numbers Are Smaller Than the Current Number

## Idea

- Count each value in a 101-entry frequency array, prefix-sum it, then answer a positive value v with the count through v - 1. Return zero directly for value zero.

## Why It Works

- After prefix accumulation, ct[t] counts exactly array entries at most t. Querying v - 1 counts strictly smaller entries and excludes all equal values, including the current element.

## Edge Cases

- Zero has no smaller allowed value. Duplicate values receive identical answers.

## Complexity

- O(n + U) time and O(U) working space for U = 101, plus the O(n) output.

## Notes

- The small value-domain constraint permits direct indexing. The input array is unchanged.
