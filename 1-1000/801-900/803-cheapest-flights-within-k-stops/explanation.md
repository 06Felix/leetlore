# Cheapest Flights Within K Stops

## Idea

- The implementation builds an adjacency list of outgoing flights.
- It keeps `dist[v]` as the cheapest cost found so far to city `v`.
- A queue stores states as `{stops, city, cost}`.
- From each state, it relaxes outgoing flights while the stop count is within the allowed limit.

## Why It Works

- Each queue state represents a route with a known number of used edges and total cost.
- Relaxing an edge records a cheaper way to reach the next city and queues it for further expansion.
- States with more than `k` stops are not expanded.
- The final `dist[dst]` is the cheapest destination cost found under the explored stop bound.

## Edge Cases

- If `dst` is never reached, `dist[dst]` remains `Integer.MAX_VALUE` and the method returns `-1`.
- Direct flights work when `k = 0`.
- Cycles are bounded by the stop limit and by requiring a cheaper cost before enqueueing.

## Complexity

- Time: $O(E \cdot k)$ in the intended bounded relaxation behavior.
- Space: $O(n + E)$ for the graph, distance array, and queue.

## Notes

- The submitted solution uses one global `dist` per city rather than distance by stop count. That is accepted here, but a stricter Bellman-Ford or `dist[stops][city]` formulation is easier to reason about for all constrained-shortest-path cases.
