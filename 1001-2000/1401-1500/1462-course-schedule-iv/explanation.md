# Explanation

## Idea
- Build adjacency lists for prerequisite-to-course edges.
- Run BFS from each course, storing reachable courses in its row of a boolean table.
- Answer every query from that table.

## Why It Works
- Direct edges and all longer directed paths describe exactly the direct and indirect prerequisites.
- Each source BFS marks every reachable course once and explores its outgoing edges; query lookup therefore reports precisely the prerequisite relation.

## Edge Cases
- An empty prerequisite graph gives false for every distinct-course query.
- Multiple paths to one course do not enqueue it repeatedly after its reachability flag is set.

## Complexity
- Time: $O(n(n + E) + q)$ for `n` courses, `E` prerequisites, and `q` queries.
- Space: $O(n^2 + E + n)$ for reachability, adjacency, and the queue, plus $O(q)$ returned answers.
