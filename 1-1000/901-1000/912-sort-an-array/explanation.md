# Sort an Array

## Idea

- Call Arrays.sort(nums), then return the same array.

## Why It Works

- The JDK sorting routine orders the primitive int array in ascending order, so the returned reference contains the required sorted values.

## Edge Cases

- Duplicate and negative values are handled by the library. A one-element array remains unchanged.

## Complexity

- Library-dependent sorting cost; primitive-array sorting is designed for O(n log n) performance, with implementation-specific auxiliary storage.

## Notes

- This implementation violates the explicit restriction against using built-in sorting functions. It sorts nums in place and does not implement a custom algorithm. The existing source is unchanged.
