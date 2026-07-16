# Peeking Iterator

## Idea

- The wrapper keeps one cached value, `val`, representing the next element.
- The constructor preloads `val` from the underlying iterator if one exists.
- `peek` returns the cached value without advancing.
- `next` returns the cached value, then refreshes it from the underlying iterator.

## Why It Works

- Keeping one element buffered makes the next value visible without consuming it.
- `peek` does not touch the underlying iterator, so repeated peeks return the same value.
- `next` advances exactly once by replacing the cache with the following underlying value.
- `hasNext` is true exactly when the cache is non-null.

## Edge Cases

- Calls to `peek` and `next` are guaranteed valid by the problem.
- When the underlying iterator is exhausted, `val` becomes `null`.
- The implementation is specialized to `Integer`, matching the LeetCode signature.

## Complexity

- Time: $O(1)$ per operation.
- Space: $O(1)$.
