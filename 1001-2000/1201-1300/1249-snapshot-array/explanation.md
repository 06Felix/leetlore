# Explanation

Problem: [Snapshot Array](https://leetcode.com/problems/snapshot-array/)

## Idea

Store only value changes for each index. Each index keeps a sorted list of pairs `[snap_id, value]`, starting with `[0, 0]`.

## Why It Works

`set` updates the latest pair when it belongs to the current snapshot id; otherwise it appends a new change. This keeps each index's history ordered by snapshot id and avoids duplicate entries for repeated sets before the next `snap`.

`snap` returns the current id and then increments it. For `get`, binary search finds either the exact snapshot entry or the insertion point; when there is no exact entry, the previous pair is the most recent value written before that snapshot. That is exactly the array value at `snap_id`.

## Edge Cases

- Indices never set before a snapshot return `0` because every history starts with `[0, 0]`.
- Multiple `set` calls on the same index before `snap` collapse into one stored value.

## Complexity

- `set`: `O(1)`.
- `snap`: `O(1)`.
- `get`: `O(log m)` for `m` changes at that index.
- Space: `O(length + s)`, where `s` is the number of stored value changes.
