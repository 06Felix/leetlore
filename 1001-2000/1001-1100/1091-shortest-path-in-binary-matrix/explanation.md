## Idea
- Reject a blocked endpoint and handle an open one-cell grid separately.
- BFS from the top-left cell with eight directions, tracking visited cells and processing one path-length layer at a time. Return when a neighbor is the destination.

## Why It Works
- Every move adds one visited cell, so BFS discovers destinations in increasing path length.
- Starting the count at one includes the entrance; marking cells when enqueued avoids duplicate exploration.

## Edge Cases
- A blocked start or finish returns -1; an open singleton returns one.
- Diagonal moves are allowed. Exhausting the queue means no clear path exists.

## Complexity
- O(n²) time because each cell is enqueued at most once and has eight neighbors.
- O(n²) auxiliary space for visited flags and the queue; grid is unchanged.

## Notes
- The destination comparison occurs before the neighbor validity checks. This is safe here because matching its coordinates is in bounds and the destination was already verified open.
