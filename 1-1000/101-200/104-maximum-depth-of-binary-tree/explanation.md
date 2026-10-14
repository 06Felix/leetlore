## Idea

- Return zero for an empty subtree; otherwise return one plus the larger depth of its two children.

## Why It Works

- Every root-to-leaf path chooses one child. Taking the maximum child depth and counting the current node yields exactly the longest such path.

## Edge Cases

- Empty trees have depth zero; a leaf has depth one.

## Complexity

- O(n) time and O(h) recursion space for height h.

## Notes

- A skewed 10000-node tree can exceed Java recursion stack capacity; the implementation is unchanged.
