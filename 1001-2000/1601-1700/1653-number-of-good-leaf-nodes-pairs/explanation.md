# Number of Good Leaf Nodes Pairs

## Idea

- DFS returns an array where index `i` counts leaves at distance `i` below the current node.
- A leaf returns `d[0] = 1`.
- At each internal node, combine left and right distance arrays to count leaf pairs passing through that node.
- Shift child distances by one before returning to the parent.

## Why It Works

- Any good pair whose lowest common ancestor is the current node has one leaf in the left subtree and one in the right subtree.
- Their distance is `i + j + 2`, accounting for both edges up to the current node.
- Counting all such combinations at each node counts every leaf pair exactly once.
- Shifting distances keeps returned arrays relative to the parent.

## Edge Cases

- Null nodes return all zero counts.
- A single leaf contributes no pair by itself.
- Distance is at most `10`, so arrays stay small.

## Complexity

- Time: $O(n \cdot d^2)$ for distance limit `d`.
- Space: $O(h + d)` for recursion stack and per-call arrays.
