# Zero Array Transformation III

## Idea
- Sort queries by their left endpoint and scan indices in order.
- A max-heap holds unselected available query endpoints; a min-heap holds selected queries still covering the current index.
- When coverage is insufficient, select the available query extending farthest right. Return the number left unselected.

## Why It Works
- Any coverage deficit at the current index must be filled by a query whose start has already been reached.
- Among such queries, replacing another choice with the farthest-reaching one preserves current coverage and cannot hurt future coverage; earlier indices are already satisfied.
- This greedy choice minimizes the retained queries, so maximizing removals is equivalent to counting all unselected queries.

## Edge Cases
- Expired selected queries are removed before checking demand; expired unselected queries remain removable.
- If even the largest available endpoint precedes the current index, no query can fill its deficit and the result is `-1`. All starts have been encountered by the end of the scan.

## Complexity
- Time: $O(q\log q+n)$ for sorting and heap operations.
- Space: $O(q)$ for the two heaps and sorting workspace.

## Notes
- Sorting reorders the input queries in place; the values in `nums` are not modified.
- Surplus selected coverage is harmless because each index's decrement may be chosen independently.
