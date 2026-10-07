# Explanation

## Idea
- Count each node's incoming edges.
- Return the sole node with indegree zero, or `-1` when there is more than one.

## Why It Works
- Any node with an incoming edge has a stronger predecessor and cannot be champion.
- In a DAG, a node with a stronger ancestor necessarily has an incoming edge on that path; sources are exactly the undefeated candidates.
- A unique source is therefore the unique champion, while multiple sources give multiple undefeated teams.

## Edge Cases
- One team with no edges returns that team.
- An edgeless graph with multiple teams returns `-1`; the DAG guarantee rules out a nonempty graph with no source.

## Complexity
- Time: $O(n + E)$ for `n` teams and `E` edges.
- Auxiliary space: $O(n)$.
