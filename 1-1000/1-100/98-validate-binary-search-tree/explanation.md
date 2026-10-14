## Idea

- Pass optional lower and upper bound nodes through DFS. Reject values outside their strict bounds; the current node becomes the upper bound for its left subtree and lower bound for its right subtree.

## Why It Works

- Bounds summarize every ancestor ordering constraint. Enforcing both inherited bounds at each node ensures all descendants, not only immediate children, are correctly placed. Applying the same rule recursively validates the entire tree.

## Edge Cases

- Equal values violate strict ordering. Null bounds safely support Integer.MIN_VALUE and Integer.MAX_VALUE without arithmetic sentinels.

## Complexity

- O(n) worst-case time and O(h) recursion space.

## Notes

- A long skewed tree can exceed the Java recursion limit; the implementation is unchanged.
