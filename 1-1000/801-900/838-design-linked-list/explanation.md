# Design Linked List

## Idea

- Implement a doubly linked list with head, tail, and size.
- `get` walks from the head except for direct head/tail cases.
- Head and tail insertion update the corresponding endpoint.
- Middle insertion links the new node between its predecessor and successor.

## Why It Works

- The size guard rejects invalid indices.
- Maintaining `h` and `t` makes endpoint operations straightforward.
- Insertion before index `i` is done by finding the node before that index and reconnecting four pointers.

## Edge Cases

- Getting an invalid index returns `-1`.
- Adding to an empty list sets both head and tail.
- Deleting the only node leaves both endpoint references effectively unreachable through size `0` behavior.

## Complexity

- Time: `O(n)` for indexed operations, `O(1)` for head/tail insertion.
- Space: `O(n)` for stored nodes.

## Notes

- The middle delete path updates `tp.r` but does not reset the successor node's `l` pointer. That can leave a stale backward link and may affect later tail-side operations; the submitted solution is documented as-is.
