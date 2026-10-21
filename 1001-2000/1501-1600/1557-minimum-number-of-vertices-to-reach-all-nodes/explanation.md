# Minimum Number of Vertices to Reach All Nodes

## Idea
- Mark every vertex appearing as an edge destination.
- Return all unmarked vertices: exactly the vertices with zero indegree.

## Why It Works
- A zero-indegree vertex cannot be reached from another vertex, so every valid starting set must contain it.
- In a finite DAG, following incoming edges backward must eventually reach a zero-indegree vertex. Reversing that path shows every vertex is reachable from one of the selected starts.
- Thus these mandatory vertices also suffice, proving minimality.

## Edge Cases
- Isolated vertices are unmarked and must be selected.
- Multiple incoming edges only set the same boolean again; disconnected DAG components are handled independently.

## Complexity
- $O(n+E)$ time and $O(n)$ auxiliary space, plus the returned list.
- Correctness relies on the statement's acyclic-graph guarantee; the input edge list is unchanged.
