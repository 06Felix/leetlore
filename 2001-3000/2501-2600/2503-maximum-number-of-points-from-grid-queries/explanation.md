# Maximum Number of Points From Grid Queries

## Idea
- Sort indexed queries by increasing threshold and expand from the top-left cell using a min-heap of frontier cells.
- Pop and count cells with values strictly below the current threshold, enqueue unseen neighbors, and reuse the accumulated count for later queries.

## Why It Works
- Every enqueued cell is adjacent to an already counted cell, except the initial cell, so an eligible pop extends a valid reachable region.
- If the smallest frontier value reaches the threshold, no frontier cell can be crossed yet. The code reinserts that cell and pauses until a later query.
- Increasing thresholds only expand reachability. Marking cells when enqueued prevents duplicate points, and original query indices restore answer order.

## Edge Cases
- A threshold at or below the starting value yields zero; equality never qualifies.
- Small-valued cells behind a large barrier remain unreachable until that barrier becomes eligible. Repeated queries preserve the same accumulated count.

## Complexity
- Time: $O(k\log k + (mn + k)\log(mn + 1))$, including a possible pop/reinsert for each of $k$ queries.
- Space: $O(mn + k)$ for the frontier, visited grid, indexed queries, and answers.
