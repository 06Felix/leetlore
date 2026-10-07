# Explanation

## Idea
- Put `[value, originalIndex]` pairs in a min-heap ordered by value and then index.
- Repeat `k` times: remove the smallest pair, multiply its value and corresponding array entry, and insert the updated pair again.

## Why It Works
- Each pair tracks its array entry's current value, so the heap always exposes the required minimum.
- The index tie-break selects the first occurrence. Updating the pair only after removal keeps heap ordering valid when it is reinserted.

## Edge Cases
- Equal minima are processed in increasing index order.
- With multiplier one, values remain unchanged; a one-element array repeatedly updates the same entry.

## Complexity
- Time: $O((n + k) \log(n + 1))$, since initial pairs are inserted individually.
- Auxiliary space: $O(n)$ for the heap and its pairs.

## Notes
- The returned array is the input array, modified in place.
