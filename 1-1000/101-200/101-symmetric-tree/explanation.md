## Idea

- Compare two views of the root recursively, pairing each left child with the other right child and vice versa.

## Why It Works

- A mirror pair has equal root values and cross-matching child subtrees. Applying this predicate to the root against itself checks every reflected node pair and structural position.

## Edge Cases

- Matching null positions succeed; missing a counterpart fails.

## Complexity

- O(n) time and O(h) recursion space.

## Notes

- This is the recursive approach; the optional iterative variant is not implemented.
