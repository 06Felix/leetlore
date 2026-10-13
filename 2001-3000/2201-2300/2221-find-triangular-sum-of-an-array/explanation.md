## Idea

- Repeatedly form adjacent sums modulo ten in a reusable temporary array, shrinking the active length until one value remains.

## Why It Works

- The first pass reads the original array. Later passes overwrite the temporary array from left to right: each sum reads its current and next entry before that next entry is overwritten. This exactly reproduces every reduction row.

## Edge Cases

- A one-element input returns immediately. Only the active prefix is used; stale entries past it are ignored.

## Complexity

- O(n²) time and O(n) auxiliary space.

## Notes

- The original input array is not modified; the local nums reference is redirected to temp after the first pass.
