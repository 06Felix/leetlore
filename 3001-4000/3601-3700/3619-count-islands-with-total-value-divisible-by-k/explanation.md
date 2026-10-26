# 3619. Count Islands With Total Value Divisible by K

## Idea

- Scan every grid cell. An unvisited positive cell starts one new island.
- Use breadth-first search to visit every 4-directionally connected positive cell in that island.
- Add the island's values during the search, then count it if that sum is divisible by `k`.

## Why It Works

- BFS reaches exactly the positive cells connected to its starting cell, which is precisely one island.
- Marking cells as visited when they enter the queue prevents a cell from being counted twice or starting another island later.
- Every positive cell belongs to one connected component, so scanning all cells finds every island exactly once.

## Edge Cases

- Zero-valued cells are water and are never added to an island.
- A single-cell island is counted when its own value is divisible by `k`.
- The total can reach `10^11`, so the accumulator is a `long`.

## Complexity

- Time: `O(m * n)`
- Space: `O(m * n)` for the visited array and BFS queue

## Tags

- Matrix
- Breadth-First Search
- Graph
- Simulation
