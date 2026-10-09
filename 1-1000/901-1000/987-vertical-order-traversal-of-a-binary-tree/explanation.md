## Idea
- Process one tree depth at a time using a priority queue ordered by column, then node value.
- Hold children in a separate list until the current depth is exhausted. Append values to column lists in a TreeMap and return its lists in column order.

## Why It Works
- Delaying child insertion preserves increasing row order within each column.
- The priority queue sorts equal-row, equal-column nodes by value; TreeMap supplies left-to-right column order.

## Edge Cases
- Nodes sharing a position are sorted by value, regardless of their parents' traversal order.
- A single node produces one column; negative column indices are handled by the map.

## Complexity
- O(n log n) time for priority-queue and ordered-map operations.
- O(n) auxiliary space for column lists, the queue, and buffered children.
