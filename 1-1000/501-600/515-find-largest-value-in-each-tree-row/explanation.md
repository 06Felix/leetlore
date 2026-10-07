# Explanation

## Idea
- Traverse the tree with a queue, processing exactly the queue's starting size for each row.
- Track the maximum of those nodes, enqueue their children, and append the row maximum to the result.

## Why It Works
- Children enter behind all nodes of the current row, so the fixed-size inner loop visits one level at a time.
- Comparing every value on that level yields its maximum, and breadth-first processing returns maxima in increasing level order.

## Edge Cases
- A null root returns an empty list.
- Initializing each maximum to `Integer.MIN_VALUE` correctly handles all-negative rows and the smallest allowed node value.

## Complexity
- Time: $O(n)$, since each node is queued and visited once.
- Space: $O(w)$ for maximum width `w`, plus $O(h)$ for the returned list of `h` levels.
