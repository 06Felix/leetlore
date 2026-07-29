# Design Circular Deque

## Idea

- Store values in a fixed-size array.
- Track `front`, `rear`, and current `size`.
- Move indices with modulo arithmetic when inserting or deleting at either end.

## Why It Works

- The array has exactly the deque capacity, so `size == k` and `size == 0` identify full and empty states.
- Decrementing `front` before writing inserts at the front position.
- Incrementing `rear` before writing inserts at the rear position.
- Delete operations move the corresponding pointer past the removed element.

## Edge Cases

- Empty `getFront` and `getRear` return `-1`.
- Insertions fail without changing state when the deque is full.
- Modulo adjustment with `+ k` handles wrapping backward from index `0`.

## Complexity

- Time: `O(1)` per operation.
- Space: `O(k)`.
