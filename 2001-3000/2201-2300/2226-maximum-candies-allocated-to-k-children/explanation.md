## Idea
- Sum all candies and binary-search a positive per-child allocation up to total / k.
- For a candidate size, count sum(floor(pile / size)) disjoint portions and test whether at least k children can be served.

## Why It Works
- A pile cannot contribute more than its floor quotient of portions, and forming that many portions is achievable without merging piles.
- Feasibility decreases with candidate size, so binary search finds the largest feasible allocation.

## Edge Cases
- Total less than k returns zero; total equal to k returns one because every candy can form a unit portion.
- Long holds total candies, search bounds, and portion counts for large k.

## Complexity
- O(n log(total / k + 1)) time, including the initial sum.
- O(1) auxiliary space; candies is unchanged.
