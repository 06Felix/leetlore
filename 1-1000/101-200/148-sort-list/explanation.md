## Idea

- Split the list around its midpoint with slow/fast pointers, sort both halves recursively, and merge by relinking the smaller head at each step.

## Why It Works

- Splitting covers all nodes without overlap. By induction, each recursive half is sorted; choosing the smaller available head gives the next smallest node, so merging preserves all values in sorted order.

## Edge Cases

- Empty or singleton lists return unchanged. Equal values may be taken from the right half first, which still meets the sorting requirement.

## Complexity

- O(n log n) time and O(log n) auxiliary recursion space.

## Notes

- Existing nodes are relinked. The recursive implementation does not meet the optional O(1)-memory follow-up.
