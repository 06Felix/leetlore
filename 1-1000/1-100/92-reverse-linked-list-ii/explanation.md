## Idea

- Use a dummy node and locate the node before left. Keep the original left node as the sublist tail; repeatedly detach its next node and move that node to the sublist front.

## Why It Works

- Each move prepends the next original node to the growing reversed segment while preserving the tail’s connection to the untouched suffix. After right−left moves, exactly the requested segment is reversed and the surrounding list stays connected.

## Edge Cases

- left=right returns immediately. The dummy node handles reversal beginning at the head.

## Complexity

- O(n) time and O(1) auxiliary space.

## Notes

- Existing nodes are relinked; values are not changed.
