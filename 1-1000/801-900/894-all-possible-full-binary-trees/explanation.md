# Explanation

## Idea
- Return no trees for even node counts and one zero-valued leaf for a count of one.
- For each possible left size, combine every left-tree shape with every right-tree shape of size `n - 1 - leftSize` beneath a new root.
- Memoize the resulting lists for larger odd sizes.

## Why It Works
- A full binary tree has an odd node count: each internal node adds exactly two children.
- Every non-leaf tree splits uniquely into a root and two full subtrees. Enumerating all size splits and subtree combinations therefore covers every ordered shape.

## Edge Cases
- `n == 1` returns a leaf; even `n` returns an empty list.
- Zero-sized subtree requests return an empty list, preventing a root with only one child.

## Complexity
- Let `T` be the number of returned shapes, the Catalan number $C_{(n-1)/2}$ for odd `n`.
- Time: $O(n^2 + nT)$ as a conservative upper bound for split enumeration and combinations; the number of shapes grows exponentially.
- Space: $O(nT)$ as an upper bound for generated nodes and memoized lists, plus $O(n)$ recursion depth.

## Notes
- Subtrees are attached directly from cached lists, so node objects can be shared across returned roots and even between branches of a returned shape. Serialization represents the requested shapes, but later mutation can affect multiple positions or trees; independent copies are not produced.
