## Idea

- Recursively invert the original left and right subtrees, then assign them to the opposite child pointers.

## Why It Works

- Mirroring a tree swaps its two child subtrees and mirrors each subtree internally. The recursive assignments perform exactly these two operations at every node.

## Edge Cases

- An empty tree returns null; a leaf stays a leaf.

## Complexity

- O(n) time and O(h) recursion space.

## Notes

- Existing tree nodes are modified in place.
