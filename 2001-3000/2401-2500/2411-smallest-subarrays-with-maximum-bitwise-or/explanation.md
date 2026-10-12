## Idea

- Scan from right while maintaining the nearest position needed for every bit.

## Why It Works

- The OR of a suffix reaches the total suffix OR once it includes the latest occurrence of each required bit; the farthest such position determines the minimum length.

## Edge Cases

- Single-element arrays and zero values are handled directly.

## Complexity

- O(n·B) time and O(B) auxiliary space.
