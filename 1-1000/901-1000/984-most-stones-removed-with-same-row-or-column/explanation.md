# Explanation

## Idea

Build a graph where each stone is a node. Two stones are connected if they share a row or a column.

Each connected component can leave one stone behind and remove all the others.

## Why It Works

Inside one connected component, there is always a sequence of removals that preserves at least one row-or-column neighbor until only one stone remains.

Different components cannot help each other because no stone shares a row or column across components. Therefore, the maximum removals are `stones.length - numberOfComponents`.

The DFS counts those components.

## Edge Cases

- A single isolated stone forms one component and contributes zero removals.
- Multiple stones in the same row or column become connected directly.
- Stones connected through chains of shared rows/columns are handled by DFS.

## Complexity

Time: `O(n^2)`.

Space: `O(n^2)` for the adjacency lists in the worst case.
