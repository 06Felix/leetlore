# Explanation

## Idea

- Allocate an integer array of size `1_000_001`.
- Fill it with `-1` to mark missing keys.
- Use each key directly as its array index.

## Why It Works

- The key range is bounded by `0 <= key <= 10^6`, so direct indexing covers every possible key.
- `put` stores the value at `map[key]`.
- `get` returns `-1` when the sentinel is present, otherwise the stored value.
- `remove` restores the sentinel.

## Edge Cases

- Updating an existing key overwrites its value.
- Removing a missing key leaves `-1`.
- The value range is non-negative, so `-1` is a safe missing sentinel.

## Complexity

- Time: $O(1)$ per operation.
- Space: $O(10^6)$.
