## Idea

- Flatten both subtrees recursively, move the flattened left chain to root.right, clear root.left, and append the flattened right chain after the left chain’s tail.

## Why It Works

- Preorder is root followed by its left subtree then its right subtree. Once both subtrees are flattened in that order, relinking their chains after the root preserves exactly preorder and clears every left pointer.

## Edge Cases

- Empty trees require no work; absent left subtrees attach the right chain directly.

## Complexity

- O(n²) worst-case time from repeated tail scans and O(h) recursion space.

## Notes

- The tree is modified in place, but recursive stack use does not meet the optional O(1)-extra-space follow-up. Skewed trees may also strain the Java stack.
