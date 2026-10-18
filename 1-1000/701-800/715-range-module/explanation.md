# Range Module

## Idea

- Store disjoint half-open intervals in a TreeMap. Addition expands through touching predecessor/successor coverage and clears absorbed starts. Queries inspect the predecessor interval. Removal preserves any left and right fragments, then clears starts inside the removed span.

## Why It Works

- Only an interval starting at or before the left boundary can cover its first point. Merging all starts inside an expanded addition produces exactly its union. For removal, only boundary-crossing intervals can leave fragments; deleting interior starts removes the remaining overlap.

## Edge Cases

- Touching additions merge without introducing gaps. Removing a middle section splits an interval, and a query ending exactly at a stored right boundary succeeds.

## Complexity

- O(log M) per query and O((K + 1) log(M + 1)) conservative time per add/remove touching K intervals, for M stored intervals. Space is O(M).

## Notes

- TreeMap.subMap(left, right) excludes right, preserving a fragment starting at the removal endpoint. The actual source passed 5000 random differential operations on a bounded integer-endpoint domain.
