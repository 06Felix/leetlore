# Number of Ways to Arrive at Destination

## Idea
- Run Dijkstra's algorithm on the undirected adjacency lists, tracking both shortest distance and the number of shortest paths to each vertex.
- On a shorter route, replace the distance and copy the predecessor's count. On an equally short route, add its count modulo $10^9 + 7$.

## Why It Works
- Positive road times ensure each shortest-path predecessor has a strictly smaller distance and contributes before the destination vertex is processed.
- A shorter route supersedes previous routes; equal-distance predecessors describe distinct final-edge choices and their counts add.
- Stale priority-queue entries are skipped, preventing obsolete distances from propagating.

## Edge Cases
- `n = 1` returns one path, the empty route from the source to itself.
- Distances use `long` because sums of road times can exceed `int`; equal shortest routes are counted even when their distances are large.

## Complexity
- Time: $O(n + m\log(m + 1))$, for $m$ roads; the heap can hold $O(m)$ entries.
- Space: $O(n + m)$ for adjacency lists, distance/count arrays, and heap.
