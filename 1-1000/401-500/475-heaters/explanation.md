# Explanation

## Idea
- Sort heater positions and binary-search each house's position.
- Measure distances to the neighboring heaters around its insertion point, then take the maximum nearest-heater distance across houses.

## Why It Works
- In sorted order, a house's nearest heater must be the first heater at or to its right or the preceding one.
- Every house needs at least its nearest distance as the common radius. The largest of these requirements both is necessary and covers all houses.

## Edge Cases
- An exact heater hit gives distance zero.
- A missing left or right heater is assigned `Integer.MAX_VALUE`, leaving the existing side to determine the nearest distance.

## Complexity
- Time: $O(H\log H + N\log H)$ for `H` heaters and `N` houses.
- Auxiliary space: sorting-dependent, bounded by $O(H)$; per-house processing uses constant storage.

## Notes
- Heater positions are sorted in place; house ordering is preserved.
