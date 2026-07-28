# Explanation

## Idea

First run Dijkstra using only fixed positive edges. Then handle `-1` edges one by one.

Each unknown edge is temporarily set to `1` and added to the graph. Once the shortest path becomes at most `target`, the current edge is increased enough to make the distance exactly `target`, and all remaining unknown edges are set to a huge value.

## Why It Works

If the fixed-edge shortest path is already below `target`, unknown positive edges cannot make it longer, so no solution exists.

If the fixed path equals `target`, all unknown edges can be made huge so they do not create a shorter route.

Otherwise, adding unknown edges with weight `1` gradually lowers the best possible distance. The first edge that makes the distance `<= target` can absorb the exact difference, making that chosen shortest path equal to `target`.

## Edge Cases

- Remaining unused `-1` edges become `2_000_000_000`.
- If no unknown edge can lower the distance enough, the method returns an empty array.
- Distances are stored in `int`; this matches the implementation but is close to the problem's large edge limit.

## Complexity

Time: `O(E * (E log V))` in the worst case because Dijkstra may run once per unknown edge.

Space: `O(V + E)`.
