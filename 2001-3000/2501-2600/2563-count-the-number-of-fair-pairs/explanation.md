# Count the Number of Fair Pairs

## Idea
- Sort the input and count pairs with sum at most a bound using two pointers.
- Subtract the count at `lower - 1` from the count at `upper` to obtain the inclusive-range answer.

## Why It Works
- For a fixed left index, decrease the right endpoint until its sum qualifies. Every position between them then qualifies by sorted order, contributing `right - left` pairs.
- As the left value increases, the right endpoint never needs to increase, so each counting pass is linear.
- Sorting preserves the multiset of unordered pairs of original occurrences; each such pair corresponds to exactly one original pair with $i<j$.

## Edge Cases
- Duplicate and negative values are handled by the same ordering argument; arrays of length one contribute zero.
- Pair counts use `long`. Sums fit `int` within $[-2\cdot10^9,2\cdot10^9]$, and `lower - 1` is safe under the given bounds.

## Complexity
- Time: $O(n\log n)$ for sorting plus two $O(n)$ scans.
- Space: $O(\log n)$ sorting stack space; the counting passes use $O(1)$ extra space.

## Notes
- Sorting reorders the input array in place.
- The `int` sum and `lower - 1` arithmetic rely on the stated bounds; wider integer inputs could overflow.
