## Idea

- Advance a fast pointer n nodes ahead of a slow pointer. If fast is null, remove the head; otherwise move both until fast reaches the last node and unlink slow’s next node.

## Why It Works

- The fixed n-node gap makes slow stop immediately before the nth node from the end when fast reaches the tail. Relinking slow.next skips exactly that node. A null fast after the initial advance identifies the head-removal case.

## Edge Cases

- A one-node list becomes empty. Removing the tail relinks its predecessor to null.

## Complexity

- O(n) time and O(1) space, where n here denotes list length.

## Notes

- The list is modified by relinking existing nodes.
