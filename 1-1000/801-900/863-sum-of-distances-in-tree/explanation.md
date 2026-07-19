# Explanation

Problem: [Sum of Distances in Tree](https://leetcode.com/problems/sum-of-distances-in-tree/)

## Idea

Root the tree at node `0` and use two DFS passes. The postorder pass computes each subtree size and the sum of distances from each node to nodes in its own subtree. The preorder pass reroots that answer from parent to child to fill the final distance sum for every node.

## Why It Works

During postorder, every child subtree contributes `count[child]` extra distance for the edge from `node` to `child`, plus all distances already accumulated inside that child subtree. Therefore `ans[0]` becomes the sum of distances from root `0` to all nodes.

When moving the root from `node` to `child`, all `count[child]` nodes in the child's subtree become one step closer, while the remaining `n - count[child]` nodes become one step farther. That gives `ans[child] = ans[node] - count[child] + (n - count[child])`. Applying this transition along every edge computes the answer for every possible root.

## Edge Cases

- `n = 1` has no edges; both DFS passes leave the only answer as `0`.
- Parent tracking prevents walking back across the undirected edge.

## Complexity

- Time: `O(n)`, because each edge is visited in each DFS pass.
- Space: `O(n)` for the adjacency sets, recursion stack, counts, and answers.
