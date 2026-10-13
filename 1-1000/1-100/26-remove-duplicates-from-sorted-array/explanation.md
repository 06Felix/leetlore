## Idea

- Keep the first value, then append a value only when it differs from the last retained value. Return the last write index plus one.

## Why It Works

- Sorted order groups duplicates together. Comparing against the last retained value removes exactly the repeated values while preserving each distinct value’s first position in the output sequence.

## Edge Cases

- A single value returns one. The statement guarantees a nonempty sorted array.

## Complexity

- O(n) time and O(1) auxiliary space.
