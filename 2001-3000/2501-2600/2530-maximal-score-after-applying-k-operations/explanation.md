# Explanation

## Idea
- Store all current values in a max-heap.
- Repeat exactly `k` times: remove the maximum, add it to the score, and reinsert its ceiling after division by three.

## Why It Works
- Each pile supplies a non-increasing sequence of rewards as it is selected repeatedly.
- The heap exposes the largest next reward among those sequences; selecting it merges the reward sequences in descending order.
- Taking the first `k` rewards maximizes the total while respecting the prerequisite selections within each pile.

## Edge Cases
- Values equal to one stay at one and can still supply rewards for remaining operations.
- Repeated maxima are interchangeable; the total uses `long` because the score can exceed `int`.

## Complexity
- Time: $O((n + k) \log(n + 1))$, including individual heap insertions.
- Auxiliary space: $O(n)$.

## Notes
- The existing heap stores `Double` values. Under the stated bounds, all stored values remain exactly representable integers, and `Math.ceil` implements the required replacement.
