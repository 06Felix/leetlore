# Explanation

## Idea
- Separate each array into even and odd values and sort each parity group.
- Match values at corresponding positions, summing half their absolute differences, then halve that total to count operations.

## Why It Works
- Adding or subtracting two preserves parity, so only same-parity matching is possible.
- Sorted matching minimizes total absolute distance within each parity group; crossing two matches cannot improve that sum.
- Equal total sums balance increases and decreases. Each operation performs two units of change at each of two indices, so the minimum is the matched absolute-distance sum divided by four.

## Edge Cases
- Already matching parity-group multisets require zero operations.
- An empty parity group contributes nothing; feasibility guarantees corresponding group sizes match.

## Complexity
- Time: $O(n\log n)$ for sorting the four groups.
- Auxiliary space: $O(n)$ for the grouped lists and sorting storage.

## Notes
- The accumulated count uses `long`; each matched difference is even, so integer division by two is exact.
