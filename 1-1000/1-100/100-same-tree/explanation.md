## Idea

- Compare corresponding nodes recursively, requiring equal values and matching left and right subtrees.

## Why It Works

- Equal trees must have the same null positions and node values. These conditions hold exactly when the roots match and both corresponding subtree pairs match.

## Edge Cases

- Two null nodes match; only one null node fails. Equal values alone do not imply equal structure.

## Complexity

- O(n) worst-case comparisons and O(h) recursion space for traversed height h.
