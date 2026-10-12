## Idea

- Check that a positive integer has exactly one set bit with n & (n - 1).

## Why It Works

- Subtracting one clears the only set bit of a power of two; every other positive integer retains at least one bit.

## Edge Cases

- Zero and Integer.MIN_VALUE are rejected first.

## Complexity

- O(1) time and space.
