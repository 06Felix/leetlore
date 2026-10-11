# Count Subarrays With Fixed Bounds

## Idea
- Track the last out-of-range index and the latest occurrences of `minK` and `maxK`.
- For each endpoint, add `max(0, min(lastMin, lastMax) - lastBad)`.

## Why It Works
- A valid start must lie after the last out-of-range value so every included value stays within the bounds.
- It must also be at or before both latest bound occurrences so the subarray contains its required minimum and maximum.
- These conditions define exactly the counted interval of starting positions for each endpoint.

## Edge Cases
- Missing bounds or occurrences before the last invalid value contribute zero without explicitly resetting their indices.
- When the bounds are equal, each matching value updates both indices; `long` stores the potentially quadratic answer.

## Complexity
- Time: $O(n)$ for one scan.
- Space: $O(1)$ auxiliary storage.
