## Idea
- Scan left to right, skipping zeros. If the current nonzero value equals the next value, double it and set the next value to zero.
- Append each surviving current value to a separate zero-initialized result array, leaving its unused suffix zero.

## Why It Works
- Modifying the next cell before advancing implements the required sequential operations.
- Skipping zero operations is harmless because doubling zero and clearing a neighboring zero changes nothing. Writing survivors in scan order performs stable zero compaction.

## Edge Cases
- Consecutive equal values are merged according to sequential behavior rather than all at once.
- All zeros remain zero; a trailing nonzero is appended without a neighbor check.

## Complexity
- O(n) time for one scan.
- O(n) result space and O(1) other auxiliary space.

## Notes
- The supplied nums is modified during merging, while the compacted array returned is a new array.
