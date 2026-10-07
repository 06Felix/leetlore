# Explanation

## Idea
- Count all three letters and reject if any total is below `k`.
- Find the longest contiguous middle substring that can remain untouched while the counts outside it still contain at least `k` of every letter.
- Subtract a letter from the outside count when extending the middle window, and restore letters from its left until the counts are feasible again.

## Why It Works
- Taking letters from the two ends leaves exactly one middle substring, and every such substring corresponds to a permitted choice of taken prefix and suffix.
- Only the newly removed letter's outside count can become infeasible, so the shrinking condition checks that letter.
- Maximizing the feasible untouched length minimizes the number of taken characters, computed as total length minus window length.

## Edge Cases
- `k = 0` allows the entire string to remain and returns zero.
- Missing required letters return `-1`; an empty retained window represents taking the whole string.

## Complexity
- Time: $O(n)$ because both window endpoints move only forward.
- Auxiliary space: $O(n)$ for `toCharArray()`, with $O(1)$ counters.
