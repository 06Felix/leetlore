## Idea

- Recurse until finding null or either target. Combine child results: return the current root when both children report a target, otherwise propagate the sole nonnull result.

## Why It Works

- If targets occur in opposite child subtrees, their lowest shared ancestor is the current root. If both are on one side, the lowest result propagates upward. Stopping at a target handles the case where it is the other target’s ancestor.

## Edge Cases

- Both target nodes are guaranteed present and distinct. Comparisons use node identity.

## Complexity

- O(n) worst-case time and O(h) recursion space.

## Notes

- A skewed tree with up to 100000 nodes can overflow the Java stack; the stored solution is unchanged.
