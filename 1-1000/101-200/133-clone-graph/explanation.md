## Idea

- Recursively create a new node for each original node and store original-to-clone mappings before cloning its neighbors. Reuse a mapped clone on repeat visits.

## Why It Works

- Recording the clone before following edges breaks cycles and ensures every original node has exactly one counterpart. Appending clones of each neighbor preserves adjacency while keeping returned nodes separate from the originals.

## Edge Cases

- Null input returns null. A single isolated node gets a new empty neighbor list.

## Complexity

- Expected O(V+E) time and O(V) map/recursion space, plus O(V+E) cloned graph space.

## Notes

- The mapping is an instance field retained across calls. Reusing the same Solution on previously seen nodes returns earlier clones rather than making a fresh independent copy, especially problematic if the original graph changed.
