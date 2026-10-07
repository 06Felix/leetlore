# Explanation

## Idea
- Maintain a sliding window and count how many window elements contain each of 30 bit positions.
- Reconstruct its OR from all positions with positive counts.
- For each right endpoint, repeatedly record and shrink valid windows until the OR drops below `k` or the window becomes empty.

## Why It Works
- A bit is present in the OR exactly when at least one window element contains it, so counts permit correct removal as well as insertion.
- Adding nonnegative values cannot decrease OR, and removing them cannot increase it.
- Shrinking explores the shortest valid window for each right endpoint; discarded left endpoints cannot improve their already recorded length at a later endpoint.

## Edge Cases
- `k = 0` makes every nonempty window valid and yields length one.
- Zeros contribute no bits; if no valid window is found, return `-1`. Thirty bits cover all permitted values.

## Complexity
- Time: $O(30n) = O(n)$, since each endpoint advances at most `n` times.
- Auxiliary space: $O(30) = O(1)$.
