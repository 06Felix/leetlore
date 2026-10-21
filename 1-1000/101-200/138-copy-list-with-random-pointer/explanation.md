# Copy List with Random Pointer

## Idea

- Recursively clone nodes reachable by next and random, using a map from original nodes to copies. Insert a new copy into the map before recursing into its outgoing pointers.

## Why It Works

- The map assigns one distinct copy to each original node. Registering it before recursion resolves cycles and shared random targets, so both outgoing pointers are directed to copies while preserving graph structure.

## Edge Cases

- Null pointers return null. Self-referential random pointers and repeated random targets reuse the already registered copy.

## Complexity

- Expected O(n) time, O(n) map space, and O(n) worst-case recursion depth for a fresh copy operation.

## Notes

- The map is an instance field and is not cleared between public calls. Reusing the same Solution on previously copied nodes returns cached copies and can reflect stale values or pointers if the source changed; retained entries also accumulate across separate lists. Source nodes are not modified.
