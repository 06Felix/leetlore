# Make Array Elements Equal to Zero

## Idea

- Maintain sums strictly to the left and right of each index. At a zero, equal sums contribute two starting directions, and sums differing by one contribute one.

## Why It Works

- Each positive encounter removes one unit and reverses direction, so removals alternate between the two sides. Equal supplies can be exhausted starting either way; a one-unit excess must be consumed first. A larger imbalance leaves units behind.

## Edge Cases

- Every zero is a separate starting position. An all-zero array contributes twice its length.

## Complexity

- O(n) time and O(1) auxiliary space.

## Notes

- The sums describe the simulation without modifying nums.
