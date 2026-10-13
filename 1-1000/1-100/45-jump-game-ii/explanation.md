## Idea

- Track the end of the current jump layer and the farthest position reachable from its indices. Count another jump when a layer ends, or immediately when its frontier can reach the destination.

## Why It Works

- Indices within the current boundary are reachable with the current number of jumps. Scanning them computes the next layer’s full frontier, equivalent to breadth-first search over contiguous reachability ranges. The first layer reaching the destination uses the minimum number of jumps.

## Edge Cases

- A one-element array returns zero. The statement guarantees reachability, so the frontier cannot stall before the destination.

## Complexity

- O(n) time and O(1) space.
