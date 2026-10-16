# Gray Code

## Idea

- Start the result with zero. For each bit position, append the current sequence in reverse order with that bit set.

## Why It Works

- Each half inherits one-bit adjacency. At the join, the same lower-bit value appears with only the new bit changed. Reflection also preserves the one-bit connection from the final value back to zero, and the two halves use disjoint new-bit values.

## Edge Cases

- n = 1 yields [0, 1]. Every iteration doubles the sequence length, ending with exactly 2^n distinct entries.

## Complexity

- O(2^n) time and returned space, with O(1) extra working space.

## Notes

- The inner loop begins at the old final index and moves downward, so newly appended values are not revisited during the same expansion.
