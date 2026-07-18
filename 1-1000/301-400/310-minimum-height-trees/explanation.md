# Explanation

## Idea

- Build an undirected adjacency set for the tree.
- Start with all leaves.
- Repeatedly remove the current leaves until at most two nodes remain.

## Why It Works

- Minimum-height tree roots are the center node or center edge of the tree.
- Removing all leaves trims one outer layer without changing the center.
- When only one or two nodes remain, they are exactly the possible MHT roots.

## Edge Cases

- `n = 1` returns `[0]`.
- A path with even length leaves two centers.
- A star-shaped tree trims to the hub.

## Complexity

- Time: $O(n)$ average with adjacency sets.
- Space: $O(n)$.
