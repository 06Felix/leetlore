# Reconstruct Itinerary

## Idea

- Build a graph from departure airport to a min-heap of arrival airports.
- Run DFS from `"JFK"`.
- Always consume the lexicographically smallest available outgoing ticket.
- Add airports to the front of the answer after all outgoing tickets are consumed.

## Why It Works

- This is Hierholzer's algorithm for an Eulerian path using all tickets once.
- The priority queues choose the smallest lexical edge whenever there is a choice.
- Adding nodes after exhausting outgoing edges correctly stitches cycles into the route.
- `addFirst` reverses the postorder into the final itinerary.

## Edge Cases

- Duplicate routes are handled as separate heap entries.
- Airports with no outgoing tickets finish immediately and are prepended.
- The problem guarantees at least one valid itinerary.

## Complexity

- Time: $O(E \log E)$ from heap inserts and polls.
- Space: $O(E)$ for graph and answer.
