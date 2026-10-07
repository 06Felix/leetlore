# Explanation

## Idea
- Compute the number of tree levels `m` and allocate `m` rows with $2^m - 1$ empty-string cells each.
- Recursively place each node at the midpoint of its allotted column interval, then give the left and right halves to its children.

## Why It Works
- The full-width matrix reserves the positions of a complete tree with the same height.
- Splitting intervals around their midpoint gives each child the required symmetric offset on the next row; absent nodes leave empty cells.

## Edge Cases
- A single-node tree uses a one-by-one matrix.
- Missing children keep their reserved cells empty; each row is copied separately so updating one row cannot affect another.

## Complexity
- Time: $O(m2^m + n)$ to initialize the matrix and visit `n` nodes.
- Space: $O(m2^m)$ for the returned matrix and $O(m)$ additional recursion space.

## Notes
- The helper's height counts levels; the statement's height counts edges, so `m` equals statement height plus one.
