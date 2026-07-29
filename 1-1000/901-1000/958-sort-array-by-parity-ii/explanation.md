# Sort Array By Parity II

## Idea

- Create a result array of the same length.
- Keep the next even index and next odd index separately.
- Place every even number at the next even index and every odd number at the next odd index.

## Why It Works

- The input guarantees exactly half the numbers are even and half are odd.
- Even indices are exactly enough for all even values, and odd indices are exactly enough for all odd values.
- Advancing each pointer by `2` preserves the required index parity.

## Edge Cases

- Already valid arrays are copied into valid positions.
- The smallest valid array length, `2`, works with indices `0` and `1`.
- Any valid arrangement is accepted, so original relative order does not matter.

## Complexity

- Time: `O(n)`.
- Space: `O(n)` for the returned array.
