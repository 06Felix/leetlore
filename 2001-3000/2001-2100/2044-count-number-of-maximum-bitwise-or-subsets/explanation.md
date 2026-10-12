## Idea

- Compute the OR of all values, then count subsets whose OR reaches it with DFS.

## Why It Works

- Adding a value can only set bits; the recursion explores include/exclude choices and counts exactly those reaching the target.

## Edge Cases

- The empty subset is excluded unless constraints make the target zero.

## Complexity

- O(2^n) time and O(n) recursion space.
