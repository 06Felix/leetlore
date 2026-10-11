# Minimize the Maximum Difference of Pairs

## Idea
- Sort the values and binary-search a maximum allowed pair difference.
- For each threshold, greedily pair consecutive values when their gap qualifies, skipping both used indices; otherwise advance one position.

## Why It Works
- If the earliest two remaining values cannot pair, the smaller cannot pair with any later value either.
- If they can pair, an exchange can place them together without reducing the number of feasible pairs: any displaced partners can be paired or left unmatched without harming the achievable count.
- Larger thresholds cannot reduce feasible pair counts, so binary search finds the smallest threshold supporting at least `p` disjoint pairs.

## Edge Cases
- `p = 0` returns zero, and duplicate values can create zero-difference pairs.
- Skipping the second index of a selected pair prevents reuse. Search arithmetic fits `int` for values up to $10^9$.

## Complexity
- Time: $O(n\log n+n\log(R+1))$, where $R$ is the largest minus smallest value.
- Space: $O(\log n)$ sorting stack space, with constant auxiliary state in each scan.

## Notes
- Sorting changes the input array order in place.
