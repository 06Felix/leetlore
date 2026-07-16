# Count Pairs of Connectable Servers in a Weighted Tree Network

## Idea

- The solution builds an undirected weighted adjacency list.
- For each possible center server `u`, it processes each neighboring branch separately.
- A DFS counts how many servers in that branch have distance from `u` divisible by `signalSpeed`.
- Counts from different branches are multiplied and accumulated to form connectable pairs through `u`.

## Why It Works

- Paths from `u` to servers in different neighbor branches share no edges except the center.
- A pair is connectable through `u` exactly when both endpoint distances from `u` are divisible by `signalSpeed`.
- As each branch count is computed, multiplying it by the total valid count from previous branches counts all cross-branch pairs once.
- DFS over a branch computes the valid endpoints by carrying cumulative distance.

## Edge Cases

- Leaf centers have fewer than two branches, so their pair count remains `0`.
- `signalSpeed = 1` makes every server in a branch distance-valid.
- Edge weights are accumulated as path distance during DFS.

## Complexity

- Time: $O(n^2)$ in the worst case because DFS work is repeated for each center.
- Space: $O(n)$ for the graph traversal stack, plus the adjacency list.
