## Idea

- Subtract each visited node from the required sum and recursively test its children. At a leaf, compare its value with the remaining target.

## Why It Works

- The target passed to each node is the original target minus all ancestor values. Thus a leaf match is equivalent to the complete root-to-leaf sum matching the original target. The OR explores every candidate path until one succeeds.

## Edge Cases

- An empty tree returns false even for target zero. Negative values prevent pruning merely because a partial sum exceeds the target.

## Complexity

- O(n) worst-case time and O(h) recursion space.

## Notes

- A long skewed tree can overflow the Java call stack; the solution is unchanged.
