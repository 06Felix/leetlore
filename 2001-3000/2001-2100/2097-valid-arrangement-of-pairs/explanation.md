# Explanation

## Idea
- Model pairs as directed edges and choose a start with outdegree minus indegree equal to one, or any edge's start for an Eulerian circuit.
- Consume outgoing edges recursively, append each edge after exploring its destination, and reverse the collected result.

## Why It Works
- Hierholzer's traversal consumes every edge once and records completed trails in reverse order.
- Reversal joins those trails into one continuous Eulerian arrangement; the existence guarantee supplies the necessary degree and connectivity conditions.

## Edge Cases
- A circuit permits an arbitrary start; an open trail must begin at the degree-imbalanced node.
- Nodes with no outgoing edges terminate recursion, and large node labels are supported by maps.

## Complexity
- Expected time: $O(E)$ with hash maps, including reversal and output conversion.
- Auxiliary space: $O(E + V)$ for adjacency, degrees, collected edges, and recursion.

## Notes
- Recursion can reach $E = 10^5$ depth and exhaust the Java stack. The imported implementation is preserved.
