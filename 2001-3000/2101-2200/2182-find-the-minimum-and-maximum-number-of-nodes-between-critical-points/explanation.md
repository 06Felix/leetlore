# Find the Minimum and Maximum Number of Nodes Between Critical Points

## Idea

- Walk the list with previous, current, and next values available.
- Track the 1-based position `nn` of the current node.
- A node is critical when it is strictly less than both neighbors or strictly greater than both.
- Track first critical point, last critical point, and minimum adjacent critical distance.

## Why It Works

- Critical status depends only on immediate neighbors.
- The maximum distance must be between the first and last critical points.
- The minimum distance is found by comparing each new critical point with the previous one.
- If fewer than two critical points exist, both distances are invalid.

## Edge Cases

- Lists with fewer than three nodes have no critical points.
- Equal neighboring values do not create strict minima or maxima.
- Exactly two critical points make min and max distance equal.

## Complexity

- Time: $O(n)$.
- Space: $O(1)$.
