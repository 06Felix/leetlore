# Maximum Difference Between Adjacent Elements in a Circular Array

## Idea
- Compare each value with the next value, using remainder indexing to wrap the last position to zero.
- Track the largest absolute difference.

## Why It Works
- The loop visits every circular adjacency, including the last-to-first edge.
- Taking the maximum of these exact differences directly gives the required result.

## Edge Cases
- A two-element array checks the same undirected adjacency twice, without affecting the maximum.
- Negative values and equal neighbors are handled by absolute value; arithmetic fits `int` under the bounds.

## Complexity
- Time: $O(n)$ for one scan.
- Space: $O(1)$ auxiliary storage.
