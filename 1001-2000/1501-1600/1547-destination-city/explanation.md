# Explanation

Problem: [Destination City](https://leetcode.com/problems/destination-city/)

## Idea

- Store every starting city in `st` and every ending city in `end`.
- The destination city is the ending city that never appears as a starting city.
- Scan the `end` list and return the first city absent from `st`.

## Why It Works

- Every non-destination city on the path has an outgoing edge, so it appears in `st`.
- The unique destination has no outgoing edge, so it cannot appear in `st`.
- Since the problem guarantees exactly one destination in a line-shaped graph, the scan over `end` finds and returns it.

## Edge Cases

- A single path `[A, Z]` returns `Z` because only `A` is in `st`.
- City names with spaces are compared as full strings.

## Complexity

- Time: $O(p^2)$ in the number of paths `p`, because `ArrayList.contains` is linear inside the scan.
- Space: $O(p)$.

## Notes

- A `HashSet` for starting cities would reduce the lookup portion to expected $O(p)$ total time, but the imported solution uses lists.
