# Explanation

## Idea

- Allocate a boolean array of size `1_000_001`.
- Use the key itself as the array index.
- `true` means present; `false` means absent.

## Why It Works

- The key range is bounded by `0 <= key <= 10^6`.
- Direct indexing gives a unique slot for every possible key.
- Add, remove, and contains become simple writes or reads of that slot.

## Edge Cases

- Removing a missing key just writes `false`.
- Adding the same key repeatedly leaves it `true`.
- Key `0` and key `10^6` are valid indices in the allocated array.

## Complexity

- Time: $O(1)$ per operation.
- Space: $O(10^6)$.
