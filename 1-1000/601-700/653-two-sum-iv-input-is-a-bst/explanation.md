# Explanation

## Idea

- Traverse the tree with DFS.
- Keep a set of values needed to complete a sum of `k`.
- At each node, if its value is already needed, a valid pair has been found.

## Why It Works

- For any earlier value `x`, the required partner is `k - x`.
- The set stores exactly those required partners from previously visited nodes.
- If the current node value appears in the set, it pairs with one earlier node and sums to `k`.

## Edge Cases

- A null subtree returns `false`.
- Duplicate values are handled correctly when two separate nodes can form the pair.
- The solution does not rely on BST ordering; it works for any binary tree.

## Complexity

- Time: $O(n)$.
- Space: $O(n)$ for the set plus recursion stack.
