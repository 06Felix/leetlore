# Remove Duplicates from Sorted List

## Idea

- Walk the sorted list. When the next node has the same value, bypass it without advancing; otherwise move to the next node. Return the original head.

## Why It Works

- Sorted order makes all equal values contiguous. Repeated bypasses remove every extra node in a run while keeping its first node; advancing only after values differ preserves one representative per distinct value.

## Edge Cases

- An empty list returns null. Runs of any duplicate length are handled by staying on the retained node.

## Complexity

- O(n) time and O(1) auxiliary space.

## Notes

- The existing list’s next pointers are modified; no replacement list nodes are allocated.
