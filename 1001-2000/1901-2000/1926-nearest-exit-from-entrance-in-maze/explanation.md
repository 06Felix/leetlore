## Idea
- Run breadth-first search from the entrance using a queue and separate visited flags.
- Process one distance layer at a time. Return the next layer's distance as soon as an unvisited open neighbor lies on the boundary.
- Return -1 if the queue empties without finding an exit.

## Why It Works
- BFS visits cells in increasing distance from the entrance, so the first boundary neighbor found has minimum distance.
- Walls and out-of-bounds positions are rejected, and marking cells when enqueued prevents duplicate exploration.

## Edge Cases
- The entrance is marked visited immediately, so it is never counted as an exit even when it is on the boundary.
- An adjacent exit takes one step; an unreachable exit or no other open boundary cell returns -1.

## Complexity
- O(mn) time and O(mn) auxiliary space for the queue and visited matrix.

## Notes
- The maze itself is not modified.
