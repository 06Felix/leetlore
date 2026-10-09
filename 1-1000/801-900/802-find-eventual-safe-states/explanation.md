## Idea
- Memoize each vertex as unseen (0), entered or unsafe (1), or safe (2).
- DFS reports a cycle-reachable path when it encounters state 1. Mark a vertex safe only after every outgoing neighbor is safe.
- Test vertices in index order and collect those whose DFS reports no cycle.

## Why It Works
- Encountering an active state-1 vertex closes a directed cycle. Returning early leaves every ancestor on that path in state 1, correctly remembering that it can reach a cycle.
- Thus a later encounter with state 1 means either an active cycle or an already proven unsafe vertex. A vertex reaches state 2 only when all continuations terminate safely.
- Iterating indices in order produces the required sorted result.

## Edge Cases
- Terminal vertices are safe; self-loops are unsafe.
- One path to a cycle makes a vertex unsafe even if another path reaches a terminal vertex.

## Complexity
- O(V + E) time and O(V) auxiliary space, including the recursive stack; the result can also contain V vertices.

## Notes
- A long path can require 10,000 recursive calls under the constraints and may overflow the Java stack.
