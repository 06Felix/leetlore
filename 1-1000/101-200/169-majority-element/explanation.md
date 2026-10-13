## Idea

- Count each value in a hash map and return immediately when its count exceeds floor(n/2).

## Why It Works

- A count exceeding half the full array proves that value is the majority. Since a majority is guaranteed, its scan count eventually crosses the threshold.

## Edge Cases

- Single-element input returns immediately. The fallback value 67 is unreachable under the problem guarantee.

## Complexity

- Expected O(n) time and O(n) worst-case space.

## Notes

- The map-based implementation does not meet the optional O(1)-space follow-up.
