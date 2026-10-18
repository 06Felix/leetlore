# Range Frequency Queries

## Idea

- During construction, append each array index to the list for its value. Query by binary-searching the first stored index >= left and the first > right, then subtract the positions.

## Why It Works

- Indices are appended in increasing order, so binary search finds exactly the contiguous portion lying inside the inclusive query range. Its list length difference equals the occurrence count.

## Edge Cases

- A value absent from the map returns zero. Equal query endpoints correctly count either one occurrence or none.

## Complexity

- Expected O(n) construction time, O(log(f + 1)) per query for value frequency f, and O(n) storage.

## Notes

- The input array is not retained or modified; the index lists describe its values at construction time.
