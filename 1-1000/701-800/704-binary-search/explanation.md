# Binary Search

## Idea

- Delegate to Arrays.binarySearch and convert any negative library result to -1.

## Why It Works

- On a sorted array, the library returns the matching index if present; otherwise it returns a negative insertion-point encoding. Normalizing only the absent case gives the requested API result.

## Edge Cases

- Targets smaller or larger than the entire array return -1. Unique input values ensure any found index is the unique answer.

## Complexity

- O(log n) time and O(1) auxiliary space for the primitive-array search.

## Notes

- This implementation uses the built-in search rather than an explicit binary-search loop; the statement does not prohibit it. The input is unchanged.
