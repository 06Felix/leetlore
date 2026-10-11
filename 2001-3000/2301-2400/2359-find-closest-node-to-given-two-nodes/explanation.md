# Find Closest Node to Given Two Nodes

## Idea
- Follow the single outgoing-edge chain from each source, recording first-visit distances and stopping at a missing edge or repeated node.
- Scan common reachable nodes in index order and minimize the larger of their two distances.

## Why It Works
- With at most one outgoing edge per node, following successors is the only possible route; the first arrival is the shortest distance.
- Stopping at a repeated node terminates cycles without losing any reachable node.
- Strictly improving the answer during an ascending-index scan preserves the smallest index when distances tie.

## Edge Cases
- Identical sources return that source with distance zero; no common reachable node returns `-1`.
- The initial bound 100,000 exceeds every first-visit distance under the maximum node count, so a valid candidate can always replace it.

## Complexity
- Time: $O(n)$ for the two traversals and final scan.
- Space: $O(n)$ for two distance arrays.
