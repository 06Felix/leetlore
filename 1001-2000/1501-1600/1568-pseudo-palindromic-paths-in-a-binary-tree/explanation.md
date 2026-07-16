# Pseudo-Palindromic Paths in a Binary Tree

## Idea

- The DFS tracks the parity of digit counts along the current root-to-node path.
- Bit `v` in `path` is toggled whenever a node with value `v` is visited.
- At a leaf, the path can be rearranged into a palindrome if at most one digit has odd count.
- The bit trick `(path & (path - 1)) == 0` checks whether zero or one bits are set.

## Why It Works

- A multiset can form a palindrome exactly when at most one value appears an odd number of times.
- Toggling a bit records only parity, which is the only information needed.
- Each root-to-leaf path is evaluated once at its leaf.
- The answer increments only for leaves whose parity mask satisfies the palindrome condition.

## Edge Cases

- A single-node tree has exactly one pseudo-palindromic path.
- Null children return immediately.
- Values are limited to `1..9`, so an integer mask is enough.

## Complexity

- Time: $O(n)$ for `n` tree nodes.
- Space: $O(h)$ recursion stack, where `h` is the tree height.
