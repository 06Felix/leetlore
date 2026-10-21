# Contains Duplicate II

## Idea
- Keep the latest index of every encountered number in a hash map.
- Inserting the current index returns the previous index, if any. Return `true` when their distance is at most `k`.

## Why It Works
- Among earlier equal values, the most recent occurrence is the nearest to the current index.
- If even that occurrence is too far away, every older occurrence is too far away too; otherwise it immediately supplies a valid pair.

## Edge Cases
- `k = 0` cannot match distinct indices and returns `false`.
- Repeated values overwrite their previous index, ensuring later checks use the closest candidate.

## Complexity
- Expected $O(n)$ time and $O(u)$ auxiliary space, where $u$ is the number of distinct values seen.
- The map is not restricted to the last `k` positions; the input is unchanged.
