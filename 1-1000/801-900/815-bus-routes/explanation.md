# Bus Routes

## Idea
- Map each stop to all buses serving it. BFS over stops, with one layer representing boarding one additional bus.
- Expand each bus only once, enqueue all stops on that bus, and return the current layer count when a route reaches the target.

## Why It Works
- Once boarded, a cyclic bus route can reach any stop on that route without another boarding.
- BFS therefore explores stops in increasing number of buses taken, making the first target encounter optimal.
- A bus's first expansion already exposes all of its stops at the smallest possible boarding count; expanding it again cannot improve the answer.

## Edge Cases
- Identical source and target return zero even if no bus serves that stop.
- An unserved source or disconnected target eventually exhausts the queue and returns `-1`.

## Complexity
- Let $T$ be total route-stop entries and $d_s$ the number of routes serving stop $s$. Expected time is $O(T+\sum_s d_s^2)$, bounded by $O(TB)$ for $B$ buses.
- $O(T+B)$ auxiliary space for the stop map, queue, and used-bus set.

## Notes
- Stops are not marked visited and can be enqueued by multiple buses. Their entire bus lists are rescanned on each dequeue, so this implementation does not have the linear traversal bound of a stop-deduplicated BFS.
