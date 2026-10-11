# Count Good Triplets in an Array

## Idea
- Map values to their positions in `nums1`, then replace the traversal of `nums2` with those positions.
- Use two Fenwick-tree passes to count earlier smaller positions and later larger positions for each potential middle element.
- Add the product of these counts using `long`.

## Why It Works
- A good triplet becomes an increasing length-three subsequence of the transformed permutation.
- Each earlier smaller choice can combine with each later larger choice, and every triplet has exactly one middle index.
- Updates use position plus one. Querying the unshifted position counts strictly smaller values; the reverse-pass total minus that query counts larger values because permutations have no equal values.

## Edge Cases
- Identical permutations give all index triples; reversed permutations give none.
- Uniqueness is essential to the reverse-pass subtraction. Fenwick updates never use index zero, avoiding a zero-lowbit loop.

## Complexity
- Expected time: $O(n\log n)$ for two Fenwick passes and hash-map lookup.
- Space: $O(n)$ for the map, transformed positions, counts, and Fenwick arrays.
