# Power Grid Maintenance

## Idea

- Build fixed components with union-find and a min-heap of station IDs per component. Merge the smaller component heap into the larger one. Offline queries set a flag; checks on offline stations lazily remove offline heap heads before returning the minimum live ID.

## Why It Works

- Connectivity never changes when stations go offline. Union-find therefore identifies the correct grid throughout. An online station answers for itself; otherwise discarded heap heads are permanently ineligible, and the first remaining ID is the smallest operational station.

## Edge Cases

- Repeated offline queries are harmless. An exhausted component heap returns -1; isolated stations follow the same logic.

## Complexity

- For c stations, e cables, and q queries, O(c log^2(c + 1) + (e + q) alpha(c) + q) amortized time. Small-to-large merging moves each ID O(log c) times. Space is O(c log(c + 1) + q), including retained heap capacities and results.

## Notes

- This implementation merges PriorityQueues element by element. Drained Java PriorityQueues retain their backing arrays, so retained capacity can exceed the O(c) live-element count. The map persists across calls and can retain entries for station IDs from larger earlier inputs.
