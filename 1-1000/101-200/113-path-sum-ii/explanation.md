# Path Sum II

## Idea

- The solution runs DFS from the root while carrying the remaining target sum.
- `path` stores the values on the current root-to-node path.
- At each node, it subtracts the node value before recursing into children.
- When a leaf exactly matches the remaining sum, a copy of `path` is added to the answer.

## Why It Works

- Every root-to-leaf path is visited once by DFS.
- The remaining sum represents the original target minus all earlier path values.
- A path is valid only at a leaf, matching the problem's root-to-leaf requirement.
- Backtracking removes the current node after both child searches, restoring `path` for sibling branches.

## Edge Cases

- A null root returns an empty answer.
- Negative node values work because the code does not prune by sum.
- The path is copied before storage so later backtracking does not mutate saved answers.

## Complexity

- Time: $O(n \cdot h)$ in the worst case due to copying valid paths, with traversal over all `n` nodes.
- Space: $O(h)$ recursion/path space, plus the output.
